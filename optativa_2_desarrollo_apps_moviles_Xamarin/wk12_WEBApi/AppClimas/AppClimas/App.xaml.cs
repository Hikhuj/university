using System;
using AppClimas.View;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace AppClimas
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            MainPage = new ClimaPage();
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
