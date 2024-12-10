namespace AppSoftware_Biblioteca.Views
{
    partial class frm_PrestamoView
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
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.btn_prestamo_agregar = new System.Windows.Forms.Button();
            this.lbl_prestamo_retorno = new System.Windows.Forms.Label();
            this.dtp_libro_agregar_fecha_adquirido = new System.Windows.Forms.DateTimePicker();
            this.txt_libro_agregar_autor = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_titulo = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_isbn = new System.Windows.Forms.TextBox();
            this.lbl_libro_autor = new System.Windows.Forms.Label();
            this.lbl_libro_titulo = new System.Windows.Forms.Label();
            this.lbl_libro_isbn = new System.Windows.Forms.Label();
            this.lbl_titleView_libros = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.dateTimePicker1);
            this.groupBox1.Controls.Add(this.btn_prestamo_agregar);
            this.groupBox1.Controls.Add(this.lbl_prestamo_retorno);
            this.groupBox1.Controls.Add(this.dtp_libro_agregar_fecha_adquirido);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_autor);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_titulo);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_isbn);
            this.groupBox1.Controls.Add(this.lbl_libro_autor);
            this.groupBox1.Controls.Add(this.lbl_libro_titulo);
            this.groupBox1.Controls.Add(this.lbl_libro_isbn);
            this.groupBox1.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(28, 106);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(356, 267);
            this.groupBox1.TabIndex = 265;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Datos de libro";
            // 
            // btn_prestamo_agregar
            // 
            this.btn_prestamo_agregar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btn_prestamo_agregar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_prestamo_agregar.FlatAppearance.BorderSize = 0;
            this.btn_prestamo_agregar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_prestamo_agregar.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_prestamo_agregar.ForeColor = System.Drawing.Color.DarkGreen;
            this.btn_prestamo_agregar.Location = new System.Drawing.Point(171, 204);
            this.btn_prestamo_agregar.Name = "btn_prestamo_agregar";
            this.btn_prestamo_agregar.Size = new System.Drawing.Size(139, 41);
            this.btn_prestamo_agregar.TabIndex = 264;
            this.btn_prestamo_agregar.Text = "Crear Préstamo";
            this.btn_prestamo_agregar.UseVisualStyleBackColor = false;
            // 
            // lbl_prestamo_retorno
            // 
            this.lbl_prestamo_retorno.AutoSize = true;
            this.lbl_prestamo_retorno.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_prestamo_retorno.Location = new System.Drawing.Point(29, 160);
            this.lbl_prestamo_retorno.Name = "lbl_prestamo_retorno";
            this.lbl_prestamo_retorno.Size = new System.Drawing.Size(105, 18);
            this.lbl_prestamo_retorno.TabIndex = 265;
            this.lbl_prestamo_retorno.Text = "Fecha retorno";
            // 
            // dtp_libro_agregar_fecha_adquirido
            // 
            this.dtp_libro_agregar_fecha_adquirido.Location = new System.Drawing.Point(140, 157);
            this.dtp_libro_agregar_fecha_adquirido.Name = "dtp_libro_agregar_fecha_adquirido";
            this.dtp_libro_agregar_fecha_adquirido.Size = new System.Drawing.Size(200, 26);
            this.dtp_libro_agregar_fecha_adquirido.TabIndex = 264;
            // 
            // txt_libro_agregar_autor
            // 
            this.txt_libro_agregar_autor.Location = new System.Drawing.Point(140, 93);
            this.txt_libro_agregar_autor.Name = "txt_libro_agregar_autor";
            this.txt_libro_agregar_autor.Size = new System.Drawing.Size(200, 26);
            this.txt_libro_agregar_autor.TabIndex = 8;
            // 
            // txt_libro_agregar_titulo
            // 
            this.txt_libro_agregar_titulo.Location = new System.Drawing.Point(140, 62);
            this.txt_libro_agregar_titulo.Name = "txt_libro_agregar_titulo";
            this.txt_libro_agregar_titulo.Size = new System.Drawing.Size(200, 26);
            this.txt_libro_agregar_titulo.TabIndex = 7;
            // 
            // txt_libro_agregar_isbn
            // 
            this.txt_libro_agregar_isbn.Location = new System.Drawing.Point(140, 31);
            this.txt_libro_agregar_isbn.Name = "txt_libro_agregar_isbn";
            this.txt_libro_agregar_isbn.Size = new System.Drawing.Size(200, 26);
            this.txt_libro_agregar_isbn.TabIndex = 6;
            // 
            // lbl_libro_autor
            // 
            this.lbl_libro_autor.AutoSize = true;
            this.lbl_libro_autor.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_autor.Location = new System.Drawing.Point(89, 96);
            this.lbl_libro_autor.Name = "lbl_libro_autor";
            this.lbl_libro_autor.Size = new System.Drawing.Size(45, 18);
            this.lbl_libro_autor.TabIndex = 2;
            this.lbl_libro_autor.Text = "Autor";
            // 
            // lbl_libro_titulo
            // 
            this.lbl_libro_titulo.AutoSize = true;
            this.lbl_libro_titulo.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_titulo.Location = new System.Drawing.Point(26, 66);
            this.lbl_libro_titulo.Name = "lbl_libro_titulo";
            this.lbl_libro_titulo.Size = new System.Drawing.Size(108, 18);
            this.lbl_libro_titulo.TabIndex = 1;
            this.lbl_libro_titulo.Text = "Tipo préstamo";
            // 
            // lbl_libro_isbn
            // 
            this.lbl_libro_isbn.AutoSize = true;
            this.lbl_libro_isbn.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_isbn.Location = new System.Drawing.Point(34, 35);
            this.lbl_libro_isbn.Name = "lbl_libro_isbn";
            this.lbl_libro_isbn.Size = new System.Drawing.Size(100, 18);
            this.lbl_libro_isbn.TabIndex = 0;
            this.lbl_libro_isbn.Text = "Código ISBN";
            // 
            // lbl_titleView_libros
            // 
            this.lbl_titleView_libros.AutoSize = true;
            this.lbl_titleView_libros.Font = new System.Drawing.Font("Lucida Bright", 45F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_titleView_libros.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(65)))), ((int)(((byte)(173)))), ((int)(((byte)(231)))));
            this.lbl_titleView_libros.Location = new System.Drawing.Point(16, 20);
            this.lbl_titleView_libros.Name = "lbl_titleView_libros";
            this.lbl_titleView_libros.Size = new System.Drawing.Size(388, 68);
            this.lbl_titleView_libros.TabIndex = 264;
            this.lbl_titleView_libros.Text = "PRÉSTAMOS";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 128);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(122, 18);
            this.label1.TabIndex = 267;
            this.label1.Text = "Fecha préstamo";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Location = new System.Drawing.Point(140, 125);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(200, 26);
            this.dateTimePicker1.TabIndex = 266;
            // 
            // frm_PrestamoView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(416, 402);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.lbl_titleView_libros);
            this.Name = "frm_PrestamoView";
            this.Text = "frm_PrestamoView";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Button btn_prestamo_agregar;
        private System.Windows.Forms.Label lbl_prestamo_retorno;
        private System.Windows.Forms.DateTimePicker dtp_libro_agregar_fecha_adquirido;
        private System.Windows.Forms.TextBox txt_libro_agregar_autor;
        private System.Windows.Forms.TextBox txt_libro_agregar_titulo;
        private System.Windows.Forms.TextBox txt_libro_agregar_isbn;
        private System.Windows.Forms.Label lbl_libro_autor;
        private System.Windows.Forms.Label lbl_libro_titulo;
        private System.Windows.Forms.Label lbl_libro_isbn;
        private System.Windows.Forms.Label lbl_titleView_libros;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
    }
}