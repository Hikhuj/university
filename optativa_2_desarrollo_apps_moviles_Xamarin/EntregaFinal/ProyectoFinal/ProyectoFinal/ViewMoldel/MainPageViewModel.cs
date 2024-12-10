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

namespace ProyectoFinal.ViewMoldel
{
    public class MainPageViewModel : INotifyPropertyChanged
    {
        private INavigation Navigation;

        private ObservableCollection<AlquilerModel> alquilerLista;
        public ObservableCollection<AlquilerModel> ListaAlquiler_Llena

        {
            get { return alquilerLista; }
            set
            {

                alquilerLista = value;
            }
        }

        public ObservableCollection<AlquilerModel> ListaAlquiler_Variable {get; set;}

        public ICommand SearchCommand { get; set; }

        public MainPageViewModel()
        {

            ListaAlquiler_Llena = new ObservableCollection<AlquilerModel>() {
                new AlquilerModel()
                {
                    titulo = "Casa en Santa Ana",
                    localizacion = "Santa Ana, Escazu",
                    descripcion = "Casa en condominio",
                    imagenURL= "https://www.rocketmortgage.com/resources-cmsassets/RocketMortgage.com/Article_Images/Large_Images/TypesOfHomes/types-of-homes-hero.jpg"
                },
                new AlquilerModel()
                {
                    titulo = "Amplio apartamento en heredia",
                    localizacion = "Santo Domingo, Heredia",
                    descripcion = "Apartamento en torre",
                    imagenURL="https://www.rocketmortgage.com/resources-cmsassets/RocketMortgage.com/Article_Images/Large_Images/TypesOfHomes/types-of-homes-hero.jpg"
                },
                                new AlquilerModel()
                {
                    titulo = "Casa en Santa Ana",
                    localizacion = "Santa Ana, Escazu",
                    descripcion = "Casa en condominio",
                    imagenURL= "https://www.rocketmortgage.com/resources-cmsassets/RocketMortgage.com/Article_Images/Large_Images/TypesOfHomes/types-of-homes-hero.jpg"
                },
                new AlquilerModel()
                {
                    titulo = "Amplio apartamento en heredia",
                    localizacion = "Santo Domingo, Heredia",
                    descripcion = "Apartamento en torre",
                    imagenURL="https://www.rocketmortgage.com/resources-cmsassets/RocketMortgage.com/Article_Images/Large_Images/TypesOfHomes/types-of-homes-hero.jpg"
                },
                                new AlquilerModel()
                {
                    titulo = "Casa en Santa Ana",
                    localizacion = "Santa Ana, Escazu",
                    descripcion = "Casa en condominio",
                    imagenURL= "https://www.rocketmortgage.com/resources-cmsassets/RocketMortgage.com/Article_Images/Large_Images/TypesOfHomes/types-of-homes-hero.jpg"
                },
                new AlquilerModel()
                {
                    titulo = "Amplio apartamento en heredia",
                    localizacion = "Santo Domingo, Heredia",
                    descripcion = "Apartamento en torre",
                    imagenURL="https://www.rocketmortgage.com/resources-cmsassets/RocketMortgage.com/Article_Images/Large_Images/TypesOfHomes/types-of-homes-hero.jpg"
                }

            };
            ListaAlquiler_Variable = new ObservableCollection<AlquilerModel>(ListaAlquiler_Llena);

            SearchCommand = new Command(async (busqueda) =>
            {
                if (string.IsNullOrWhiteSpace(busqueda as string))
                {
                    busqueda = string.Empty;
                }
                busqueda = (busqueda as string).ToLowerInvariant();
                    var alquileres = ListaAlquiler_Llena.Where(x => x.localizacion.ToLowerInvariant().Contains((busqueda as string).Trim().ToLower())).ToList();

                if (string.IsNullOrWhiteSpace(busqueda as string))
                {
                    alquileres = ListaAlquiler_Llena.ToList();
                }
                    foreach (var value in ListaAlquiler_Llena)
                    {
                        if (!alquileres.Contains(value))
                        {
                        ListaAlquiler_Variable.Remove(value);
                        }
                        else if (!ListaAlquiler_Llena.Contains(value))
                    {
                        ListaAlquiler_Variable.Add(value);
                    }
                }

            });
        }


        public event PropertyChangedEventHandler PropertyChanged;


        protected void OnPropertyChanged([CallerMemberName] string propertyName = null)

        {

            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));

        }
    }
}
