using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppSoftware_Biblioteca.Models
{
    public class EstudianteModel
    {

        private int codigoEstudiante;
        private string nombre1;
        private string nombre2;
        private string apellido1;
        private string apellido2;
        private string tipoIdentidad;
        private string cedula;
        private string numeroPasaporte;
        private string cedulaResidente;
        private string telefono;
        private string direccion;
        private string correo;
        private string contrasenia;

        public EstudianteModel(int codigoEstudiante, string nombre1, string nombre2, string apellido1, string apellido2, string tipoIdentidad, string cedula, string numeroPasaporte, string cedulaResidente, string telefono, string direccion, string correo, string contrasenia)
        {
            this.codigoEstudiante = codigoEstudiante;
            this.nombre1 = nombre1;
            this.nombre2 = nombre2;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.tipoIdentidad = tipoIdentidad;
            this.cedula = cedula;
            this.numeroPasaporte = numeroPasaporte;
            this.cedulaResidente = cedulaResidente;
            this.telefono = telefono;
            this.direccion = direccion;
            this.correo = correo;
            this.contrasenia = contrasenia;
        }

        public int CodigoEstudiante
        {
            get { return codigoEstudiante; }
            set { codigoEstudiante = value; }
        }

        public string Nombre1
        {
            get { return nombre1; }
            set { nombre1 = value; }
        }

        public string Nombre2
        {
            get { return nombre1; }
            set { nombre2 = value; }
        }

        public string Apellido1
        {
            get { return apellido1; }
            set { apellido1 = value; }
        }

        public string Apellido2
        {
            get { return apellido2; }
            set { apellido2 = value; }
        }

        public string TipoIdentidad
        {
            get { return tipoIdentidad; }
            set { tipoIdentidad = value; }
        }

        public string Cedula
        {
            get { return cedula; }
            set { cedula = value; }
        }

        public string NumeroPasaporte
        {
            get { return numeroPasaporte; }
            set { numeroPasaporte = value; }
        }

        public string CedulaResidente
        {
            get { return cedulaResidente; }
            set { cedulaResidente = value; }
        }

        public string Telefono
        {
            get { return telefono; }
            set { telefono = value; }
        }

        public string Direccion
        {
            get { return direccion; }
            set { direccion = value; }
        }

        public string Correo
        {
            get { return correo; }
            set { correo = value; }
        }

        public string Contrasenia
        {
            get { return contrasenia; }
            set { contrasenia = value; }
        }

    }
}
