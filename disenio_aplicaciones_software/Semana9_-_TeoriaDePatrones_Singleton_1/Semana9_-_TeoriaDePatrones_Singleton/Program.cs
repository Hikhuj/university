using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semana9___TeoriaDePatrones_Singleton
{
    class Program
    {
        static void Main(string[] args)
        {
            // La idea es crear el objeto hasta que sea necesario
            Console.WriteLine(Singleton.Instance.mensaje);

            Singleton.Instance.mensaje = "Hola martes patrón Singleton.";

            Console.WriteLine(Singleton.Instance.mensaje);

        }
    }
}
