using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___App_Composicion
{
    class Motor
    {

        private int cilindrada;
        private string tipoCombustible;
        private int potencia;

        // Constructor
        public Motor() { }

        public Motor(int cilindrada, string tipoCombustible, int potencia)
        {
            this.cilindrada = cilindrada;
            this.tipoCombustible = tipoCombustible;
            this.potencia = potencia;
        }

        // Set & Get
        public int Cilindrada
        {
            get { return cilindrada; }
            set { cilindrada = value; }
        }

        public string TipoCombustible
        {
            get { return tipoCombustible; }
            set { tipoCombustible = value; }
        }

        public int Potencia
        {
            get { return potencia; }
            set { potencia = value; }
        }

        public string SonidoArranca()
        {
            return "Rummmmm Rummmmm";
        }

    }
}
