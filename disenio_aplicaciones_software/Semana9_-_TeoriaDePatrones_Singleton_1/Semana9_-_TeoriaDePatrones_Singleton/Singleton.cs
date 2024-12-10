using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semana9___TeoriaDePatrones_Singleton
{
    class Singleton
    {
        // Agrega una variable estatica del mismo tipo 
        // de la clase donde esta contenida (instance)
        private static Singleton instance = null;
        public string mensaje = "";

        // Constructor se trabaja de forma protegida
        // No puede ser heredada
        protected Singleton()
        {
            mensaje = "Hola lunes patrón Singleton.";
        }

        // Este es un metodo estatico que va a devolver
        // se trata de crear el codigo necesario para 
        // evitar que se creen dos instancias.
        public static Singleton Instance
        {
            //
            get
            {
                if (instance == null) instance = new Singleton();

                return instance;
            }
        }

    }
}
