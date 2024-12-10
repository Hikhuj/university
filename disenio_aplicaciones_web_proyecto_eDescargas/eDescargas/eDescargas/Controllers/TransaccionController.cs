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
    public class TransaccionController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Transaccion
        public ActionResult Index()
        {
            return View(db.transacciones.ToList());
        }

        // GET: Transaccion/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            transaccione transaccione = db.transacciones.Find(id);
            if (transaccione == null)
            {
                return HttpNotFound();
            }
            return View(transaccione);
        }

        // GET: Transaccion/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Transaccion/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,fecha_transaccion,metodo_pago,monto_compra,id_consecutivo")] transaccione transaccione)
        {
            if (ModelState.IsValid)
            {
                db.transacciones.Add(transaccione);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(transaccione);
        }

        // GET: Transaccion/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            transaccione transaccione = db.transacciones.Find(id);
            if (transaccione == null)
            {
                return HttpNotFound();
            }
            return View(transaccione);
        }

        // POST: Transaccion/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,fecha_transaccion,metodo_pago,monto_compra,id_consecutivo")] transaccione transaccione)
        {
            if (ModelState.IsValid)
            {
                db.Entry(transaccione).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(transaccione);
        }

        // GET: Transaccion/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            transaccione transaccione = db.transacciones.Find(id);
            if (transaccione == null)
            {
                return HttpNotFound();
            }
            return View(transaccione);
        }

        // POST: Transaccion/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            transaccione transaccione = db.transacciones.Find(id);
            db.transacciones.Remove(transaccione);
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
