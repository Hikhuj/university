using System;
using System.Collections.Generic;
using System.Text;
using System.ComponentModel;
using System.Runtime.CompilerServices;

namespace calculadoraSalarial.Model
{
    public class CalcuSalarialModel : INotifyPropertyChanged
    {

        private double salarioBrutoComision;
        private double ingresoSalarialOcasional;
        private double reembolsoGastosNoSalarialGravable;
        private double totalIngresos;
        private double enfermedadYMaternidad;
        private double invalidezYMuerte;
        private double aporteTrabajadorBancoPopular;
        private double aporteAsociacionSolidarista;
        private double planDePensionesComplementarias;
        private double salarioGravable;
        private double impuestoRentaEmpleados;
        private double totalDeducciones;
        private double totalIngresosNetos;

        public CalcuSalarialModel() { }

        public double SalarioBrutoComision
        {
            get => salarioBrutoComision;
            set
            {
                salarioBrutoComision = value;
                OnPropertyChanged();
            }
        }

        public double IngresoSalarialOcasional
        {
            get => ingresoSalarialOcasional;
            set
            {
                ingresoSalarialOcasional = value;
                OnPropertyChanged();
            }
        }

        public double ReembolsoGastosNoSalarialGravable
        {
            get => reembolsoGastosNoSalarialGravable;
            set
            {
                reembolsoGastosNoSalarialGravable = value;
                OnPropertyChanged();
            }
        }

        public double TotalIngresos
        {
            get => totalIngresos;
            set
            {
                totalIngresos = value;
                OnPropertyChanged();
            }
        }

        public double EnfermedadYMaternidad
        {
            get => enfermedadYMaternidad;
            set
            {
                enfermedadYMaternidad = value;
                OnPropertyChanged();
            }
        }

        public double InvalidezYMuerte
        {
            get => invalidezYMuerte;
            set
            {
                invalidezYMuerte = value;
                OnPropertyChanged();
            }
        }

        public double AporteTrabajadorBancoPopular
        {
            get => aporteTrabajadorBancoPopular;
            set
            {
                aporteTrabajadorBancoPopular = value;
                OnPropertyChanged();
            }
        }

        public double AporteAsociacionSolidarista
        {
            get => aporteAsociacionSolidarista;
            set
            {
                aporteAsociacionSolidarista = value;
                OnPropertyChanged();
            }
        }

        public double PlanDePensionesComplementarias
        {
            get => planDePensionesComplementarias;
            set
            {
                planDePensionesComplementarias = value;
                OnPropertyChanged();
            }
        }

        public double SalarioGravable
        {
            get => salarioGravable;
            set
            {
                salarioGravable = value;
                OnPropertyChanged();
            }
        }

        public double ImpuestoRentaEmpleados
        {
            get => impuestoRentaEmpleados;
            set
            {
                impuestoRentaEmpleados = value;
                OnPropertyChanged();
            }
        }

        public double TotalDeducciones
        {
            get => totalDeducciones;
            set
            {
                totalDeducciones = value;
                OnPropertyChanged();
            }
        }

        public double TotalIngresosNetos
        {
            get => totalIngresosNetos;
            set
            {
                totalIngresosNetos = value;
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
