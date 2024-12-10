using System;
using System.Collections.Generic;
using ProyectoFinal.ViewMoldel;
using Xamarin.Forms;

namespace ProyectoFinal.View
{
    public partial class HabilitarCasa : ContentPage
    {
        public HabilitarCasa()
        {
            InitializeComponent();
            BindingContext = new HabilitarCasaViewModel();
        }
    }
}
