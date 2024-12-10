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
    public class LibroController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Libro
        public ActionResult Index()
        {
            var libros = db.libros.Include(l => l.genero).Include(l => l.idioma);
            return View(libros.ToList());
        }

        // GET: Libro/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            libro libro = db.libros.Find(id);
            if (libro == null)
            {
                return HttpNotFound();
            }
            return View(libro);
        }

        // GET: Libro/Create
        public ActionResult Create()
        {
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1");
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1");
            return View();
        }

        // POST: Libro/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,nombre,id_genero,autor,id_idioma,consecutivo,editorial,anio_publicacion,archivo_descarga,archivo_preview,cantidad_descarga,precio")] libro libro)
        {
            if (ModelState.IsValid)
            {
                db.libros.Add(libro);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", libro.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", libro.id_idioma);
            return View(libro);
        }

        // GET: Libro/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            libro libro = db.libros.Find(id);
            if (libro == null)
            {
                return HttpNotFound();
            }
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", libro.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", libro.id_idioma);
            return View(libro);
        }

        // POST: Libro/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,nombre,id_genero,autor,id_idioma,consecutivo,editorial,anio_publicacion,archivo_descarga,archivo_preview,cantidad_descarga,precio")] libro libro)
        {
            if (ModelState.IsValid)
            {
                db.Entry(libro).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.id_genero = new SelectList(db.generos, "id_genero", "genero1", libro.id_genero);
            ViewBag.id_idioma = new SelectList(db.idiomas, "id_idioma", "idioma1", libro.id_idioma);
            return View(libro);
        }

        // GET: Libro/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            libro libro = db.libros.Find(id);
            if (libro == null)
            {
                return HttpNotFound();
            }
            return View(libro);
        }

        // POST: Libro/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            libro libro = db.libros.Find(id);
            db.libros.Remove(libro);
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
