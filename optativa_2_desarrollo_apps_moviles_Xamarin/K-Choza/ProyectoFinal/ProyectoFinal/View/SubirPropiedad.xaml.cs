using System;
using System.Collections.Generic;
using ProyectoFinal.ViewMoldel;
using Xamarin.Forms;

namespace ProyectoFinal.View
{
    public partial class SubirPropiedad : ContentPage
    {
        public SubirPropiedad()
        {
            InitializeComponent();
            BindingContext = new SubirPropiedadViewModel();
        }
    }
}
