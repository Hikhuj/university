using System;
using calculadoraSalarial.View;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace calculadoraSalarial
{
    public partial class App : Application
    {

        public App()
        {
            InitializeComponent();

            MainPage = new CalculadoraPage();

        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
