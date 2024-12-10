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
    public class PeliculaController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Pelicula
        public ActionResult Index()
        {
            var peliculas = db.peliculas.Include(p => p.genero).Include(p => p.idioma);
            return View(peliculas.ToList());
        }

        // GET: Pelicula/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            pelicula pelicula = db.peliculas.Find(id);
            if (pelicula == null)
            {
                return HttpNotFound();
            }
            return View(pelicula);
        }

        // GET: Pelicula/Create
        public ActionResult Create()
        {
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1");
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1");
            return View();
        }

        // POST: Pelicula/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,nombre,id_genero,anio,id_idioma,actores,archivo_descarga,archivo_preview,precio,consecutivo,cantidad_descarga")] pelicula pelicula)
        {
            if (ModelState.IsValid)
            {
                db.peliculas.Add(pelicula);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", pelicula.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", pelicula.id_idioma);
            return View(pelicula);
        }

        // GET: Pelicula/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            pelicula pelicula = db.peliculas.Find(id);
            if (pelicula == null)
            {
                return HttpNotFound();
            }
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", pelicula.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", pelicula.id_idioma);
            return View(pelicula);
        }

        // POST: Pelicula/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,nombre,id_genero,anio,id_idioma,actores,archivo_descarga,archivo_preview,precio,consecutivo,cantidad_descarga")] pelicula pelicula)
        {
            if (ModelState.IsValid)
            {
                db.Entry(pelicula).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", pelicula.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", pelicula.id_idioma);
            return View(pelicula);
        }

        // GET: Pelicula/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            pelicula pelicula = db.peliculas.Find(id);
            if (pelicula == null)
            {
                return HttpNotFound();
            }
            return View(pelicula);
        }

        // POST: Pelicula/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            pelicula pelicula = db.peliculas.Find(id);
            db.peliculas.Remove(pelicula);
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
