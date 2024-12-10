using ProyectoFinal.DatabaseQ;
using ProyectoFinal.Model;
using ProyectoFinal.View;
using ProyectoFinal.ViewMoldel;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

using Xamarin.Forms.Xaml;

namespace ProyectoFinal.View
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class VerPropiedad : ContentPage
    {
        public VerPropiedad()
        {
            InitializeComponent();
            BindingContext = new VerPropiedadViewModel();
            
        }

        async private void Handle_ItemTapped(object sender, Xamarin.Forms.ItemTappedEventArgs e)
        {
            var alquiler = e.Item as PropiedadModel;

            await Navigation.PushAsync(new Alquiler(alquiler));
        }
    }
}