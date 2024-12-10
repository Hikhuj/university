using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semana3___Ejercicio02_DemoModClase
{
    class Cuenta
    {

        private String id;
        private float saldo;

        public Cuenta(string id, float saldoRecibido)
        {
            this.id = id;
            saldo = saldoRecibido;
        }

        public void Depositar(float monto)
        {
            saldo = saldo + monto;
        }

        public void Retirar(float monto)
        {
            if (HaySaldo(monto))
            {
                saldo = saldo - monto;
            }
        }

        public void DiceSaldo()
        {
            Console.WriteLine(saldo);
        }

        private bool HaySaldo()
        {
            return (saldo > 0);
        }

        private bool HaySaldo(float monto)
        {
            return (saldo >= 0);
        }

    }
}
