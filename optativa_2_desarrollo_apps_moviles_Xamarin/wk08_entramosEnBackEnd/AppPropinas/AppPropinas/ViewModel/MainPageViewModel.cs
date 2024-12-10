using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms;
using AppPropinas.Model;

namespace AppPropinas.ViewModel
{
    public class MainPageViewModel
    {
        // Esta variable se relaciona al boton del MainPage.xaml
        public Command OperationsCommand { get; set; }
        public PropinaModel propinaModel { get; set; }

        public MainPageViewModel()
        {
            // Luego yo instancio esa variable y va a recibir una 
            // operacion, esa operacion lo que va a permitir 
            // es que es que se ejecute la orden que tenga dentro
            // y van a ser las operaciones de DoOperations()
            OperationsCommand = new Command(DoOperations);

            propinaModel = new PropinaModel
            {
                Total = 10000,
                Propina = 5,
                NoPersonas = 2,
            };

        }

        private void DoOperations()
        {
            propinaModel.TotalPropina = ((propinaModel.Total * propinaModel.Propina) / 100);
            propinaModel.PropinaPorPersona = (propinaModel.TotalPropina / propinaModel.NoPersonas);
            propinaModel.TotalConPropina = propinaModel.Total + propinaModel.TotalPropina;
            propinaModel.TotalPorPersona = (propinaModel.TotalPropina + propinaModel.Total) / propinaModel.NoPersonas;
        }
    }
}
