using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;
/*Importar el modelo para poder trabajar con el*/
using Lec04_RESTapi.Models;

namespace Lec04_RESTapi.Controllers
{
    public class PlantaController : ApiController
    {
        // Notas de clase:
        /*
            Notas de Clase:
            - El IHttpActionResult genera una accion abierta dentro del codigo. Para cerrar esa accion se debe obtener el siguiente codigo de
                protected override void Dispose()
            - Api call path http://localhost:{auto_local_ports}/api/planta
         */
        private ViveroEntities db = new ViveroEntities();

        // CUSTOMS
        // Metodo privado para las plantas
        private bool PlantasExists(int cod_planta)
        {
            // Usando expresion Lambda
            return db.Plantas.Count(e => e.cod_planta == cod_planta) > 0;
        }

        // El IHttpActionResult genera una accion abierta dentro del codigo.Para cerrar esa accion se debe obtener el siguiente codigo.
        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            else
            {
                base.Dispose(disposing);
            }
        }

        // GET: api/Plantas
        public IQueryable<Planta> Get()
        {
            return db.Plantas;
        }

        // GET: api/Plantas/5
        [ResponseType(typeof(Planta))]
        public IHttpActionResult Get(int id)
        {
            Planta plantas = db.Plantas.Find(id);
            if (plantas == null)
            {
                return NotFound();
            }
            else
            {
                return Ok(plantas);
            }
        }

        // POST: api/Plantas
        [ResponseType(typeof(Planta))]
        public IHttpActionResult Post(Planta planta)
        {
            // Si el modelo no es valido, retornar...
            if (!ModelState.IsValid)
            {
                // Con esto el programador tendra una idea de donde esta fallando, retornando el MODELstate
                return BadRequest(ModelState);
            }

            db.Plantas.Add(planta);

            try
            {
                db.SaveChanges();
            }
            catch (DbUpdateException)
            {
                if (PlantasExists(planta.cod_planta))
                {
                    return Conflict();
                }
                else
                {
                    throw;
                }
            }

            return CreatedAtRoute("DefaultApi",
                                       new { id = planta.cod_planta }, planta);
        }

        // PUT: api/Plantas/5
        [ResponseType(typeof(void))]
        public IHttpActionResult Put(int id, Planta planta)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }
            if (id != planta.cod_planta)
            {
                return BadRequest();
            }

            db.Entry(planta).State = EntityState.Modified;

            try
            {
                db.SaveChanges();
            }
            catch (DbUpdateException)
            {
                if (!PlantasExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return StatusCode(HttpStatusCode.OK);
        }

        // DELETE: api/Plantas/5
        [ResponseType(typeof(Planta))]
        public IHttpActionResult Delete(int id)
        {
            Planta planta = db.Plantas.Find(id);
            if (planta == null)
            {
                return NotFound();
            }

            db.Plantas.Remove(planta);
            db.SaveChanges();
            return Ok(planta);
        }
    }
}
