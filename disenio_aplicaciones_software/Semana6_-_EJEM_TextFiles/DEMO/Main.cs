using System;

using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;


using System.Security;


namespace DEMO
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        private void btn_Traer_Click(object sender, EventArgs e)
        {

            StreamWriter sw = new StreamWriter("C:\\Users\\roger\\Desktop\\Test\\test.txt");

            for (int i = 1; i <= 100; i++)
            {
                sw.WriteLine(i);
            }

            sw.Close();

        }

        private void btn_Dejar_Click(object sender, EventArgs e)
        {

            int counter = 0;
            string line;

            // Read the file and display it line by line;
            System.IO.StreamReader file = new System.IO.StreamReader(textBox2.Text, Encoding.Default);
            textBox1.Text = file.ReadToEnd();
        }



        private void button3_Click(object sender, EventArgs e)
        {
            //this.close();

            Application.Exit();

        }
        private void SetText(string text)
        {
            //textBox1.Text = text;
            textBox2.Text = openFileDialog1.FileName;
        }

        private void button4_Click(object sender, EventArgs e)
        {


            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                try
                {
                    var sr = new StreamReader(openFileDialog1.FileName);
                    SetText(sr.ReadToEnd());
                    //pictureBox1.Image = Image.FromFile(textBox1.Text);

                }
                catch (SecurityException ex)
                {
                    MessageBox.Show($"Security error.\n\nError message: {ex.Message}\n\n" +
                    $"Details:\n\n{ex.StackTrace}");
                }
            }
        }

        private void Main_Load(object sender, EventArgs e)
        {

        }
    }
}
