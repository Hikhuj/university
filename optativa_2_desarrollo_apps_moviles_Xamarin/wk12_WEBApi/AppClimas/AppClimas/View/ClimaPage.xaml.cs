using System;
using System.Collections.Generic;
using AppClimas.ViewModel;
using Xamarin.Forms;

namespace AppClimas.View
{
    public partial class ClimaPage : ContentPage
    {
        public ClimaPage()
        {
            InitializeComponent();
            // Le vamos a hacer un view a ClimaPageViewModel
            BindingContext = new ClimaPageViewModel();
        }
    }
}
