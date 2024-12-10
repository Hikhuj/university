using System;
using System.Collections.Generic;
using ProyectoFinal.DatabaseQ;
using Xamarin.Forms;

namespace ProyectoFinal.View
{
    public partial class MenuView : ContentPage
    {
        public MenuView()
        {
            InitializeComponent();
            btnSubirPropiedad.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new SubirPropiedad());
            };

            btnHabilitarCasa.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new HabilitarCasa());
            };

            btnEliminarCasa.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new EliminarCasaView());
            };

            btnCerrar.Clicked += (sender, e) =>
            {
                Globals.usuario= "";
                Navigation.PushAsync(new Login());
            };
        }
    }
}
