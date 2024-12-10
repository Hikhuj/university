using SQLite;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Text;

namespace ProyectoFinal.Model
{
    //clase base de los Usuarios.
    public class UsuarioModel 
    {
        //ATRIBUTOS DE NUESTRA BASE DE DATOS DE LA TABLA USUARIO

        [PrimaryKey, AutoIncrement]
        public int UserID { get; set; }

        [MaxLength(30)]
        public string EmailField { get; set; }

        [MaxLength(16)]
        public string PasswordField { get; set; }

        [MaxLength(30)]
        public string NamesField { get; set; }

        [MaxLength(30)]
        public string NumeroFiel { get; set; }



    }
}
