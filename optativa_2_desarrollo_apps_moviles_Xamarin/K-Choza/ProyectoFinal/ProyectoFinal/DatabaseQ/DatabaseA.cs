using ProyectoFinal.Model;
using SQLite;
using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoFinal.DatabaseQ
{
  //Base de datos para usuario.
  public class DatabaseA
    {
       // CREACION DE LAS TABLAS Y CONEXION CON LA BASE DE DATOS
        readonly SQLiteAsyncConnection _database;

        public DatabaseA(string dbPath)
        {
            _database = new SQLiteAsyncConnection(dbPath);


           //CREACION DE LAS TABLAS

            _database.CreateTableAsync<UsuarioModel>().Wait();
           
        }

        /* 
        public Task<UsuarioModel> GetUserModelAynsc(int id)
        {
            return _database.Table<UsuarioModel>()
                            .Where(i => i.UserID == id)
                            .FirstOrDefaultAsync();
        }
        */

        //METODO SELECT
        public Task<List<UsuarioModel>> GetUserModel()
        {
            return _database.Table<UsuarioModel>().ToListAsync();
        }

        //METODO PARA GUARDAR Y ACTUALIZAR LOS DATOS
        public Task<int> SaveUserModelAsync(UsuarioModel userModel)
        {
            if (userModel.UserID != 0)
            {
                return _database.UpdateAsync(userModel);
            }
            else
            {
                return _database.InsertAsync(userModel);
            }
        }

        //METODO PARA ELIMINAR
        public Task<int> DeleteUserModelAsync(UsuarioModel userModel)
        {
            return _database.DeleteAsync(userModel);
        }

        //METODO PARA BUSCAR EL USUARIO POR CORREO Y CONTRASENA
        public Task<List<UsuarioModel>> GetUsersValidate(string email, string password)
        {
            return _database.QueryAsync<UsuarioModel>("SELECT * FROM UsuarioModel WHERE EmailField = '" + email + "' AND PasswordField = '" + password + "'");
        }

        public Task<UsuarioModel> GetName(string email)
        {
            return _database.GetAsync<UsuarioModel>("SELECT NamesField  FROM UsuarioModel WHERE EmailField = '" + email + "'");
        }



    }
}
