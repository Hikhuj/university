using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class HouseProfileViewModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChangeds([CallerMemberName] string propertyName = null)

        {

            PropertyChangedEventHandler handler = PropertyChanged;

            if (handler != null)

            {

                handler(this, new PropertyChangedEventArgs(propertyName));

            }

        }
    }
}

