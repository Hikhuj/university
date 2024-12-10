using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

            Persona p1 = new Persona("1234","Roger",30);
            Persona p2 = new Persona("5678","Javier",50);
            Trabajador t1 = new Trabajador("1212", "Michael",25,250000);

            p1.digaNombre();
            p2.digaNombre();

            p1.darEfectivo(100.0F);
            p2.darEfectivo(500.0F);

            p1.presentarse(p2.pasaNombre());
            p2.presentarse(p1.pasaNombre());

            Console.ReadLine();

        }
    }
}
