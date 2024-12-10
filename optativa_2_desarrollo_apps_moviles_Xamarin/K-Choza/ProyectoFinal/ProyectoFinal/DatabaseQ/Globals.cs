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
                Usuario = "a@a.com",
                Titulo = "Casa en Santa Ana",
                Localizacion = "Santa Ana, Escazu",
                Descripcion = "Casa en condominio",
                ImagenURL = "casa01.jpg",
                Cuartos = "3",
                Banios = "2.5",
                Cochera = "2",
                Precio = 500000,
                IDCasa = 265
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Usuario = "a@a.com",
                Titulo = "Amplio apartamento en Heredia",
                Localizacion = "Santo Domingo, Heredia",
                Descripcion = "Apartamento en torre",
                ImagenURL = "casa07.jpg",
                Cuartos = "3",
                Banios = "2.5",
                Cochera = "2",
                Precio = 250000,
                IDCasa = 300
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Loft en la Sabana",
                Localizacion = "San Jose",
                Descripcion = "Loft en edificio nuevo cerca de Sabana Sur, muy centrico",
                ImagenURL = "casa03.jpg",
                Cuartos = "3",
                Banios = "2.5",
                Cochera = "2",
                Precio = 150000,
                IDCasa = 100
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Cuarto en desamparados",
                Localizacion = "Desamparados",
                Descripcion = "Cuarto en barrio, muy seguro, cerca de todo",
                ImagenURL = "casa06.jpg",
                Cuartos = "3",
                Banios = "2.5",
                Cochera = "2",
                Precio = 130000
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Casa en Cartago",
                Localizacion = "Cartago",
                Descripcion = "Casa en condominio",
                ImagenURL = "casa03.jpg",
                Cuartos = "3",
                Banios = "2.5",
                Cochera = "2",
                Precio = 780000
            });

            Globals.listaCasas.Add(new PropiedadModel()
            {
                Titulo = "Amplio apartamento en Cartago",
                Localizacion = "Santo Domingo, Cartago",
                Descripcion = "Apartamento en torre",
                ImagenURL = "casa04.jpg",
                Cuartos = "3",
                Banios = "2.5",
                Cochera = "2",
                Precio = 320000
            });
        }
    }
}