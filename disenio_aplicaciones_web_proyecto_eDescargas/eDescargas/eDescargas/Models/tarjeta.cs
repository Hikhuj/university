//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace eDescargas.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class tarjeta
    {
        public int id { get; set; }
        public string num_tarjeta { get; set; }
        public int mes_exp { get; set; }
        public int anio_exp { get; set; }
        public int cvv { get; set; }
        public string emisor { get; set; }
        public string tipo { get; set; }
        public Nullable<decimal> limite { get; set; }
        public Nullable<decimal> saldo { get; set; }
        public Nullable<decimal> disponible { get; set; }
        public string nombre_tarjetahabiente { get; set; }
    }
}