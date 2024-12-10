using ProyectoFinal.View;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace ProyectoFinal
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();

            btnLogin.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new Login());
            };

            /*
            btnregistro.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new Registro());
            };
            */
        }

        // Roger: Llamar al perfil de casas
        private async void GoToHomeProfile(System.Object sender, System.EventArgs e)
        {
            await Navigation.PushModalAsync(new HouseProfile());
        }

    }
}
