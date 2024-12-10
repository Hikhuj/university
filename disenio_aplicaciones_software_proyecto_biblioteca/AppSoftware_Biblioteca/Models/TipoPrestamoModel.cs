using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class TipoPrestamoModel
    {

        private int codigoTipoPrestamo;
        private string tipoPrestamo;

        public TipoPrestamoModel(int codigoTipoPrestamo, string tipoPrestamo)
        {
            this.codigoTipoPrestamo = codigoTipoPrestamo;
            this.tipoPrestamo = tipoPrestamo;
        }

        public int CodigoTipoPrestamo
        {
            get { return codigoTipoPrestamo; }
            set { codigoTipoPrestamo = value; }
        }

    }
}
