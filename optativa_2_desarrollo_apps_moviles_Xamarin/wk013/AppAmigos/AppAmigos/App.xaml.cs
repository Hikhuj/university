using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using AppAmigos.Data;
using AppAmigos.Services;

namespace AppAmigos
{
    public partial class App : Application
    {
        private static AmigosDatabase database;

        public static AmigosDatabase Database
        {
            get
            {
                if (database == null)
                {
                    // Recomendado que sea extension DB3, aqui el va a saber donde almacenar
                    database = new AmigosDatabase(DependencyService.Get<IFileHelper>().GetLocalFilePath("amigodb.db3"));
                }
                return database;
            }
        }

        public App()
        {
            InitializeComponent();

            MainPage = new MainPage();
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
