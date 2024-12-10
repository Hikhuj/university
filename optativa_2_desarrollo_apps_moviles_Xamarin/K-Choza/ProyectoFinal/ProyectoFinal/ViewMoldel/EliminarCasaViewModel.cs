using System;
using ProyectoFinal.DatabaseQ;
using ProyectoFinal.Model;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class EliminarCasaViewModel
    {
        

        public Command Eliminar { get; set; }
        public PropiedadModel PropiedadModel { get; set; }

        public EliminarCasaViewModel()
        {
            PropiedadModel = new PropiedadModel();

            Eliminar = new Command(EliminarCasa);
        }

        private void EliminarCasa()
        {
            //agarra casa por ID y elimina la casa 
            Globals.listaCasas.RemoveAll(a => a.IDCasa == PropiedadModel.IDCasa);
            mostrar();
        }

        private void mostrar()
        {

            foreach (PropiedadModel lista in Globals.listaCasas)
            {
                Console.WriteLine(lista.Mostrar());
            }
        }
    }
}
