using System;
using System.Collections.Generic;
using calculadoraSalarial.Model;
using calculadoraSalarial.ViewModel;

using Xamarin.Forms;

namespace calculadoraSalarial.View
{
    public partial class CalculadoraPage : ContentPage
    {
        // Creemos un enlace entre View y ViewModel. Con esto tendremos
        // un objeto de tipo propina enlazado
        private CalcuSalarialModel calcuSalarialModel;

        public CalculadoraPage()
        {
            InitializeComponent();

            // Aqui podemos inicializar el objeto de tipo calculadora salarial
            // si asi lo requerimos
            this.BindingContext = new MainPageViewModel();
        }
    }
}
