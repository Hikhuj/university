using System;
using System.Collections.Generic;
using ProyectoFinal.ViewMoldel;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using ProyectoFinal.Model;

namespace ProyectoFinal.View
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Alquiler : ContentPage
    {
        public Alquiler(PropiedadModel alquiler = null)
        {
            InitializeComponent();
            if (alquiler == null)
            {
                BindingContext = new AlquilerViewModel(Navigation);
            }
            else
            {
                BindingContext = new AlquilerViewModel(Navigation, alquiler);
            }
        }
    }
}
