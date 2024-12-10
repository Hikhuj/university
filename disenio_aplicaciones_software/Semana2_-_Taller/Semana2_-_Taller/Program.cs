using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___App_Composicion
{
    class Program
    {
        static void Main(string[] args)
        {

            // Call
            Automovil miAuto = new Automovil("BJC-980", 
                                            "Azul", 
                                            "Honda",
                                            new Chasis(1200,1400,"Metal"),
                                            new Motor(2500,"Gasolina",200),
                                            new Rueda(220,5),
                                            new Rueda(220,5),
                                            new Rueda(220,5),
                                            new Rueda(220,5));

            Console.WriteLine(miAuto.PropRueda1Der.IndicaDiametro());
            string nombre = Console.ReadLine();
            Console.WriteLine("Adios " + nombre);
            

        }
    }
}
