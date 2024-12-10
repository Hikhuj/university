using System;

namespace Semana4__HerenciaPolimofismo
{
    class MainClass
    {
        public static void Main(string[] args)
        {


            Alumno a1 = new Alumno();
            Persona p1 = new Persona();

            a1.Leer();
            p1.Leer();

            Console.ReadLine();

        }
    }
}
