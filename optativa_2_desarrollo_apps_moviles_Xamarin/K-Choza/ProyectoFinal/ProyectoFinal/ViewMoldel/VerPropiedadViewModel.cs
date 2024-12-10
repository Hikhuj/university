using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using ProyectoFinal.DatabaseQ;
using ProyectoFinal.Model;
using Xamarin.Forms;

namespace ProyectoFinal.ViewMoldel
{
    public class VerPropiedadViewModel
    {

        public ObservableCollection<PropiedadModel> ListaAlquiler_Variable { get; set; }
        

           public PropiedadModel PropiedadModel { get; set; }

            public VerPropiedadViewModel()

            {
                ListaAlquiler_Variable = new ObservableCollection<PropiedadModel>(Globals.listaCasas);


                PropiedadModel = new PropiedadModel();
                PropiedadModel.Usuario = Globals.usuario;//usuario actual email
                //se valida las propiedades
                ListaAlquiler_Variable = new ObservableCollection<PropiedadModel>(Globals.listaCasas.Where(x => x.Usuario == PropiedadModel.Usuario));

           
        }
        
        
    }
}
