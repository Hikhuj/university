using System;

namespace ProyectoFinal.Model
{
    public class AlquilerModel
    {
        // CONSTRUCTOR
        public AlquilerModel() { }

        // ATRIBUTOS
        public int IdCasa { get; set; }

        public string Descripcion { get; set; }

        public string Lugar { get; set; }

        public int Precio { get; set; }

        public int Calificacion { get; set; }
    }
}
