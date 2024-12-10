using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Net.Http;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using AppClimas.Model;
using Newtonsoft.Json;
using Xamarin.Forms;

namespace AppClimas.ViewModel
{
    public class ClimaPageViewModel : INotifyPropertyChanged
    {
        private ClimaData data;

        public ClimaData Data
        {
            get => data;
            set {
                data = value;
                OnPropertyChanged();
            }
        }

        #region PropertyChanged
        public event PropertyChangedEventHandler PropertyChanged;

        private void OnPropertyChanged([CallerMemberName] string propertyName = null)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        public ICommand SearchCommand { get; set; }


        public ClimaPageViewModel()
        {
            // Vamos a crear un parametro, para buscar un lugar enviandole un parametro
            SearchCommand = new Command(async (busqueda) =>
            {
                // X, Y
                var entrada = busqueda as string;
                var datos = entrada.Split(',');
                var lat = datos[0]; // latitud en la posicion 0
                var lon = datos[1];

                await GetData("$https://api.weatherbit.io/v2.0/current?lat={lat}&lon={lon}&lang=es&key=461cc7ce269f4962acb07dcc356c51e8");
            });
        }

        // yo le di el ASYNC y el URL var Name
        // Ya que la funcion es Asyncrona, entonces tambien este method
        private async Task GetData(string url)
        {
            // Necesitamos crear un cliente
            var cliente = new HttpClient();

            // Tambien necesitamos una respuesta
            // como estamos haciendo un AWAIT, ocupamos que obtenga un GETASYNC()
            var respuesta = await cliente.GetAsync(url);
            // Con esto nos va a dar un code number del error que retorne si no se completa
            // el request del URL
            // se parece mucho a JAVASCRIPT
            respuesta.EnsureSuccessStatusCode();

            // Necesitamos entregar la respuesta a una variable
            var jsonResultado = await respuesta.Content.ReadAsStringAsync();
            // Nuestro generico es climaData
            var resultado = JsonConvert.DeserializeObject<ClimaData>(jsonResultado);

            Data = resultado;
        }
    }
}
