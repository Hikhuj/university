using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AppPropinas.Model;
using AppPropinas.ViewModel;
using Xamarin.Forms;

namespace AppPropinas
{
    public partial class MainPage : ContentPage
    {
        // Solo puede existir un contexto a base de datos (BindingContext) por vista
        // Inicializamos el objeto
        private PropinaModel propinaModel;

        public MainPage()
        {
            InitializeComponent();

            this.BindingContext = new MainPageViewModel();
        }
    }
}
