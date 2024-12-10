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
    public class ErrorController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Error
        public ActionResult Index()
        {
            return View(db.errores.ToList());
        }

        // GET: Error/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            errore errore = db.errores.Find(id);
            if (errore == null)
            {
                return HttpNotFound();
            }
            return View(errore);
        }

        // GET: Error/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Error/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,fecha,mensaje,numero_error")] errore errore)
        {
            if (ModelState.IsValid)
            {
                db.errores.Add(errore);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(errore);
        }

        // GET: Error/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            errore errore = db.errores.Find(id);
            if (errore == null)
            {
                return HttpNotFound();
            }
            return View(errore);
        }

        // POST: Error/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,fecha,mensaje,numero_error")] errore errore)
        {
            if (ModelState.IsValid)
            {
                db.Entry(errore).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(errore);
        }

        // GET: Error/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            errore errore = db.errores.Find(id);
            if (errore == null)
            {
                return HttpNotFound();
            }
            return View(errore);
        }

        // POST: Error/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            errore errore = db.errores.Find(id);
            db.errores.Remove(errore);
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
