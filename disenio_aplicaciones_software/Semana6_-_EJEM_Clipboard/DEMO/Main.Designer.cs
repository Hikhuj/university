namespace DEMO
{
    partial class Main
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.btn_Dejar = new System.Windows.Forms.Button();
            this.btn_Traer = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(165, 122);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(43, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Texto";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(238, 116);
            this.textBox1.Multiline = true;
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(700, 105);
            this.textBox1.TabIndex = 1;
            // 
            // btn_Dejar
            // 
            this.btn_Dejar.Location = new System.Drawing.Point(468, 227);
            this.btn_Dejar.Name = "btn_Dejar";
            this.btn_Dejar.Size = new System.Drawing.Size(125, 40);
            this.btn_Dejar.TabIndex = 2;
            this.btn_Dejar.Text = "&Dejar";
            this.btn_Dejar.UseVisualStyleBackColor = true;
            this.btn_Dejar.Click += new System.EventHandler(this.btn_Dejar_Click);
            // 
            // btn_Traer
            // 
            this.btn_Traer.Location = new System.Drawing.Point(617, 227);
            this.btn_Traer.Name = "btn_Traer";
            this.btn_Traer.Size = new System.Drawing.Size(117, 40);
            this.btn_Traer.TabIndex = 3;
            this.btn_Traer.Text = "&Traer";
            this.btn_Traer.UseVisualStyleBackColor = true;
            this.btn_Traer.Click += new System.EventHandler(this.btn_Traer_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(39, 420);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(134, 34);
            this.button3.TabIndex = 4;
            this.button3.Text = "&Salir";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(821, 414);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(117, 40);
            this.button1.TabIndex = 5;
            this.button1.Text = "&Imagen";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(995, 488);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.btn_Traer);
            this.Controls.Add(this.btn_Dejar);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label1);
            this.Name = "Main";
            this.Text = "Probar Copia al Clipboard";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button btn_Dejar;
        private System.Windows.Forms.Button btn_Traer;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button1;
    }
}

