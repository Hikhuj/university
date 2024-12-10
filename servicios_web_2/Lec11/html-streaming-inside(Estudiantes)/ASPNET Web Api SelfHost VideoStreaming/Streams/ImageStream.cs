using System.IO;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace ASPNET_Web_Api_SelfHost_VideoStreaming.Streams
{
    internal class ImageStream
    {
        // El HintDesk es un texto asociado
        public object Boundary { get; set; } = "HintDesk";

        // Vamos a hacer una tarea async
        // hacemos una funcion async para una funcion anonima para trabajar con camara
        public async Task WriteToStream(Stream outputStream, HttpContent content, TransportContext context)
        {
            // arreglo de bytes
            byte[] newLine = Encoding.UTF8.GetBytes("\r\n");
            // con el arroba obtenemos la carpeta de que ocupamos, en este caso la que aparece ahi
            foreach (var file in Directory.GetFiles(@"TestData\Images", "*.jpg"))
            {
                // vamos a tratar de extraer la info de donde dijimos
                var fileInfo = new FileInfo(file);
                var header = $"--{Boundary}\r\nContent-Type: image/jpeg\r\nContent-Length:{fileInfo.Length}\r\n\r\n";
                // Encabezado que tiene los datos para leer
                var headerData = Encoding.UTF8.GetBytes(header);
                // Tamanio inicial de 0 y final del propio header
                await outputStream.WriteAsync(headerData, 0, headerData.Length);
                await fileInfo.OpenRead().CopyToAsync(outputStream);
                await outputStream.WriteAsync(newLine, 0, newLine.Length);
                // Un segundo de 30
                await Task.Delay(1000/30);
            }
        }
    }
}