using ProyectoFinal.DatabaseQ;
using System;
using System.IO;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace ProyectoFinal
{
    public partial class App : Application
    {
        static DatabaseA database;

        public static DatabaseA Database // CREAMOS LA BASE Y LE DAMOS NOMBRE, SI ESTA NO EXISTE AUN
        {
            get
            {
                if (database == null)
                {
                    database = new DatabaseA(Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "DBProyecto.db"));
                }
                return database;
            }
        }

        public App()
        {
            InitializeComponent();

            MainPage = new NavigationPage(new MainPage());

            ((NavigationPage)Application.Current.MainPage).BarBackgroundColor = Color.FromHex("#f1c40f");
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
