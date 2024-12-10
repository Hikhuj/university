using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms;
using calculadoraSalarial.Model;
using System.ComponentModel;
using System.Runtime.CompilerServices;

namespace calculadoraSalarial.ViewModel
{
    public class MainPageViewModel : INotifyPropertyChanged
    {
        private CalcuSalarialModel calcuSalarialModel;

        // Esta es la clase de conexion entre View <-> ViewModel
        // Tambien se conecta ViewModel <-> Model

        // Esta variable se relaciona al boton del MainPage.xaml
        public Command OperationsCommand { get; set; }

        // Ocupo hacer amarro la vista (devbo hacerle notify)
        // Aqui llamo al Modelo
        // Ocupo hacer
        public CalcuSalarialModel CalcuSalarialModel
        {
            get => calcuSalarialModel;
            set
            {
                calcuSalarialModel = value;
                OnPropertyChanged();
            }
        }

        #region PropertyChanged
        public event PropertyChangedEventHandler PropertyChanged;

        private void OnPropertyChanged([CallerMemberName] string propertyName = null)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        // Clase primaria para ejecutar el modelo
        public MainPageViewModel()
        {
            // Luego yo instancio esa variable y va a recibir una 
            // operacion, esa operacion lo que va a permitir 
            // es que es que se ejecute la orden que tenga dentro
            // y van a ser las operaciones de DoOperations()
            OperationsCommand = new Command(DoCalcular);
        }


        // Operaciones que se van a ejecutar cuando se agregen datos
        private void DoCalcular()
        {
            calcTotalIngresos();
            calcEnfermedadYMaternidad();
            calcInvalidezYMuerte();
            calcAporteTrabajadorBancoPopular();
            // Se requiere dato para calculo
            // calcAporteAsociacionSolidarista();
            calcPlanDePensionesComplementarias();
            calcSalarioGravable();
            calcImpuestoRentaEmpleados();
            calcTotalDeducciones();
            calcTotalIngresosNetos();
        }


        public void calcTotalIngresos()
        {
            calcuSalarialModel.TotalIngresos = calcuSalarialModel.SalarioBrutoComision + calcuSalarialModel.IngresoSalarialOcasional + calcuSalarialModel.ReembolsoGastosNoSalarialGravable;
        }

        public void calcEnfermedadYMaternidad()
        {
            calcuSalarialModel.EnfermedadYMaternidad = calcuSalarialModel.TotalIngresos * 0.055;
        }

        public void calcInvalidezYMuerte()
        {
            calcuSalarialModel.InvalidezYMuerte = calcuSalarialModel.TotalIngresos * 0.0384;
        }

        public void calcAporteTrabajadorBancoPopular()
        {
            calcuSalarialModel.AporteTrabajadorBancoPopular = calcuSalarialModel.TotalIngresos * 0.01;
        }

        public void calcAporteAsociacionSolidarista(int porcentaje)
        {
            calcuSalarialModel.AporteAsociacionSolidarista = (porcentaje * calcuSalarialModel.TotalIngresos) / 100;
        }

        public void calcPlanDePensionesComplementarias()
        {
            // Como calcular esto
            if (calcuSalarialModel.PlanDePensionesComplementarias != 0)
            {
                // calcuSalarialModel.PlanDePensionesComplementarias;
            }
        }

        public void calcSalarioGravable()
        {
            // Pendiente saber el calculo
            calcuSalarialModel.SalarioGravable = calcuSalarialModel.TotalIngresos;
        }

        public void calcImpuestoRentaEmpleados()
        {
            calcuSalarialModel.ImpuestoRentaEmpleados = operationImpuestoRentaEmpleados(calcuSalarialModel.TotalIngresos);
        }

        private double operationImpuestoRentaEmpleados(double ingreso)
        {
            /*
                Eliminar method, existe como retorno de 0
            */
            if (calcuSalarialModel.TotalIngresos > 0 & calcuSalarialModel.TotalIngresos <= 840000.00)
            {
                return 0;
            }

            if (ingreso >= 840001.00 & ingreso <= 1233000.00)
            {
                return ingreso * 0.1;
            }

            if (ingreso >= 1233001.00 & ingreso <= 2163000.00)
            {
                return ingreso * 0.15;
            }

            if (ingreso >= 2163001.00 & ingreso <= 4325000.00)
            {
                return ingreso * 0.2;
            }

            if (ingreso >= 4325001.00)
            {
                return ingreso * 0.25;
            }

            return 0;

        }

        public void calcTotalDeducciones()
        {
            calcuSalarialModel.TotalDeducciones = calcuSalarialModel.EnfermedadYMaternidad
                + calcuSalarialModel.InvalidezYMuerte
                + calcuSalarialModel.AporteTrabajadorBancoPopular
                + calcuSalarialModel.AporteAsociacionSolidarista
                + calcuSalarialModel.PlanDePensionesComplementarias
                + calcuSalarialModel.SalarioGravable
                + calcuSalarialModel.ImpuestoRentaEmpleados
                + calcuSalarialModel.TotalDeducciones;
        }

        public void calcTotalIngresosNetos()
        {
            calcuSalarialModel.TotalIngresosNetos = calcuSalarialModel.TotalIngresos - calcuSalarialModel.TotalDeducciones;
        }

    }

}