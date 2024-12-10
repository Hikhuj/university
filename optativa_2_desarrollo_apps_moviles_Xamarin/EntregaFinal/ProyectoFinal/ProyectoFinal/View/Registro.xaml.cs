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
    public partial class Registro : ContentPage
    {
        public Registro()
        {
            InitializeComponent();
            BindingContext = new RegistroViewModel(); //LLAMAMOS AL VIEW MODEL DE REGISTRO
            btnisesion.Clicked += (sender, e) =>
                            {
                                Navigation.PushAsync(new Login());
                            };
        }
    }
}