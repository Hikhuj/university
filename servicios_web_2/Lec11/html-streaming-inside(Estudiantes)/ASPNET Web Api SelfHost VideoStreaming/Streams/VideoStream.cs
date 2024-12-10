using System;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;

namespace ASPNET_Web_Api_SelfHost_VideoStreaming.Streams
{
    internal class VideoStream
    {
        private readonly string videoName;

        // Creamos un constructor
        public VideoStream(string videoName)
        {
            this.videoName = videoName;
        }

        // Creamos la tarea async para el video
        public async Task WriteToStream(Stream outputStream, HttpContent content, TransportContext context)
        {
            string videoFileName = "Test\\Videos" + videoName + ".mp4";
            try
            {
                var buffer = new byte[65536];
                using (var video = File.Open(videoFileName, FileMode.Open, FileAccess.Read))
                {
                    var length = (int)video.Length;
                    var bytesRead = 1;
                    while (length > 0 && bytesRead > 0)
                    {
                        // Para que el buffer sea menor para que pueda pasarse
                        bytesRead = video.Read(buffer, 0, Math.Min(length,buffer.Length));
                        await outputStream.WriteAsync(buffer, 0, bytesRead);
                        length -= bytesRead;
                    }
                }
            }
            catch (Exception ex)
            {
                return;
            }
            finally
            {
                // por si da problemas entonces que lo cierre.
                outputStream.Close();
            }
        }
    }
}