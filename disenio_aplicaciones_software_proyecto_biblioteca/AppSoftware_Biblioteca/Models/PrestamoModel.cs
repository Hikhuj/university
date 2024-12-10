using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class PrestamoModel
    {

        private int codigoPrestamo;
        private int codigoExistencia;
        private int codigoEstudiante;
        private DateTime fechaPrestamo;
        private DateTime fechaRetorno;
        private DateTime fechaRealRetorno;
        private int codigoTipoPrestamo;
        private int multa;

        public PrestamoModel(int codigoPrestamo, int codigoExistencia, int codigoEstudiante, DateTime fechaPrestamo, DateTime fechaRetorno, DateTime fechaRealRetorno, int codigoTipoPrestamo, int multa)
        {
            this.codigoPrestamo = codigoPrestamo;
            this.codigoExistencia = codigoExistencia;
            this.codigoEstudiante = codigoEstudiante;
            this.fechaPrestamo = fechaPrestamo;
            this.fechaRetorno = fechaRetorno;
            this.fechaRealRetorno = fechaRealRetorno;
            this.codigoTipoPrestamo = codigoTipoPrestamo;
            this.multa = multa;
        }

        public int CodigoPrestamo
        {
            get { return codigoPrestamo;}
            set { codigoPrestamo = value;}
        }

        public int CodigoExistencia
        {
            get { return codigoExistencia; }
            set { codigoExistencia = value;}
        }

        public int CodigoEstudiante
        {
            get { return codigoEstudiante; }
            set { codigoEstudiante = value;}
        }

        public DateTime FechaPrestamo
        {
            get { return fechaPrestamo; }
            set { fechaPrestamo = value;}
        }

        public DateTime FechaRetorno
        {
            get { return fechaRetorno; }
            set { fechaRetorno = value;}
        }

        public DateTime FechaRealRetorno
        {
            get { return fechaRealRetorno; }
            set { fechaRealRetorno = value;}
        }

        public int CodigoTipoPrestamo
        {
            get { return codigoTipoPrestamo; }
            set { codigoTipoPrestamo = value;}
        }

        public int Multa
        {
            get { return multa; }
            set { multa = value;}
        }

    }
}
