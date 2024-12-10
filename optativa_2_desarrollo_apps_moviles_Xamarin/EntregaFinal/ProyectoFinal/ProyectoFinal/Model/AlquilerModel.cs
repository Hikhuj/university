using System;
using System.Linq;

namespace ProyectoFinal.Model
{
    public class AlquilerModel
    {
        public int id_casa { get; set; }
        public string titulo { get; set; }
        public string descripcion { get; set; }
        public int precio { get; set; }
        public string localizacion { get; set; }
        public string imagenURL { get; set; }
        public int calificacion { get; set; }
    }
}
