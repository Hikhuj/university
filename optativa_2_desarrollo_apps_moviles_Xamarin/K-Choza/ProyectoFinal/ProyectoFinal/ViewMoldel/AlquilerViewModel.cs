using System;
using ProyectoFinal.Model;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class AlquilerViewModel
    {
        public Command SaveCommand { get; set; }
        public PropiedadModel nuevo { get; set; }

        private INavigation Navigation;

        public AlquilerViewModel(INavigation navigation)
        {
            nuevo = new PropiedadModel();
            Navigation = navigation;
        }

        public AlquilerViewModel(INavigation navigation, PropiedadModel propiedad)
        {
            nuevo = propiedad;
            Navigation = navigation;

        }
    }
}
