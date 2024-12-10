using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___App_Composicion
{
    class Chasis
    {

        private int largo;
        private int ancho;
        private string codMaterial;

        // Constructor
        public Chasis() { }

        public Chasis(int largo, int ancho, string codMaterial)
        {
            this.largo = largo;
            this.ancho = ancho;
            this.codMaterial = codMaterial;
        }

        // Set & Get
        public int Largo
        {
            get { return largo; }
            set { largo = value; }
        }

        public int Ancho
        {
            get { return ancho; }
            set { ancho = value; }
        }

        public string CodMaterial
        {
            get { return codMaterial; }
            set { codMaterial = value; }
        }

    }
}
