using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using SQLite;

namespace AppAmigos.Model
{
    public class Amigos : INotifyPropertyChanged
    {
        private string nombre, telefono, email;

        [PrimaryKey, AutoIncrement] // Hace un notation
        public int ID { get; set; }

        public string Nombre
        {
            get => nombre;
            set
            {
                nombre = value;
                OnPropertyChanged();
            }
        }

        public string Telefono
        {
            get => telefono;
            set
            {
                telefono = value;
                OnPropertyChanged();
            }
        }

        public string Email
        {
            get => email;
            set
            {
                email = value;
                OnPropertyChanged();
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged([CallerMemberName] string propertyName = null)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }
    }
}
