using GalaSoft.MvvmLight.Command;
using ProyectoFinal.DatabaseQ;
using ProyectoFinal.Model;
using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Input;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class LoginViewModel : BaseViewModel
    {
        //Atributos
        public string email;
        public string password;

        //PROPIEDADES
        public string EmailTxt
        {
            get { return this.email; }
            set { SetValue(ref this.email, value); }
        }

        public string PasswordTxt
        {
            get { return this.password; }
            set { SetValue(ref this.password, value); }
        }




        #region Commands
        public ICommand LoginCommand //Activamos nuestro metodo de login
        {
            get
            {
                return new RelayCommand(LoginMetodo);//Llamamos al metodo
            }
        }
        #endregion




        public async void LoginMetodo()//Nuestro metodo login
        {
            if (string.IsNullOrEmpty(this.email))// Validaciones por si un campo esta vacio
            {
                await Application.Current.MainPage.DisplayAlert(
                    "Error",
                    "Por favor introduzca un correo.",
                    "Aceptar");
                return;
            }
            if (string.IsNullOrEmpty(this.password))
            {
                await Application.Current.MainPage.DisplayAlert(
                    "Error",
                    "Por favor introduzca la contraseña.",
                    "Aceptar");
                return;
            }

            List<UsuarioModel> e = App.Database.GetUsersValidate(email, password).Result; //Crea una lista que valida que la informacion exista

            if (e.Count == 0) //Si no encuentra un dato, muestra mensaje que esta incorrecto
            {
                await Application.Current.MainPage.DisplayAlert(
                          "Error",
                          "Correo o contraseña incorrectos",
                          "Accept");
            }
            else if (e.Count > 0)//Si hay datos entrara correctamente a la sesion
            {
                Globals.usuario = email;
          //     string Nombre = Convert.ToString( App.Database.GetName(email).Result);
          //      await Application.Current.MainPage.DisplayAlert("nombre", "Bienvenido " + Nombre, "Ok");
                Console.WriteLine("\n\n\n\n\n\n\n\n\n---------------------" + Globals.usuario + "---------------\n\n\n\n\n\n\n\n\n\n\n");
                await Application.Current.MainPage.DisplayAlert("Ha iniciado sesion correctamente", "Bienvenido ", "Ok");
                await Application.Current.MainPage.Navigation.PushAsync(new MainPage());//Inicio de sesion exitoso
            }
        }
    }
}

