using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___ForoTarea4
{
    class Perro: Animal
    {

        private String raza;

        public Perro(Boolean vivo, String genero, String raza): base(vivo, genero)
        {
            this.raza = raza;
        }

        public String Raza
        {
            get { return raza; }
            set { raza = value; }
        }

        public override void sonidoAnimal()
        {
            Console.WriteLine("El perro ladra.");
            // base.sonidoAnimal();
        }

        // Metodo para Override
        public override void decirUbicacion(){
            base.decirUbicacion();
            Console.WriteLine("Ejemplo de Override en clase Animal: Perro");
        }

    }
}
