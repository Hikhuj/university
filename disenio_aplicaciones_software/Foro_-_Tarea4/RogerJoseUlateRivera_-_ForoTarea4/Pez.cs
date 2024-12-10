using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___ForoTarea4
{
    class Pez: Animal
    {

        private String tipoAgua;

        // Constructor
        public Pez(Boolean vivo, String genero, String tipoAgua): base(vivo,genero)
        {
            this.tipoAgua = tipoAgua;
        }

        public String TipoAgua
        {
            get { return tipoAgua; }
            set { tipoAgua = value; }
        }

        public override void sonidoAnimal()
        {
            Console.WriteLine("El pez no hace ningun sonido.");
            base.sonidoAnimal();
        }

    }
}
