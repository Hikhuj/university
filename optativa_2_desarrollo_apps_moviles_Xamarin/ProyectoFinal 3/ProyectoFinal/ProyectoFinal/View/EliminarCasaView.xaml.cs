using System;
using System.Collections.Generic;
using ProyectoFinal.ViewMoldel;
using Xamarin.Forms;

namespace ProyectoFinal.View
{
    public partial class EliminarCasaView : ContentPage
    {
        public EliminarCasaView()
        {
            InitializeComponent();
            BindingContext = new EliminarCasaViewModel();
        }
    }
}
