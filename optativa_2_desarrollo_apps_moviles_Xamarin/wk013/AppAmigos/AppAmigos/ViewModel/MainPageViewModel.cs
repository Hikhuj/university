using System;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;
using AppAmigos.Helpers;
using AppAmigos.Model;
using Xamarin.Forms;

namespace AppAmigos.ViewModel
{
    public class MainPageViewModel : INotifyPropertyChanged
    {
        public ObservableCollection<Grouping<string, Amigos>> Amigos { get; set; }

        // Este es el model que va a tener la lista de los amigos
        public Command agregarAmigo { get; set; }
        private INavigation Navigation;
        private Amigos amigoSeleccionado;

        public Amigos AmigoSeleccionado
        {
            get => amigoSeleccionado;
            set
            {
                amigoSeleccionado = value;
                OnPropertyChanged();
            }
        }

        public MainPageViewModel(INavigation navigation)
        {
            AmigosRepository repository = new AmigosRepository();

            Amigos = repository.GetAllGrouped();

            Navigation = navigation;

            agregarAmigo = new Command(async () =>
                await NavigateToAmigoView()
            ); ;
        }

        public async Task 

        private Task NavigateToAmigoView()
        {
            await Navigation.PushAsync(new AmigoView());
        }

        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged([CallerMemberName] string propertyName = null)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }
    }
}
