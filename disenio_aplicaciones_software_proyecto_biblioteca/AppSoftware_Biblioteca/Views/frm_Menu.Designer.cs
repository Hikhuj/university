namespace AppSoftware_Biblioteca.Views
{
    partial class frm_Menu
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
            this.Btn_abrirLibros = new System.Windows.Forms.Button();
            this.Btn_abrirEstudiantes = new System.Windows.Forms.Button();
            this.Btn_abrirPrestamos = new System.Windows.Forms.Button();
            this.Lbl_accion = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Btn_abrirLibros
            // 
            this.Btn_abrirLibros.BackColor = System.Drawing.Color.DodgerBlue;
            this.Btn_abrirLibros.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.Btn_abrirLibros.Cursor = System.Windows.Forms.Cursors.Hand;
            this.Btn_abrirLibros.FlatAppearance.BorderSize = 0;
            this.Btn_abrirLibros.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Btn_abrirLibros.Font = new System.Drawing.Font("Arial", 20F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Btn_abrirLibros.ForeColor = System.Drawing.Color.White;
            this.Btn_abrirLibros.Location = new System.Drawing.Point(361, 129);
            this.Btn_abrirLibros.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.Btn_abrirLibros.Name = "Btn_abrirLibros";
            this.Btn_abrirLibros.Size = new System.Drawing.Size(197, 78);
            this.Btn_abrirLibros.TabIndex = 208;
            this.Btn_abrirLibros.Text = "Ir a libros";
            this.Btn_abrirLibros.UseVisualStyleBackColor = false;
            this.Btn_abrirLibros.Click += new System.EventHandler(this.Btn_abrirLibros_Click);
            // 
            // Btn_abrirEstudiantes
            // 
            this.Btn_abrirEstudiantes.BackColor = System.Drawing.Color.DodgerBlue;
            this.Btn_abrirEstudiantes.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.Btn_abrirEstudiantes.Cursor = System.Windows.Forms.Cursors.Hand;
            this.Btn_abrirEstudiantes.FlatAppearance.BorderSize = 0;
            this.Btn_abrirEstudiantes.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Btn_abrirEstudiantes.Font = new System.Drawing.Font("Arial", 20F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Btn_abrirEstudiantes.ForeColor = System.Drawing.Color.White;
            this.Btn_abrirEstudiantes.Location = new System.Drawing.Point(361, 238);
            this.Btn_abrirEstudiantes.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.Btn_abrirEstudiantes.Name = "Btn_abrirEstudiantes";
            this.Btn_abrirEstudiantes.Size = new System.Drawing.Size(197, 78);
            this.Btn_abrirEstudiantes.TabIndex = 209;
            this.Btn_abrirEstudiantes.Text = "Ir a estudiantes";
            this.Btn_abrirEstudiantes.UseVisualStyleBackColor = false;
            this.Btn_abrirEstudiantes.Click += new System.EventHandler(this.Btn_abrirEstudiantes_Click);
            // 
            // Btn_abrirPrestamos
            // 
            this.Btn_abrirPrestamos.BackColor = System.Drawing.Color.DodgerBlue;
            this.Btn_abrirPrestamos.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.Btn_abrirPrestamos.Cursor = System.Windows.Forms.Cursors.Hand;
            this.Btn_abrirPrestamos.FlatAppearance.BorderSize = 0;
            this.Btn_abrirPrestamos.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Btn_abrirPrestamos.Font = new System.Drawing.Font("Arial", 20F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Btn_abrirPrestamos.ForeColor = System.Drawing.Color.White;
            this.Btn_abrirPrestamos.Location = new System.Drawing.Point(93, 238);
            this.Btn_abrirPrestamos.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.Btn_abrirPrestamos.Name = "Btn_abrirPrestamos";
            this.Btn_abrirPrestamos.Size = new System.Drawing.Size(197, 78);
            this.Btn_abrirPrestamos.TabIndex = 210;
            this.Btn_abrirPrestamos.Text = "Ir a prestamos";
            this.Btn_abrirPrestamos.UseVisualStyleBackColor = false;
            // 
            // Lbl_accion
            // 
            this.Lbl_accion.AutoSize = true;
            this.Lbl_accion.Font = new System.Drawing.Font("Arial", 30F, System.Drawing.FontStyle.Bold);
            this.Lbl_accion.Location = new System.Drawing.Point(98, 115);
            this.Lbl_accion.Name = "Lbl_accion";
            this.Lbl_accion.Size = new System.Drawing.Size(192, 92);
            this.Lbl_accion.TabIndex = 211;
            this.Lbl_accion.Text = "Elija una \r\nopción\r\n";
            // 
            // frm_Menu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.Lbl_accion);
            this.Controls.Add(this.Btn_abrirPrestamos);
            this.Controls.Add(this.Btn_abrirEstudiantes);
            this.Controls.Add(this.Btn_abrirLibros);
            this.Name = "frm_Menu";
            this.ShowIcon = false;
            this.Text = "frm_Menu";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button Btn_abrirLibros;
        private System.Windows.Forms.Button Btn_abrirEstudiantes;
        private System.Windows.Forms.Button Btn_abrirPrestamos;
        private System.Windows.Forms.Label Lbl_accion;
    }
}