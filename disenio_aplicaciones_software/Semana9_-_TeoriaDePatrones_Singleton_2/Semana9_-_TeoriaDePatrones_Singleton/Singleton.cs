using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semana9___TeoriaDePatrones_Singleton
{
    class Singleton
    {

        private static Singleton instance = null;
        public string mensaje = "";

        protected Singleton()
        {
            mensaje = "Hola lunes patrón Singleton.";
        }

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
