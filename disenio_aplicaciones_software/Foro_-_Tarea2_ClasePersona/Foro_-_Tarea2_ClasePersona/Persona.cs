using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Persona
    {

        private string identidad;
        private string nombre;
        private float efectivo;
        private int edad;

        public Persona(string identidad, string nombre, int edad)
        {
            this.identidad = identidad;
            this.nombre = nombre;
            this.efectivo = 0;
            this.edad = edad;
        }

        public void presentarse(string nombreDeOtro)
        {
            Console.WriteLine("Mucho gusto, " + nombreDeOtro + " mi nombre es: " + nombre);
        }

        public void digaNombre()
        {
            Console.WriteLine("Hola " + nombre + ", tienes " + edad + " años de edad.");
        }
        public string pasaNombre()
        {
            return nombre;
        }

        public void digaEfectivo()
        {
            Console.WriteLine("Su efectivo es: " + efectivo);
        }

        public void darEfectivo(float monto)
        {
            efectivo += monto;
        }
    }
}
