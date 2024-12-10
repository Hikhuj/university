using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProbarVentanas
{
    public partial class frm_Depositar : Form
    {
        public frm_Depositar()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int cuentaLength = txt_cuenta.TextLength;
            int limiteCuenta = 10;

            /*
            Boolean resultado = DevCom.consultarCuenta(txt_cuenta.Text);

            if (resultado)
            {
                MessageBox.Show("Cuenta existe", "Error");
            }
            */

            // Evaluar si datos requeridos estan
            if (cuentaLength < limiteCuenta)
            {
                if (txt_cuenta.Text != "" || txt_monto.Text != "" || txt_monto.Text != "")
                {
                    //DevCom.ActualizarCuenta(txt_cuenta.Text, txt_saldoAnterior.Text, txt_monto.Text);
                    DevCom.DepositarCuenta(txt_cuenta.Text, txt_monto.Text);
                }
                else
                {
                    MessageBox.Show("Cuenta excede los digitos maximos (10)", "Error");
                }
            }
            else
            {
                    MessageBox.Show("Faltan datos requeridos de agregar", "Error");
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {

        }
    }
}
