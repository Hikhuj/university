using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using Xamarin.Forms;

namespace AppPropinas.Model
{
    public class PropinaModel : INotifyPropertyChanged
    {
        private decimal totalPropina;
        private decimal totalConPropina;
        private decimal totalPorPropina;
        private decimal propinaPorPersona;
        private decimal totalPorPersona;


        public PropinaModel() { }


        public decimal Total { get; set; }
        public decimal Propina { get; set; }
        public int NoPersonas { get; set; }

        public decimal TotalPropina
        {
            get => totalPropina;
            set
            {
                totalPropina = value;
                OnPropertyChanged();
            }
        }

        public decimal TotalConPropina
        {
            get => totalConPropina;
            set
            {
                totalConPropina = value;
                OnPropertyChanged();
            }

        }

        public decimal TotalPorPropina
        {
            get => totalPorPropina;
            set
            {
                totalPorPropina = value;
                OnPropertyChanged();
            }
        }
        public decimal PropinaPorPersona
        {
            get => propinaPorPersona;
            set
            {
                propinaPorPersona = value;
                OnPropertyChanged();
            }
        }
        public decimal TotalPorPersona
        {
            get => totalPorPersona;
            set
            {
                totalPorPersona = value;
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