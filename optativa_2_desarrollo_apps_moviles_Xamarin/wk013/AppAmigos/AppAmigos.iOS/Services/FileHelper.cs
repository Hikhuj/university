using System;
using Xamarin.Forms;
using System.IO;
using AppAmigos.iOS.Services;
using AppAmigos.Services;

[assembly: Dependency(typeof(FileHelper))]
namespace AppAmigos.iOS.Services
{
    public class FileHelper : IFileHelper
    {
        public string GetLocalFilePath(string fileName)
        {
            string docFolder =
                Environment.GetFolderPath(Environment.SpecialFolder.Personal);

            string libFolder =
                Path.Combine(docFolder, "..","Database");

            if (!Directory.Exists(libFolder))
            {
                Directory.CreateDirectory(libFolder);
            }

            return Path.Combine(libFolder, fileName);
        }
    }
}
