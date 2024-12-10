using System;
using GalaSoft.MvvmLight.Command;
using ProyectoFinal.Model;
using ProyectoFinal.View;
using System.Collections.Generic;
using System.Text;
using System.Windows.Input;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
  public  class RegistroViewModel : BaseViewModel
    {
        //Atributos
        public string correo;
        public string password;
        public string name;


        //Propiedades
        public string EmailTxt
        {
            get { return this.correo; }
            set { SetValue(ref this.correo, value); }
        }

        public string PasswordTxt
        {
            get { return this.password; }
            set { SetValue(ref this.password, value); }
        }

        public string NameTxt
        {
            get { return this.name; }
            set { SetValue(ref this.name, value); }
        }


   

        public ICommand RegisterCommand
        {
            get
            {
                return new RelayCommand(RegistroM); //Ejecuta el metodo registro
            }
        }
        

      
        private async void RegistroM()
        {
            //VALIDACIONES POR SI UN CAMPO ESTA VACIO
            if (string.IsNullOrEmpty(this.correo))
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
                     "Por favor introduzca una contraseña.",
                    "Aceptar");
                return;
            }

          

            if (string.IsNullOrEmpty(this.name))
            {
                await Application.Current.MainPage.DisplayAlert(
                    "Error",
                    "Por favor introduzca un nombre.",
                    "Aceptar");
                return;
            }

         

            //Creamos nuestra variable user para mandar con los datos a nuestra base
            var user = new UsuarioModel
            {
                EmailField = correo,
                PasswordField = password,
                NamesField = name,
            };

            //GUARDAMOS LOS DATOS EN LA BASE
            await App.Database.SaveUserModelAsync(user);

            await Application.Current.MainPage.DisplayAlert("Se ha registrado correctamente", "Bienvenido " + name.ToString() + " a nuestra App", "Ok");

           

            await Application.Current.MainPage.Navigation.PushAsync(new Login());
         
        }
 

     


    }
}
