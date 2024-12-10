using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;
using Xamarin.Forms;

namespace AppPropinas.Converters
{
    public class DecimalToMoney : IValueConverter
    {

        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
        {
            var valor = (decimal) value;
            return valor.ToString("C");
        }

        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
        {
            var valor = (string) value;
            // De esta forma le remuevo el primer valor con el fin de que este se vaya a convertir en numero
            return valor.Remove(0);
        }

    }
}
