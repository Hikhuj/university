using System;
using System.Threading.Tasks;
using AppAmigos.Model;
using Xamarin.Forms;

namespace AppAmigos.ViewModel
{
    public class AmigosViewViewModel
    {
        public Command SaveCommand { get; set; }

        public Amigos nuevo { get; set; }

        private INavigation Navigation;

        public AmigosViewViewModel(INavigation navigation)
        {
            nuevo = new Amigos();
            SaveCommand = new Command(async () => await salvarAmigo());
            Navigation = navigation;
        }

        // Cuando ya existen amigos
        public AmigosViewViewModel(INavigation navigation, Amigos amigo)
        {
            nuevo = amigo;
            SaveCommand = new Command(async () => await salvarAmigo());
            Navigation = navigation;
        }

        private async Task salvarAmigo()
        {
            await App.Database.saveItemAsync(nuevo);
            await Navigation.PopToRootAsync();
        }
    }
}
