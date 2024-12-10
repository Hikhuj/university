using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___App_Composicion
{
    class Automovil
    {

        private string placa;
        private string color;
        private string marca;
        private Chasis miChasis = new Chasis();
        private Motor miMotor = new Motor();
        private Rueda rueda1der = new Rueda();
        private Rueda rueda1izq = new Rueda();
        private Rueda rueda2der = new Rueda();
        private Rueda rueda2izq = new Rueda();

        // Constructores
        public Automovil() { }

        public Automovil(string laPlaca, 
                        string elColor, 
                        string laMarca, 
                        Chasis elChasis,
                        Motor elMotor,
                        Rueda rueda1derecha,
                        Rueda rueda1izquierda,
                        Rueda rueda2derecha,
                        Rueda rueda2izquierda)
        {
            placa = laPlaca;
            color = elColor;
            marca = laMarca;
            miChasis = elChasis;
            miMotor = elMotor;
            rueda1der = rueda1derecha;
            rueda1izq = rueda1izquierda;
            rueda2der = rueda2derecha;
            rueda2izq = rueda2izquierda;
        }

        // Set & Get
        public string Placa
        {
            get { return placa; }
            set { placa = value; }
        }

        public string Color
        {
            get { return color; }
            set { color = value; }
        }

        public string Marca
        {
            get { return marca; }
            set { marca = value; }
        }

        public Chasis PropChasis
        {
            get { return miChasis; }
            set { miChasis = value; }
        }

        public Motor PropMotor
        {
            get { return miMotor; }
            set { miMotor = value; }
        }

        public Rueda PropRueda1Der
        {
            get { return rueda1der; }
            set { rueda1der = value; }
        }

        public Rueda PropRueda1Izq
        {
            get { return rueda1izq; }
            set { rueda1izq = value; }
        }

        public Rueda PropRueda2Der
        {
            get { return rueda2der; }
            set { rueda2der = value; }
        }

        public Rueda PropRueda2Izq
        {
            get { return rueda2izq; }
            set { rueda2izq = value; }
        }


    }
}


