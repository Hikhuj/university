using ProyectoFinal.DatabaseQ;
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
                Navigation.PushAsync(new MenuView());
            };
            //btnregistro.Clicked += (sender, e) =>
            //{
            //    Navigation.PushAsync(new Registro());
            //};
        }

        async private void Handle_ItemTapped(object sender, Xamarin.Forms.ItemTappedEventArgs e)
        {
            var alquiler = e.Item as PropiedadModel;

            await Navigation.PushAsync(new Alquiler(alquiler));
        }

        void SearchBar_TextChanged(System.Object sender, Xamarin.Forms.TextChangedEventArgs e)
        {
            ListaAlquiler.BeginRefresh();

            if (string.IsNullOrWhiteSpace(e.NewTextValue))
                ListaAlquiler.ItemsSource = Globals.listaCasas;
            else
                ListaAlquiler.ItemsSource = Globals.listaCasas.Where(x => x.Localizacion.ToLowerInvariant().Contains((e.NewTextValue).Trim().ToLower())).ToList();

            ListaAlquiler.EndRefresh();
        }
    }
}
