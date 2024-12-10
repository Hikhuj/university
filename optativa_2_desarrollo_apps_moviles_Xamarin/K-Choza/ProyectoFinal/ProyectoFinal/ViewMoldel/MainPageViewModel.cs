using System;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;
using System.Windows.Input;
using ProyectoFinal.Model;
using ProyectoFinal.View;
using Xamarin.Forms;
using System.Linq;
using ProyectoFinal.DatabaseQ;

namespace ProyectoFinal.ViewMoldel
{
    public class MainPageViewModel : INotifyPropertyChanged
    {

        //private ObservableCollection<PropiedadModel> alquilerLista;
        //public ObservableCollection<PropiedadModel> ListaAlquiler_Llena

        //{
        //    get { return alquilerLista; }
        //    set
        //    {

        //        alquilerLista = value;
        //    }
        //}

        public ObservableCollection<PropiedadModel> ListaAlquiler_Variable { get; set; }

        public ICommand SearchCommand { get; set; }

        public MainPageViewModel()
        {

            ListaAlquiler_Variable = new ObservableCollection<PropiedadModel>(Globals.listaCasas);

            SearchCommand = new Command(async (busqueda) =>
            {
                if (string.IsNullOrWhiteSpace(busqueda as string))
                {
                    busqueda = string.Empty;
                }
                busqueda = (busqueda as string).ToLowerInvariant();
                var alquileres = Globals.listaCasas.Where(x => x.Localizacion.ToLowerInvariant().Contains((busqueda as string).Trim().ToLower())).ToList();

                if (string.IsNullOrWhiteSpace(busqueda as string))
                {
                    alquileres = Globals.listaCasas.ToList();
                }
                foreach (var value in Globals.listaCasas)
                {
                    if (!alquileres.Contains(value))
                    {
                        ListaAlquiler_Variable.Remove(value);
                    }
                    else if (!Globals.listaCasas.Contains(value))
                    {
                        ListaAlquiler_Variable.Add(value);
                    }
                }

            });

            //SearchCommand = new Command<string>(buscarPropiedades);
        }

        //public void buscarPropiedades(string textoBusqueda)
        //{

        //}


        public event PropertyChangedEventHandler PropertyChanged;


        protected void OnPropertyChanged([CallerMemberName] string propertyName = null)

        {

            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));

        }
    }
}