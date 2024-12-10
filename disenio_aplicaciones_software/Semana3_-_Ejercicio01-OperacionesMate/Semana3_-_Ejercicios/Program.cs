using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace Semana3___Ejercicios
{
    class Program
    {

        // Metodos
        public static void sumar(int n1, int n2)
        {
            Console.WriteLine("El resultado es " + (n1 + n2));
        }
        public static void restar(int n1, int n2)
        {
            Console.WriteLine("El resultado es " + (n1 - n2));
        }
        public static void multiplicar(int n1, int n2)
        {
            Console.WriteLine("El resultado es " + (n1 * n2));
        }
        public static void dividir(int n1, int n2)
        {
            if (hayCeroD(n1))
            {
                Console.WriteLine("Operacion NO valida");
            }
            else
            {
                Console.WriteLine("El resultado es " + (n1 / n2));
            }
            
        }

        public static bool hayCeroD(int n1)
        {
            return (n1 == 0);
        }

        // MAIN
        static void Main(string[] args)
        {

            int valor1 = 0;
            int valor2 = 0;

            // Program varios = new Program();

            Console.WriteLine("Indicar valor 1");
            valor1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Indicar valor 2");
            valor2 = Convert.ToInt32(Console.ReadLine());

            sumar(valor1, valor2);


        }

    }
}
