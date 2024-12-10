using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using AppAmigos.Model;
using SQLite;

// Esta clase va a administrar la DB

namespace AppAmigos.Data
{
    public class AmigosDatabase
    {
        private readonly SQLiteAsyncConnection database;

        public AmigosDatabase(string dbPath)
        {
            database = new SQLiteAsyncConnection(dbPath);

            // Se necesita un MODELO
            // Al usar un Wait() el sistema espera a que este creado
            // porque sino va a estar marcando error cuando lo construyamos
            database.CreateTableAsync<Amigos>().Wait();
        }

        // Vamos a insertar los methods para ingresar datos en la DB
        // Es una tarea por que no pude ser un assign
        // lo que va en amigos es un MOLDE
        public async Task<List<Amigos>> getItemsAsync()
        {
            return await database.Table<Amigos>().ToListAsync();
        }

        public Task<Amigos> getItemAsync(int id)
        {
            return database.Table<Amigos>()
                .Where(i => i.ID == id)
                .FirstOrDefaultAsync();
        }

        public Task<int> saveItemAsync(Amigos item)
        {
            if (item.ID != 0)
            {
                return database.UpdateAsync(item);
            }
            else
            {
                return database.InsertAsync(item);
            }
        }

        public Task<int> DeleteItemAsync(Amigos item)
        {
            return database.DeleteAsync(item);
        }
    }
}
