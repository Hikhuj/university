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
    public class IdiomaController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Idioma
        public ActionResult Index()
        {
            return View(db.idiomas.ToList());
        }

        // GET: Idioma/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            idioma idioma = db.idiomas.Find(id);
            if (idioma == null)
            {
                return HttpNotFound();
            }
            return View(idioma);
        }

        // GET: Idioma/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Idioma/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id_idioma,idioma1")] idioma idioma)
        {
            if (ModelState.IsValid)
            {
                db.idiomas.Add(idioma);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(idioma);
        }

        // GET: Idioma/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            idioma idioma = db.idiomas.Find(id);
            if (idioma == null)
            {
                return HttpNotFound();
            }
            return View(idioma);
        }

        // POST: Idioma/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id_idioma,idioma1")] idioma idioma)
        {
            if (ModelState.IsValid)
            {
                db.Entry(idioma).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(idioma);
        }

        // GET: Idioma/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            idioma idioma = db.idiomas.Find(id);
            if (idioma == null)
            {
                return HttpNotFound();
            }
            return View(idioma);
        }

        // POST: Idioma/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            idioma idioma = db.idiomas.Find(id);
            db.idiomas.Remove(idioma);
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
