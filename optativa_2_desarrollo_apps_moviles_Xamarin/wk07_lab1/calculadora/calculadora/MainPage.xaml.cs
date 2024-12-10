using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using calculadora.Model;
using Xamarin.Forms;

namespace calculadora
{
    public partial class MainPage : ContentPage
    {
        // Instanciamos la clase que vayamos a considerar como la importante
        // para iniciar el proyecto
        private CalculadoraModel calcu;

        public MainPage()
        {
            InitializeComponent();

            // Vamos a crear el enlace de dataBinding o asociacionDeDatos
            calcu = new CalculadoraModel
            {

            };

            // A este punto tenemos una conexion usando el BindingContext.
            // Permite a la UI utilizar un contexto de datos
            // para conectarse a una fuente de datos: Modelo (en este caso)
            // Por cada Code Behind solo puede existir un Data Binding
            // Solo puede haber un contexto de base de datos
            this.BindingContext = calcu;

        }
    }
}
