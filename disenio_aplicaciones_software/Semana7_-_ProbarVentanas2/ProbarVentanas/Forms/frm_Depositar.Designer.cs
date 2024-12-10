namespace ProbarVentanas
{
    partial class frm_Depositar
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txt_cuenta = new System.Windows.Forms.TextBox();
            this.txt_saldoAnterior = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txt_monto = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txt_descripcion = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.btn_depositar = new System.Windows.Forms.Button();
            this.btn_getCuenta = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(27, 91);
            this.label1.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Cuenta";
            // 
            // txt_cuenta
            // 
            this.txt_cuenta.Location = new System.Drawing.Point(111, 87);
            this.txt_cuenta.Margin = new System.Windows.Forms.Padding(2);
            this.txt_cuenta.MaxLength = 10;
            this.txt_cuenta.Name = "txt_cuenta";
            this.txt_cuenta.Size = new System.Drawing.Size(76, 20);
            this.txt_cuenta.TabIndex = 1;
            // 
            // txt_saldoAnterior
            // 
            this.txt_saldoAnterior.Location = new System.Drawing.Point(111, 124);
            this.txt_saldoAnterior.Margin = new System.Windows.Forms.Padding(2);
            this.txt_saldoAnterior.Name = "txt_saldoAnterior";
            this.txt_saldoAnterior.Size = new System.Drawing.Size(76, 20);
            this.txt_saldoAnterior.TabIndex = 3;
            this.txt_saldoAnterior.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(27, 128);
            this.label2.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(73, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Saldo Anterior";
            // 
            // txt_monto
            // 
            this.txt_monto.Location = new System.Drawing.Point(111, 161);
            this.txt_monto.Margin = new System.Windows.Forms.Padding(2);
            this.txt_monto.Name = "txt_monto";
            this.txt_monto.Size = new System.Drawing.Size(76, 20);
            this.txt_monto.TabIndex = 5;
            this.txt_monto.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(27, 165);
            this.label3.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(37, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Monto";
            // 
            // txt_descripcion
            // 
            this.txt_descripcion.Location = new System.Drawing.Point(111, 198);
            this.txt_descripcion.Margin = new System.Windows.Forms.Padding(2);
            this.txt_descripcion.Name = "txt_descripcion";
            this.txt_descripcion.Size = new System.Drawing.Size(187, 20);
            this.txt_descripcion.TabIndex = 7;
            this.txt_descripcion.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.ForeColor = System.Drawing.Color.White;
            this.label4.Location = new System.Drawing.Point(27, 202);
            this.label4.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(63, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "Descripción";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Arial", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.ForeColor = System.Drawing.Color.PaleGreen;
            this.label5.Location = new System.Drawing.Point(24, 21);
            this.label5.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(169, 29);
            this.label5.TabIndex = 10;
            this.label5.Text = "-- Depositar --";
            // 
            // button2
            // 
            this.button2.Image = global::ProbarVentanas.Properties.Resources.ButtonClose;
            this.button2.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button2.Location = new System.Drawing.Point(114, 251);
            this.button2.Margin = new System.Windows.Forms.Padding(2);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(73, 45);
            this.button2.TabIndex = 9;
            this.button2.Text = "Salir";
            this.button2.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // btn_depositar
            // 
            this.btn_depositar.Image = global::ProbarVentanas.Properties.Resources.Alarm_Tick_icon_32green;
            this.btn_depositar.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btn_depositar.Location = new System.Drawing.Point(210, 251);
            this.btn_depositar.Margin = new System.Windows.Forms.Padding(2);
            this.btn_depositar.Name = "btn_depositar";
            this.btn_depositar.Size = new System.Drawing.Size(88, 45);
            this.btn_depositar.TabIndex = 8;
            this.btn_depositar.Text = "Depositar";
            this.btn_depositar.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btn_depositar.UseVisualStyleBackColor = true;
            this.btn_depositar.Click += new System.EventHandler(this.button1_Click);
            // 
            // btn_getCuenta
            // 
            this.btn_getCuenta.Location = new System.Drawing.Point(192, 86);
            this.btn_getCuenta.Name = "btn_getCuenta";
            this.btn_getCuenta.Size = new System.Drawing.Size(75, 23);
            this.btn_getCuenta.TabIndex = 11;
            this.btn_getCuenta.Text = "Obtener";
            this.btn_getCuenta.UseVisualStyleBackColor = true;
            this.btn_getCuenta.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // frm_Depositar
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.SeaGreen;
            this.ClientSize = new System.Drawing.Size(335, 327);
            this.ControlBox = false;
            this.Controls.Add(this.btn_getCuenta);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.btn_depositar);
            this.Controls.Add(this.txt_descripcion);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txt_monto);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txt_saldoAnterior);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txt_cuenta);
            this.Controls.Add(this.label1);
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "frm_Depositar";
            this.Text = "Depositar";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txt_cuenta;
        private System.Windows.Forms.TextBox txt_saldoAnterior;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txt_monto;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txt_descripcion;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button btn_depositar;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button btn_getCuenta;
    }
}