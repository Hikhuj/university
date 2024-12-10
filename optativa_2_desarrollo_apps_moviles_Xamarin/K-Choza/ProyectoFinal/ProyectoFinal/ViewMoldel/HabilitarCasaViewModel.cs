using System;
using ProyectoFinal.DatabaseQ;
using ProyectoFinal.Model;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class HabilitarCasaViewModel
    {

        public Command Buscar { get; set; }
        public Command Cambiar { get; set; }
        public PropiedadModel PropiedadModel { get; set; }


        public HabilitarCasaViewModel()
        {
            //Cargar();//en caso de no tener datos previos
            Buscar = new Command(Busqueda);
            Cambiar = new Command(Cambio);
            PropiedadModel = new PropiedadModel();
        }

        private void Busqueda()
        {
            PropiedadModel temp = Globals.listaCasas.Find(x => x.IDCasa == PropiedadModel.IDCasa);
            PropiedadModel.Lugar = temp.Lugar;
            PropiedadModel.Descripcion = temp.Descripcion;
            PropiedadModel.Precio = temp.Precio;
            PropiedadModel.Habilitada = temp.Habilitada;
        }

        private void Cambio()
        {
            PropiedadModel temp = Globals.listaCasas.Find(x => x.IDCasa == PropiedadModel.IDCasa);
            if (temp.Habilitada)
            {
                temp.Habilitada = false;
            }
            else
            {
                temp.Habilitada = true;
            }
            PropiedadModel.Habilitada = temp.Habilitada;
            mostrar();
        }


        private void mostrar()
        {
            foreach (PropiedadModel lista in Globals.listaCasas)
            {
                Console.WriteLine(lista.Mostrar());
            }
        }

        /*
        private void Cargar()
        {
            Globals.listaCasas.Add(new CasaModel("Usu1", 1, "San Jose", "2 pisos", 1000, true));
            Globals.listaCasas.Add(new CasaModel("Usu2", 2, "Cartago", "1 pisos", 1000, true));
            Globals.listaCasas.Add(new CasaModel("Usu2", 3, "Cartago", "1 pisos", 2000, true));
            Globals.listaCasas.Add(new CasaModel("Usu1", 4, "Cartago", "1 pisos", 3000, true));
            Globals.listaCasas.Add(new CasaModel("Usu3", 5, "Cartago", "1 pisos", 4000, true));
            Globals.listaCasas.Add(new CasaModel("Usu3", 6, "San Jose", "1 pisos", 41000, true));
            Globals.listaCasas.Add(new CasaModel("Usu3", 7, "Heredia", "2 pisos", 5000, true));
            Globals.listaCasas.Add(new CasaModel("Usu3", 8, "San Jose", "1 pisos", 51000, true));
            Globals.listaCasas.Add(new CasaModel("Usu1", 9, "Heredia", "2 pisos", 15000, true));
            Globals.listaCasas.Add(new CasaModel("Usu1", 10, "San Jose", "1 pisos", 16000, true));
            Globals.listaCasas.Add(new CasaModel("Usu1", 11, "San Jose", "2 pisos", 17000, true));
        }*/
    }
}
