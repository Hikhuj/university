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
    public class DescargaController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Descarga
        public ActionResult Index()
        {
            return View(db.descargas.ToList());
        }

        // GET: Descarga/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            descarga descarga = db.descargas.Find(id);
            if (descarga == null)
            {
                return HttpNotFound();
            }
            return View(descarga);
        }

        // GET: Descarga/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Descarga/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,fecha_transaccion,cantidad,nombre_item")] descarga descarga)
        {
            if (ModelState.IsValid)
            {
                db.descargas.Add(descarga);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(descarga);
        }

        // GET: Descarga/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            descarga descarga = db.descargas.Find(id);
            if (descarga == null)
            {
                return HttpNotFound();
            }
            return View(descarga);
        }

        // POST: Descarga/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,fecha_transaccion,cantidad,nombre_item")] descarga descarga)
        {
            if (ModelState.IsValid)
            {
                db.Entry(descarga).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(descarga);
        }

        // GET: Descarga/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            descarga descarga = db.descargas.Find(id);
            if (descarga == null)
            {
                return HttpNotFound();
            }
            return View(descarga);
        }

        // POST: Descarga/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            descarga descarga = db.descargas.Find(id);
            db.descargas.Remove(descarga);
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
