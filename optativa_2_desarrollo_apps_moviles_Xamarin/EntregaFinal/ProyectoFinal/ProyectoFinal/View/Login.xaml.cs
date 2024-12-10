using ProyectoFinal.ViewMoldel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace ProyectoFinal.View
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Login : ContentPage
    {
        public Login()
        {
            InitializeComponent();

            BindingContext = new LoginViewModel();
            btnregistro.Clicked += (sender, e) =>
            {
                Navigation.PushAsync(new Registro());
            };
        }
    }
}