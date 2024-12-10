namespace AppSoftware_Biblioteca
{
    partial class Libro
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
            this.components = new System.ComponentModel.Container();
            this.lbl_titleView_libros = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.btn_libro_agregar = new System.Windows.Forms.Button();
            this.lbl_libro_adquisicion = new System.Windows.Forms.Label();
            this.dtp_libro_agregar_fecha_adquirido = new System.Windows.Forms.DateTimePicker();
            this.txt_libro_agregar_tipo = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_pais = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_editorial = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_autor = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_titulo = new System.Windows.Forms.TextBox();
            this.txt_libro_agregar_isbn = new System.Windows.Forms.TextBox();
            this.lbl_libro_pais = new System.Windows.Forms.Label();
            this.lbl_libro_tipo = new System.Windows.Forms.Label();
            this.lbl_libro_editorial = new System.Windows.Forms.Label();
            this.lbl_libro_autor = new System.Windows.Forms.Label();
            this.lbl_libro_titulo = new System.Windows.Forms.Label();
            this.lbl_libro_isbn = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.btn_aceptar = new System.Windows.Forms.Button();
            this.btn_cancelar = new System.Windows.Forms.Button();
            this.dataGridView2 = new System.Windows.Forms.DataGridView();
            this.btn_VerRegistro = new System.Windows.Forms.Button();
            this.btn_guardar = new System.Windows.Forms.Button();
            this.btn_eliminar = new System.Windows.Forms.Button();
            this.btn_nuevo = new System.Windows.Forms.Button();
            this.btn_salir = new System.Windows.Forms.Button();
            this.btn_buscar_por_isbn = new System.Windows.Forms.Button();
            this.bindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.Txt_buscar_libro_titulo = new System.Windows.Forms.TextBox();
            this.lbl_busqueda_por_ISBN = new System.Windows.Forms.Label();
            this.msj_como_usar_libros = new System.Windows.Forms.Label();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bindingSource1)).BeginInit();
            this.SuspendLayout();
            // 
            // lbl_titleView_libros
            // 
            this.lbl_titleView_libros.AutoSize = true;
            this.lbl_titleView_libros.Font = new System.Drawing.Font("Lucida Bright", 45F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_titleView_libros.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(65)))), ((int)(((byte)(173)))), ((int)(((byte)(231)))));
            this.lbl_titleView_libros.Location = new System.Drawing.Point(14, 18);
            this.lbl_titleView_libros.Name = "lbl_titleView_libros";
            this.lbl_titleView_libros.Size = new System.Drawing.Size(239, 68);
            this.lbl_titleView_libros.TabIndex = 1;
            this.lbl_titleView_libros.Text = "LIBROS";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.btn_libro_agregar);
            this.groupBox1.Controls.Add(this.lbl_libro_adquisicion);
            this.groupBox1.Controls.Add(this.dtp_libro_agregar_fecha_adquirido);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_tipo);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_pais);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_editorial);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_autor);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_titulo);
            this.groupBox1.Controls.Add(this.txt_libro_agregar_isbn);
            this.groupBox1.Controls.Add(this.lbl_libro_pais);
            this.groupBox1.Controls.Add(this.lbl_libro_tipo);
            this.groupBox1.Controls.Add(this.lbl_libro_editorial);
            this.groupBox1.Controls.Add(this.lbl_libro_autor);
            this.groupBox1.Controls.Add(this.lbl_libro_titulo);
            this.groupBox1.Controls.Add(this.lbl_libro_isbn);
            this.groupBox1.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(24, 207);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(356, 328);
            this.groupBox1.TabIndex = 2;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Datos de libro";
            // 
            // btn_libro_agregar
            // 
            this.btn_libro_agregar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btn_libro_agregar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_libro_agregar.FlatAppearance.BorderSize = 0;
            this.btn_libro_agregar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_libro_agregar.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_libro_agregar.ForeColor = System.Drawing.Color.DarkGreen;
            this.btn_libro_agregar.Location = new System.Drawing.Point(171, 265);
            this.btn_libro_agregar.Name = "btn_libro_agregar";
            this.btn_libro_agregar.Size = new System.Drawing.Size(139, 41);
            this.btn_libro_agregar.TabIndex = 264;
            this.btn_libro_agregar.Text = "Agregar libro";
            this.btn_libro_agregar.UseVisualStyleBackColor = false;
            this.btn_libro_agregar.Click += new System.EventHandler(this.btn_libro_agregar_Click);
            // 
            // lbl_libro_adquisicion
            // 
            this.lbl_libro_adquisicion.AutoSize = true;
            this.lbl_libro_adquisicion.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_adquisicion.Location = new System.Drawing.Point(12, 221);
            this.lbl_libro_adquisicion.Name = "lbl_libro_adquisicion";
            this.lbl_libro_adquisicion.Size = new System.Drawing.Size(122, 18);
            this.lbl_libro_adquisicion.TabIndex = 265;
            this.lbl_libro_adquisicion.Text = "Fecha adquirido";
            // 
            // dtp_libro_agregar_fecha_adquirido
            // 
            this.dtp_libro_agregar_fecha_adquirido.Location = new System.Drawing.Point(140, 218);
            this.dtp_libro_agregar_fecha_adquirido.Name = "dtp_libro_agregar_fecha_adquirido";
            this.dtp_libro_agregar_fecha_adquirido.Size = new System.Drawing.Size(200, 26);
            this.dtp_libro_agregar_fecha_adquirido.TabIndex = 264;
            // 
            // txt_libro_agregar_tipo
            // 
            this.txt_libro_agregar_tipo.Location = new System.Drawing.Point(140, 186);
            this.txt_libro_agregar_tipo.Name = "txt_libro_agregar_tipo";
            this.txt_libro_agregar_tipo.Size = new System.Drawing.Size(200, 26);
            this.txt_libro_agregar_tipo.TabIndex = 11;
            // 
            // txt_libro_agregar_pais
            // 
            this.txt_libro_agregar_pais.Location = new System.Drawing.Point(140, 155);
            this.txt_libro_agregar_pais.Name = "txt_libro_agregar_pais";
            this.txt_libro_agregar_pais.Size = new System.Drawing.Size(200, 26);
            this.txt_libro_agregar_pais.TabIndex = 10;
            // 
            // txt_libro_agregar_editorial
            // 
            this.txt_libro_agregar_editorial.Location = new System.Drawing.Point(140, 124);
            this.txt_libro_agregar_editorial.Name = "txt_libro_agregar_editorial";
            this.txt_libro_agregar_editorial.Size = new System.Drawing.Size(200, 26);
            this.txt_libro_agregar_editorial.TabIndex = 9;
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
            // lbl_libro_pais
            // 
            this.lbl_libro_pais.AutoSize = true;
            this.lbl_libro_pais.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_pais.Location = new System.Drawing.Point(25, 159);
            this.lbl_libro_pais.Name = "lbl_libro_pais";
            this.lbl_libro_pais.Size = new System.Drawing.Size(109, 18);
            this.lbl_libro_pais.TabIndex = 5;
            this.lbl_libro_pais.Text = "País de origen";
            // 
            // lbl_libro_tipo
            // 
            this.lbl_libro_tipo.AutoSize = true;
            this.lbl_libro_tipo.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_tipo.Location = new System.Drawing.Point(40, 190);
            this.lbl_libro_tipo.Name = "lbl_libro_tipo";
            this.lbl_libro_tipo.Size = new System.Drawing.Size(94, 18);
            this.lbl_libro_tipo.TabIndex = 4;
            this.lbl_libro_tipo.Text = "Tipo de libro";
            // 
            // lbl_libro_editorial
            // 
            this.lbl_libro_editorial.AutoSize = true;
            this.lbl_libro_editorial.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_libro_editorial.Location = new System.Drawing.Point(68, 128);
            this.lbl_libro_editorial.Name = "lbl_libro_editorial";
            this.lbl_libro_editorial.Size = new System.Drawing.Size(66, 18);
            this.lbl_libro_editorial.TabIndex = 3;
            this.lbl_libro_editorial.Text = "Editorial";
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
            this.lbl_libro_titulo.Location = new System.Drawing.Point(34, 66);
            this.lbl_libro_titulo.Name = "lbl_libro_titulo";
            this.lbl_libro_titulo.Size = new System.Drawing.Size(100, 18);
            this.lbl_libro_titulo.TabIndex = 1;
            this.lbl_libro_titulo.Text = "Título de libro";
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
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(407, 124);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(62, 18);
            this.label7.TabIndex = 13;
            this.label7.Text = "AUTOR";
            // 
            // dataGridView1
            // 
            this.dataGridView1.BackgroundColor = System.Drawing.Color.White;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(407, 157);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(240, 134);
            this.dataGridView1.TabIndex = 14;
            // 
            // btn_aceptar
            // 
            this.btn_aceptar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btn_aceptar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_aceptar.FlatAppearance.BorderSize = 0;
            this.btn_aceptar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_aceptar.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_aceptar.ForeColor = System.Drawing.Color.DarkGreen;
            this.btn_aceptar.Location = new System.Drawing.Point(802, 157);
            this.btn_aceptar.Name = "btn_aceptar";
            this.btn_aceptar.Size = new System.Drawing.Size(95, 41);
            this.btn_aceptar.TabIndex = 28;
            this.btn_aceptar.Text = "Aceptar";
            this.btn_aceptar.UseVisualStyleBackColor = false;
            // 
            // btn_cancelar
            // 
            this.btn_cancelar.BackColor = System.Drawing.Color.Tomato;
            this.btn_cancelar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_cancelar.FlatAppearance.BorderSize = 0;
            this.btn_cancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_cancelar.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_cancelar.ForeColor = System.Drawing.Color.DarkRed;
            this.btn_cancelar.Location = new System.Drawing.Point(677, 157);
            this.btn_cancelar.Name = "btn_cancelar";
            this.btn_cancelar.Size = new System.Drawing.Size(95, 41);
            this.btn_cancelar.TabIndex = 29;
            this.btn_cancelar.Text = "Cancelar";
            this.btn_cancelar.UseVisualStyleBackColor = false;
            // 
            // dataGridView2
            // 
            this.dataGridView2.BackgroundColor = System.Drawing.Color.White;
            this.dataGridView2.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView2.Location = new System.Drawing.Point(407, 306);
            this.dataGridView2.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.dataGridView2.Name = "dataGridView2";
            this.dataGridView2.Size = new System.Drawing.Size(491, 104);
            this.dataGridView2.TabIndex = 202;
            // 
            // btn_VerRegistro
            // 
            this.btn_VerRegistro.BackColor = System.Drawing.Color.DodgerBlue;
            this.btn_VerRegistro.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_VerRegistro.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_VerRegistro.FlatAppearance.BorderSize = 0;
            this.btn_VerRegistro.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_VerRegistro.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_VerRegistro.ForeColor = System.Drawing.Color.White;
            this.btn_VerRegistro.Location = new System.Drawing.Point(407, 428);
            this.btn_VerRegistro.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.btn_VerRegistro.Name = "btn_VerRegistro";
            this.btn_VerRegistro.Size = new System.Drawing.Size(84, 43);
            this.btn_VerRegistro.TabIndex = 207;
            this.btn_VerRegistro.Text = "Ver Registros";
            this.btn_VerRegistro.UseVisualStyleBackColor = false;
            // 
            // btn_guardar
            // 
            this.btn_guardar.BackColor = System.Drawing.Color.DodgerBlue;
            this.btn_guardar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_guardar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_guardar.FlatAppearance.BorderSize = 0;
            this.btn_guardar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_guardar.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_guardar.ForeColor = System.Drawing.Color.White;
            this.btn_guardar.Location = new System.Drawing.Point(508, 428);
            this.btn_guardar.Name = "btn_guardar";
            this.btn_guardar.Size = new System.Drawing.Size(84, 43);
            this.btn_guardar.TabIndex = 209;
            this.btn_guardar.Text = "Guardar";
            this.btn_guardar.UseVisualStyleBackColor = false;
            this.btn_guardar.Click += new System.EventHandler(this.btn_guardar_Click_1);
            // 
            // btn_eliminar
            // 
            this.btn_eliminar.BackColor = System.Drawing.Color.DodgerBlue;
            this.btn_eliminar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_eliminar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_eliminar.FlatAppearance.BorderSize = 0;
            this.btn_eliminar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_eliminar.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_eliminar.ForeColor = System.Drawing.Color.White;
            this.btn_eliminar.Location = new System.Drawing.Point(609, 428);
            this.btn_eliminar.Name = "btn_eliminar";
            this.btn_eliminar.Size = new System.Drawing.Size(84, 43);
            this.btn_eliminar.TabIndex = 211;
            this.btn_eliminar.Text = "Eliminar";
            this.btn_eliminar.UseVisualStyleBackColor = false;
            this.btn_eliminar.Click += new System.EventHandler(this.btn_eliminar_Click_1);
            // 
            // btn_nuevo
            // 
            this.btn_nuevo.BackColor = System.Drawing.Color.DodgerBlue;
            this.btn_nuevo.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_nuevo.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_nuevo.FlatAppearance.BorderSize = 0;
            this.btn_nuevo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_nuevo.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_nuevo.ForeColor = System.Drawing.Color.White;
            this.btn_nuevo.Location = new System.Drawing.Point(710, 428);
            this.btn_nuevo.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.btn_nuevo.Name = "btn_nuevo";
            this.btn_nuevo.Size = new System.Drawing.Size(84, 43);
            this.btn_nuevo.TabIndex = 258;
            this.btn_nuevo.Text = "Nuevo";
            this.btn_nuevo.UseVisualStyleBackColor = false;
            this.btn_nuevo.Click += new System.EventHandler(this.btn_nuevo_Click_1);
            // 
            // btn_salir
            // 
            this.btn_salir.BackColor = System.Drawing.Color.DodgerBlue;
            this.btn_salir.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_salir.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_salir.FlatAppearance.BorderSize = 0;
            this.btn_salir.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_salir.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_salir.ForeColor = System.Drawing.Color.White;
            this.btn_salir.Location = new System.Drawing.Point(811, 428);
            this.btn_salir.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.btn_salir.Name = "btn_salir";
            this.btn_salir.Size = new System.Drawing.Size(84, 43);
            this.btn_salir.TabIndex = 259;
            this.btn_salir.Text = "Salir";
            this.btn_salir.UseVisualStyleBackColor = false;
            this.btn_salir.Click += new System.EventHandler(this.btn_salir_Click_1);
            // 
            // btn_buscar_por_isbn
            // 
            this.btn_buscar_por_isbn.BackColor = System.Drawing.Color.DodgerBlue;
            this.btn_buscar_por_isbn.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_buscar_por_isbn.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_buscar_por_isbn.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_buscar_por_isbn.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Bold);
            this.btn_buscar_por_isbn.ForeColor = System.Drawing.Color.White;
            this.btn_buscar_por_isbn.Location = new System.Drawing.Point(225, 158);
            this.btn_buscar_por_isbn.Name = "btn_buscar_por_isbn";
            this.btn_buscar_por_isbn.Size = new System.Drawing.Size(102, 43);
            this.btn_buscar_por_isbn.TabIndex = 260;
            this.btn_buscar_por_isbn.Text = "Buscar ISBN";
            this.btn_buscar_por_isbn.UseVisualStyleBackColor = false;
            this.btn_buscar_por_isbn.Click += new System.EventHandler(this.btn_buscar_por_isbn_Click_1);
            // 
            // Txt_buscar_libro_titulo
            // 
            this.Txt_buscar_libro_titulo.Font = new System.Drawing.Font("Arial", 12F);
            this.Txt_buscar_libro_titulo.Location = new System.Drawing.Point(24, 166);
            this.Txt_buscar_libro_titulo.Name = "Txt_buscar_libro_titulo";
            this.Txt_buscar_libro_titulo.Size = new System.Drawing.Size(180, 26);
            this.Txt_buscar_libro_titulo.TabIndex = 261;
            // 
            // lbl_busqueda_por_ISBN
            // 
            this.lbl_busqueda_por_ISBN.AutoSize = true;
            this.lbl_busqueda_por_ISBN.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_busqueda_por_ISBN.Location = new System.Drawing.Point(24, 140);
            this.lbl_busqueda_por_ISBN.Name = "lbl_busqueda_por_ISBN";
            this.lbl_busqueda_por_ISBN.Size = new System.Drawing.Size(146, 18);
            this.lbl_busqueda_por_ISBN.TabIndex = 262;
            this.lbl_busqueda_por_ISBN.Text = "Búsqueda por ISBN";
            // 
            // msj_como_usar_libros
            // 
            this.msj_como_usar_libros.AutoSize = true;
            this.msj_como_usar_libros.Font = new System.Drawing.Font("Arial", 10F, System.Drawing.FontStyle.Italic);
            this.msj_como_usar_libros.ForeColor = System.Drawing.SystemColors.ControlDark;
            this.msj_como_usar_libros.Location = new System.Drawing.Point(24, 98);
            this.msj_como_usar_libros.Name = "msj_como_usar_libros";
            this.msj_como_usar_libros.Size = new System.Drawing.Size(336, 32);
            this.msj_como_usar_libros.TabIndex = 263;
            this.msj_como_usar_libros.Text = "Antes de agregar un libro nuevo, por favor verifique \r\nsi el ISBN del libro ya ex" +
    "iste en el sistema";
            // 
            // Libro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(922, 558);
            this.Controls.Add(this.msj_como_usar_libros);
            this.Controls.Add(this.lbl_busqueda_por_ISBN);
            this.Controls.Add(this.Txt_buscar_libro_titulo);
            this.Controls.Add(this.btn_buscar_por_isbn);
            this.Controls.Add(this.btn_salir);
            this.Controls.Add(this.btn_nuevo);
            this.Controls.Add(this.btn_eliminar);
            this.Controls.Add(this.btn_guardar);
            this.Controls.Add(this.btn_VerRegistro);
            this.Controls.Add(this.dataGridView2);
            this.Controls.Add(this.btn_cancelar);
            this.Controls.Add(this.btn_aceptar);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.lbl_titleView_libros);
            this.Name = "Libro";
            this.ShowIcon = false;
            this.Text = "Libro";
            this.Load += new System.EventHandler(this.Libro_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bindingSource1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_titleView_libros;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox txt_libro_agregar_tipo;
        private System.Windows.Forms.TextBox txt_libro_agregar_pais;
        private System.Windows.Forms.TextBox txt_libro_agregar_editorial;
        private System.Windows.Forms.TextBox txt_libro_agregar_autor;
        private System.Windows.Forms.TextBox txt_libro_agregar_titulo;
        private System.Windows.Forms.TextBox txt_libro_agregar_isbn;
        private System.Windows.Forms.Label lbl_libro_pais;
        private System.Windows.Forms.Label lbl_libro_tipo;
        private System.Windows.Forms.Label lbl_libro_editorial;
        private System.Windows.Forms.Label lbl_libro_autor;
        private System.Windows.Forms.Label lbl_libro_titulo;
        private System.Windows.Forms.Label lbl_libro_isbn;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Button btn_aceptar;
        private System.Windows.Forms.Button btn_cancelar;
        private System.Windows.Forms.DataGridView dataGridView2;
        private System.Windows.Forms.Button btn_VerRegistro;
        private System.Windows.Forms.Button btn_guardar;
        private System.Windows.Forms.Button btn_eliminar;
        private System.Windows.Forms.Button btn_nuevo;
        private System.Windows.Forms.Button btn_salir;
        private System.Windows.Forms.Button btn_buscar_por_isbn;
        private System.Windows.Forms.BindingSource bindingSource1;
        private System.Windows.Forms.TextBox Txt_buscar_libro_titulo;
        private System.Windows.Forms.Label lbl_busqueda_por_ISBN;
        private System.Windows.Forms.Label msj_como_usar_libros;
        private System.Windows.Forms.DateTimePicker dtp_libro_agregar_fecha_adquirido;
        private System.Windows.Forms.Label lbl_libro_adquisicion;
        private System.Windows.Forms.Button btn_libro_agregar;
    }
}