using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___ForoTarea4
{
    class Program
    {
        static void Main(string[] args)
        {

            // Ejemplo #1: Herencia
            Animal animal_1 = new Animal(true, "Hembra");
            Perro animal_2 = new Perro(true, "Macho", "Labrador");
            Pez animal_3 = new Pez(false, "Hembra", "Agua dulce");
            Perro animal_4 = new Perro(true, "Hembra", "Pastor Aleman");

            // Impresion de Ejemplos de Herencia
            Console.WriteLine("Ejemplo de herencia: Animal --> " + animal_1.Vivo + ", " + animal_1.Genero);
            Console.WriteLine("Ejemplo de herencia: Animal --> " + animal_2.Vivo + ", " + animal_2.Genero + ", " + animal_2.Raza + ".");
            Console.WriteLine("Ejemplo de herencia: Animal --> " + animal_3.Vivo + ", " + animal_3.Genero + ", " + animal_3.TipoAgua + ".");
            Console.WriteLine();
            Console.WriteLine();

            // Ejemplo #2: Polimorfismo
            Console.WriteLine("Ejemplo de Polimorfismo --> para el perro");
            animal_2.sonidoAnimal();
            Console.WriteLine();
            Console.WriteLine("Ejemplo de Polimorfismo --> para el pez");
            animal_3.sonidoAnimal();

            // Ejemplo #3: Override
            Console.WriteLine("Ejemplo de Override --> Perro");
            animal_4.decirUbicacion();

            // Paso para que no se ejecute el codigo de forma inmediata.
            Console.ReadLine();

        }
    }
}
