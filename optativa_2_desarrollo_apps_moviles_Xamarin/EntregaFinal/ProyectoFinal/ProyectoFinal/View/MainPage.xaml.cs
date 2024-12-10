using ProyectoFinal.Model;
using ProyectoFinal.View;
using ProyectoFinal.ViewMoldel;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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
            BindingContext = new MainPageViewModel();
            btnLogin.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new Login());
            };
            //btnregistro.Clicked += (sender, e) =>
            //{
            //    Navigation.PushAsync(new Registro());
            //};
        }

        async private void Handle_ItemTapped(object sender, Xamarin.Forms.ItemTappedEventArgs e)
        {
            var alquiler = e.Item as AlquilerModel;

            await Navigation.PushAsync(new Alquiler(alquiler));
        }
    }
}
