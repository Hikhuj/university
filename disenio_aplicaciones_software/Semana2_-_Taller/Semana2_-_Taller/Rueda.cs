using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RogerJoseUlateRivera___App_Composicion
{
    class Rueda
    {

        private int diametro;
        private int cantidadTuercas;

        // Constructor
        public Rueda() { }

        public Rueda(int diametro, int cantidadTuercas)
        {
            this.diametro = diametro;
            this.cantidadTuercas = cantidadTuercas;
        }

        // Set & Get
        public int Diametro
        {
            get { return diametro;}
            set
            {
                // value es una palabra reservada para asignar el valor que se da por el SETTER al atributo de la clase.
                diametro = value;
            }
        }

        public int CantidadTuercas
        {
            get { return cantidadTuercas;  }
            set { cantidadTuercas = value;  }
        }

        public string IndicaDiametro()
        {
            return "Diametro de rueda es " + diametro;
        }

    }
}
