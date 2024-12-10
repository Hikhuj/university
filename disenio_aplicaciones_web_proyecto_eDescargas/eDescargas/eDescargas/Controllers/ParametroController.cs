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
    public class ParametroController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Parametro
        public ActionResult Index()
        {
            return View(db.parametros.ToList());
        }

        // GET: Parametro/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            parametro parametro = db.parametros.Find(id);
            if (parametro == null)
            {
                return HttpNotFound();
            }
            return View(parametro);
        }

        // GET: Parametro/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Parametro/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,preview_libros,path_libros,preview_musica,path_musica,preview_peliculas,path_peliculas")] parametro parametro)
        {
            if (ModelState.IsValid)
            {
                db.parametros.Add(parametro);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(parametro);
        }

        // GET: Parametro/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            parametro parametro = db.parametros.Find(id);
            if (parametro == null)
            {
                return HttpNotFound();
            }
            return View(parametro);
        }

        // POST: Parametro/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,preview_libros,path_libros,preview_musica,path_musica,preview_peliculas,path_peliculas")] parametro parametro)
        {
            if (ModelState.IsValid)
            {
                db.Entry(parametro).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(parametro);
        }

        // GET: Parametro/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            parametro parametro = db.parametros.Find(id);
            if (parametro == null)
            {
                return HttpNotFound();
            }
            return View(parametro);
        }

        // POST: Parametro/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            parametro parametro = db.parametros.Find(id);
            db.parametros.Remove(parametro);
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
