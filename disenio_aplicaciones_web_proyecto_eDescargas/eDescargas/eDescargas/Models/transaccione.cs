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
    
    public partial class transaccione
    {
        public int id { get; set; }
        public System.DateTime fecha_transaccion { get; set; }
        public string metodo_pago { get; set; }
        public int monto_compra { get; set; }
        public string id_consecutivo { get; set; }
    }
}
