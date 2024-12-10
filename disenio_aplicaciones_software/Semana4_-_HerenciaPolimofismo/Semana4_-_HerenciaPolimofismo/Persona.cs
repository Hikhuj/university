using System;
namespace Semana4__HerenciaPolimofismo
{
    public class Persona
    {
        private string id;
        private string nombre;

        public virtual void Leer()
        {
            Console.WriteLine("Indique id");
            id = Console.ReadLine();

            Console.WriteLine("Indique nombre");
            nombre = Console.ReadLine();
        }
    }
}
