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
    
    public partial class usuario
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public usuario()
        {
            this.bitacoras = new HashSet<bitacora>();
            this.usuarios_roles = new HashSet<usuarios_roles>();
        }
    
        public int id { get; set; }
        public string usuario1 { get; set; }
        public string email { get; set; }
        public string contrasenia { get; set; }
        public string nombre_1 { get; set; }
        public string nombre_2 { get; set; }
        public string apellido_1 { get; set; }
        public string apellido_2 { get; set; }
        public int rol { get; set; }
        public string id_consecutivo { get; set; }
        public Nullable<bool> tarjeta_bancaria { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<bitacora> bitacoras { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<usuarios_roles> usuarios_roles { get; set; }
    }
}
