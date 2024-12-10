using System;
using ProyectoFinal.DatabaseQ;
using ProyectoFinal.Model;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class SubirPropiedadViewModel
    {

        public Command Guardar { get; set; }
        public PropiedadModel PropiedadModel { get; set; }

        public SubirPropiedadViewModel()
        {
            PropiedadModel = new PropiedadModel();
            PropiedadModel.Usuario = Globals.usuario;//usuario actual
            PropiedadModel.Habilitada = true;//una casa recien agregada esta habilitada

            Guardar = new Command(guardar);
        }

        private void guardar()
        {
            bool disponible = true;
            foreach (PropiedadModel casa in Globals.listaCasas)
            {
                if (casa.IDCasa == PropiedadModel.IDCasa)
                {
                    disponible = false;
                }
            }
            if (disponible)
            {
                /*string lugar, bool habilitada, string usuario, string titulo,
            string descripcion, string localizacion, int precio, string imagenURL, int iDCasa,
            string cuartos, string banios, string cochera*/
                Globals.listaCasas.Add(new PropiedadModel(PropiedadModel));
                Console.WriteLine("Guardado");
            }
            else
            {
                Application.Current.MainPage.DisplayAlert("Alerta", "ID: " + PropiedadModel.IDCasa + "\nya esta utilizado", "Ok");
                Console.WriteLine();
            }
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
