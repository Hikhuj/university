using System;
using System.ComponentModel;
using System.Linq;
using System.Runtime.CompilerServices;

namespace ProyectoFinal.Model
{
    //Clase base de las propiedades
    public class PropiedadModel : INotifyPropertyChanged
    {
        #region variables
        private string lugar;
        //variable que el usuario habilita para el alquiler
        private bool habilitada;
        private string usuario;
        private string titulo;
        private string descripcion;
        private string localizacion;
        private int precio;
        private string imagenURL;
        private int iDCasa;
        private string cuartos;
        private string banios;
        private string cochera;
        #endregion



        #region constructores

        public PropiedadModel() { }

        public PropiedadModel(PropiedadModel propiedad)
        {
            this.lugar = propiedad.Lugar;
            this.habilitada = propiedad.Habilitada;
            this.usuario = propiedad.Usuario;
            this.titulo = propiedad.Titulo;
            this.descripcion = propiedad.Descripcion;
            this.localizacion = propiedad.localizacion;
            this.precio = propiedad.Precio;
            this.imagenURL = propiedad.ImagenURL;
            this.iDCasa = propiedad.IDCasa;
            this.cuartos = propiedad.Cuartos;
            this.banios = propiedad.Banios;
            this.cochera = propiedad.cochera;
        }

        public PropiedadModel(string lugar, bool habilitada, string usuario, string titulo,
            string descripcion, string localizacion, int precio, string imagenURL, int iDCasa,
            string cuartos, string banios, string cochera)
        {
            this.lugar = lugar;
            this.habilitada = habilitada;
            this.usuario = usuario;
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.localizacion = localizacion;
            this.precio = precio;
            this.imagenURL = imagenURL;
            this.iDCasa = iDCasa;
            this.cuartos = cuartos;
            this.banios = banios;
            this.cochera = cochera;
        }
        #endregion

        #region constructores

        public string Usuario {
            get => usuario;
            set
            {
                usuario = value;
                OnPropertyChanged();
            }
        }

        public string Titulo
        {
            get => titulo;
            set
            {
                titulo = value;
                OnPropertyChanged();
            }
        }

        public int IDCasa
        {
            get => iDCasa;
            set
            {
                iDCasa = value;
                OnPropertyChanged();
            }
        }

        public string Descripcion
        {
            get => descripcion;
            set
            {
                descripcion = value;
                OnPropertyChanged();
            }
        }

        public string Localizacion
        {
            get => localizacion;
            set
            {
                localizacion = value;
                OnPropertyChanged();
            }
        }

        public int Precio
        {
            get => precio;
            set
            {
                precio = value;
                OnPropertyChanged();
            }
        }

        public string ImagenURL
        {
            get => imagenURL;
            set
            {
                imagenURL = value;
                OnPropertyChanged();
            }
        }

        public string Lugar
        {
            get => lugar;
            set
            {
                lugar = value;
                OnPropertyChanged();
            }
        }


        public bool Habilitada
        {
            get => habilitada;
            set
            {
                habilitada = value;
                OnPropertyChanged();
            }
        }

        public string Cuartos {
            get => cuartos;
            set {
                cuartos = value;
                OnPropertyChanged();
            }
        }
        public string Banios {
            get => banios;
            set {
                banios = value;
                OnPropertyChanged();
            }
        }

        public string Cochera {
            get => cochera;
            set {
                cochera = value;
                OnPropertyChanged();
            }
        }

        #endregion

        public string Mostrar()
        {
            return "" + usuario + " " +  iDCasa + " " +  lugar + " " + descripcion + " " + precio + " " + habilitada + " " + Usuario;
        }

        #region Interfase PropertyChanged

        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged([CallerMemberName] string propertyName = null)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion
    }
}
