using System;
using ProyectoFinal.Model;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class AlquilerViewModel
    {
        public Command SaveCommand { get; set; }
        public AlquilerModel nuevo { get; set; }

        private INavigation Navigation;

        public AlquilerViewModel(INavigation navigation)
        {
            nuevo = new AlquilerModel();
            Navigation = navigation;
        }

        public AlquilerViewModel(INavigation navigation, AlquilerModel amigo)
        {
            nuevo = amigo;
            Navigation = navigation;
        }
    }
}
