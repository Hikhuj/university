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
    public class ConsecutivoController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Consecutivo
        public ActionResult Index()
        {
            return View(db.consecutivos.ToList());
        }

        // GET: Consecutivo/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            consecutivo consecutivo = db.consecutivos.Find(id);
            if (consecutivo == null)
            {
                return HttpNotFound();
            }
            return View(consecutivo);
        }

        // GET: Consecutivo/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Consecutivo/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,descripcion,consecutivo1,permite_prefijo,prefijo,rango,init_rango,end_rango")] consecutivo consecutivo)
        {
            if (ModelState.IsValid)
            {
                db.consecutivos.Add(consecutivo);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(consecutivo);
        }

        // GET: Consecutivo/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            consecutivo consecutivo = db.consecutivos.Find(id);
            if (consecutivo == null)
            {
                return HttpNotFound();
            }
            return View(consecutivo);
        }

        // POST: Consecutivo/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,descripcion,consecutivo1,permite_prefijo,prefijo,rango,init_rango,end_rango")] consecutivo consecutivo)
        {
            if (ModelState.IsValid)
            {
                db.Entry(consecutivo).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(consecutivo);
        }

        // GET: Consecutivo/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            consecutivo consecutivo = db.consecutivos.Find(id);
            if (consecutivo == null)
            {
                return HttpNotFound();
            }
            return View(consecutivo);
        }

        // POST: Consecutivo/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            consecutivo consecutivo = db.consecutivos.Find(id);
            db.consecutivos.Remove(consecutivo);
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
