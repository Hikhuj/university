//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Lec04_RESTapi.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Planta
    {
        public int cod_planta { get; set; }
        public string nombre_planta { get; set; }
        public int cantidad { get; set; }
        public Nullable<int> cod_tipo_planta { get; set; }
    
        public Tipos_Planta Tipos_Planta { get; set; }
    }
}