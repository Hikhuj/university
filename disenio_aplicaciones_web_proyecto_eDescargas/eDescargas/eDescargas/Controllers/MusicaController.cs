using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using eDescargas.Models;

namespace eDescargas.Controllers
{
    [Authorize]
    public class MusicaController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Musica
        public ActionResult Index()
        {
            var musicas = db.musicas.Include(m => m.genero).Include(m => m.idioma).Include(m => m.pais);
            return View(musicas.ToList());
        }

        // GET: Musica/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            musica musica = db.musicas.Find(id);
            if (musica == null)
            {
                return HttpNotFound();
            }
            return View(musica);
        }

        // GET: Musica/Create
        public ActionResult Create()
        {
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1");
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1");
            ViewBag.id_pais = new SelectList(db.paises, "id_pais", "nombre");
            return View();
        }

        // POST: Musica/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,nombre,id_genero,tipo_interprete,id_idioma,id_pais,disquera,nombre_disco,anio,archivo_descarga,archivo_preview,cantidad_descarga,consecutivo,precio")] musica musica)
        {
            if (ModelState.IsValid)
            {
                db.musicas.Add(musica);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", musica.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", musica.id_idioma);
            ViewBag.id_pais = new SelectList(db.paises, "id_pais", "nombre", musica.id_pais);
            return View(musica);
        }

        // GET: Musica/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            musica musica = db.musicas.Find(id);
            if (musica == null)
            {
                return HttpNotFound();
            }
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", musica.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", musica.id_idioma);
            ViewBag.id_pais = new SelectList(db.paises, "id_pais", "nombre", musica.id_pais);
            return View(musica);
        }

        // POST: Musica/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,nombre,id_genero,tipo_interprete,id_idioma,id_pais,disquera,nombre_disco,anio,archivo_descarga,archivo_preview,cantidad_descarga,consecutivo,precio")] musica musica)
        {
            if (ModelState.IsValid)
            {
                db.Entry(musica).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", musica.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", musica.id_idioma);
            ViewBag.id_pais = new SelectList(db.paises, "id_pais", "nombre", musica.id_pais);
            return View(musica);
        }

        // GET: Musica/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            musica musica = db.musicas.Find(id);
            if (musica == null)
            {
                return HttpNotFound();
            }
            return View(musica);
        }

        // POST: Musica/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            musica musica = db.musicas.Find(id);
            db.musicas.Remove(musica);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
