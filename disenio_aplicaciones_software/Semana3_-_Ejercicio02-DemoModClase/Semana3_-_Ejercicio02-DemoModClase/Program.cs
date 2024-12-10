using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semana3___Ejercicio02_DemoModClase
{
    class Program
    {
        static void Main(string[] args)
        {

            Cuenta c1 = new Cuenta("9910", 10000);

            c1.Depositar(15000);
            c1.Retirar(50000);

            c1.DiceSaldo();

            Console.ReadLine();

        }
    }
}
