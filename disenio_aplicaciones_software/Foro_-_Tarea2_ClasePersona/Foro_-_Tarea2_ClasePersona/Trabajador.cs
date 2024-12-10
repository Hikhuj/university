using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Trabajador: Persona
    {
        public int sueldo;

        public Trabajador(string identidad, string nombre, int edad, int sueldo): base(identidad,nombre,edad)
        {
            this.sueldo = sueldo;
        }

    }
}
