using System;
using AppAmigos.Droid.Services;
using AppAmigos.Services;
using Xamarin.Forms;
using System.IO;

[assembly:Dependency(typeof(FileHelper))]
namespace AppAmigos.Droid.Services
{
    public class FileHelper : IFileHelper
    {
        public  string GetLocalFilePath(string fileName)
        {
            string path = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
            return Path.Combine(path, fileName);
        }
    }
}
