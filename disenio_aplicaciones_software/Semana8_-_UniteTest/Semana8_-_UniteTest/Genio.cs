using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semana8__UniteTest
{
    public class Genio
    {

        public bool bandera = false;
        
        public string CrearMundo(int x)
        {
            switch (x)
            {
                case 1: return "Mundo magico";
                case 2: return "Mundo electrico";
                case 3: return "Mundo acuatico";
                default:
                    break;
            }

            return "";

        }

        public void ThrowException()
        {
            bandera = true;
        }

    }
}
