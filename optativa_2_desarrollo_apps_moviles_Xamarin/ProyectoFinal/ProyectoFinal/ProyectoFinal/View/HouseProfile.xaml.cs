using System;
using System.Collections.Generic;
using ProyectoFinal.ViewMoldel;
using Xamarin.Forms;

namespace ProyectoFinal.View
{
    public partial class HouseProfile : ContentPage
    {
        public HouseProfile()
        {
            InitializeComponent();

            BindingContext = new HouseProfileViewModel();

        }
    }
}
