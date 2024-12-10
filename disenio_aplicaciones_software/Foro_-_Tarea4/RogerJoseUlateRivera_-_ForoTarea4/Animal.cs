using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___ForoTarea4
{
    class Animal
    {
        private Boolean vivo;
        private String genero;

        // Constructor
        public Animal(){}

        public Animal(Boolean vivo, String genero)
        {
            this.vivo = vivo;
            this.genero = genero;
        }

        // Metodos
        public Boolean Vivo
        {
            get { return vivo; }
            set { vivo = value; }
        }

        public String Genero
        {
            get { return genero; }
            set { genero = value; }
        }

        public virtual void sonidoAnimal()
        {

        }

        // Metodo para Override
        public virtual void decirUbicacion(){
            Console.WriteLine("Ejemplo de ubicacion desde la clase Animal (Padre)");
        }

    }
}
