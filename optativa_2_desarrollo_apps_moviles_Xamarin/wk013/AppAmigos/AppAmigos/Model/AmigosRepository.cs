using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Threading.Tasks;
using AppAmigos.Helpers;
using System.Linq;

namespace AppAmigos.Model
{
    public class AmigosRepository
    {
        public IList<Amigos> Amigos { get; set; }

        public AmigosRepository()
        {
            Task.Run(async () => Amigos = await App.Database.getItemsAsync()).Wait();
        }

        public IList<Amigos> GetAll()
        {
            return Amigos;
        }

        public IList<Amigos> GetAllByFirstLetter(string letter)
        {
            var query = from q in Amigos
                        where q.Nombre.StartsWith(letter)
                        select q;

            return query.ToList();
        }

        public ObservableCollection<Grouping<string, Amigos>> GetAllGrouped()
        {
            IEnumerable<Grouping<string, Amigos>> sorted = new Grouping<string, Amigos>[0];

            if (Amigos != null)
            {
                sorted =
                    from f in Amigos
                    orderby f.Nombre
                    group f by f.Nombre[0].ToString()
                    into theGroup
                    select
                    new Grouping<string, Amigos>
                        (theGroup.Key, theGroup);
            }

            return new ObservableCollection<Grouping<string, Amigos>>(sorted);
        }
    }
}
