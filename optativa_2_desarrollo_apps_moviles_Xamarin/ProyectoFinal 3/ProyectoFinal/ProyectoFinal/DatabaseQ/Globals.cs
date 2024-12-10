using System;
using System.Collections.Generic;
using System.Text;
using ProyectoFinal.Model;

namespace ProyectoFinal.DatabaseQ
{
    public class Globals
    {
        //Lista de casas registradas dentro de sistema
        public static List<PropiedadModel> listaCasas = new List<PropiedadModel>();

        public static string usuario { get; set; }

        // metodo que genera clases

        //crea las casas
        public static void cargar()
        {
            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Casa en Santa Ana",
                Localizacion = "Santa Ana, Escazu",
                Descripcion = "Casa en condominio",
                ImagenURL = "casa01.jpg"
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Amplio apartamento en Heredia",
                Localizacion = "Santo Domingo, Heredia",
                Descripcion = "Apartamento en torre",
                ImagenURL = "casa07.jpg"
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Loft en la Sabana",
                Localizacion = "San Jose",
                Descripcion = "Loft en edificio nuevo cerca de Sabana Sur, muy centrico",
                ImagenURL = "casa03.jpg"
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Cuarto en desamparados",
                Localizacion = "Desamparados",
                Descripcion = "Cuarto en barrio, muy seguro, cerca de todo",
                ImagenURL = "casa06.jpg"
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Casa en Cartago",
                Localizacion = "Cartago",
                Descripcion = "Casa en condominio",
                ImagenURL = "casa03.jpg"
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Amplio apartamento en Cartago",
                Localizacion = "Santo Domingo, Cartago",
                Descripcion = "Apartamento en torre",
                ImagenURL = "casa04.jpg"
            });
        }
    }
}