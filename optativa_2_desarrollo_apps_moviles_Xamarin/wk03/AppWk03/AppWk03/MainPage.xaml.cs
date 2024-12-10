using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace AppWk03
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();

            //dtp.Date = DateTime.Now;
            //dtp.MinimumDate = new DateTime(1990,1,1);
            //dtp.MaximumDate = new DateTime(2030,12,31);

            // editor.Completed += Editor_Completed;
            // editor.TextChanged += Editor_TextChanged;

            // slider.Value = 50;
            // lblSlider.Text = slider.Value.ToString();

            // timePicker.Time = new TimeSpan(8,25,50);

            var HTMLSource = new HtmlWebViewSource();

            // Instancia una clase HTMLSource
            HTMLSource.Html = @"<html>
                            <body>
                                <h1>Hola Xamarin</h1>
                                <p>Bienvenid@s!!!</p>
                            </body>
                        </html>";

            webView.Source = HTMLSource;

        }

        private void Editor_TextChanged(object sender, TextChangedEventArgs e)
        {
            throw new NotImplementedException();
        }

        private void Editor_Completed(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        void Button_Clicked(System.Object sender, System.EventArgs e)
        {
            /* 
             *  Esto recibe
             *  DisplayAlert("string de el titulo del mensaje", "Texto de la alerta", "titulo de accion al hacerlick");
            */
            DisplayAlert("Alerta", "TEXT CHANGED", "Ok");
        }
        // En el code behind se programa todo lo que ocupemos que la herramienta haga o ejecute
        // de acuerdo a la accion que se ejecute.

        private void picker_SelectedIndexChanged(Object sender, EventArgs e)
        {
            // Podemos obtener elementos con el picker para poder
            // seleccionar a un elemento
            var elementoSeleccionado = picker.SelectedItem as String;
            DisplayAlert("Elemento Seleccionado", elementoSeleccionado, "Ok");
        }

        private void btnSimular_Clicked(System.Object sender, System.EventArgs e)
        {
            progress.ProgressTo(0.75, 250, Easing.Linear);
        }

        void SearchBar_SearchButtonPressed(Object sender, EventArgs e)
        {
            DisplayAlert("Buscando","Buscando resultados...","Ok");
        }

        void SearchBar_TextChanged(Object sender, TextChangedEventArgs e)
        {
            DisplayAlert("Seleccionado",
                        " Valor Anterior " + e.OldTextValue +
                        " Valor nuevo " + e.NewTextValue,
                        "Ok");
        }

        void Switch_Toggled(Object sender, ToggledEventArgs e)
        {
        }

        void Switch_Toggled_1(Object sender, ToggledEventArgs e)
        {
        }

        void webView_Navigated(System.Object sender, Xamarin.Forms.WebNavigatedEventArgs e)
        {
        }

        void webView_Navigated_1(System.Object sender, Xamarin.Forms.WebNavigatedEventArgs e)
        {
        }

        void webView_Navigated_2(System.Object sender, Xamarin.Forms.WebNavigatedEventArgs e)
        {
        }

        void webView_Navigating(System.Object sender, Xamarin.Forms.WebNavigatingEventArgs e)
        {
        }
    }
}
