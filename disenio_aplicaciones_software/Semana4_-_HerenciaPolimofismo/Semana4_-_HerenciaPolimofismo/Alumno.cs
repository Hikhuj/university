using System;
namespace Semana4__HerenciaPolimofismo
{
    public class Alumno : Persona
    {
        private String curso;

        /*
        public void Leer()
        {
            Console.WriteLine("Indique curso");
            curso = Console.ReadLine();
        }
        */

        public override void Leer()
        {
            Console.WriteLine("Indique curso");
            curso = Console.ReadLine();
        }



    }
}
