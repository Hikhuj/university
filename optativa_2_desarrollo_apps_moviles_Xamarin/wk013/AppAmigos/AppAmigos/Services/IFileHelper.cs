using AppAmigos.Services;
using Xamarin.Forms;

namespace AppAmigos.Services
{
    // Se debe crear de forma Interface
    public interface IFileHelper
    {
        // Esta clase lo que nos va a permitir es integrar servicios para implementar
        // para que nos devuelva la interconexion que se ocupe consumir para SQLite

        string GetLocalFilePath(string fileName);
    }
}
