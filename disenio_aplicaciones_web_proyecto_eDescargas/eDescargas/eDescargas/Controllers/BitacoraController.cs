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
    public class BitacoraController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Bitacora
        public ActionResult Index()
        {
            var bitacoras = db.bitacoras.Include(b => b.usuario);
            return View(bitacoras.ToList());
        }

        // GET: Bitacora/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            bitacora bitacora = db.bitacoras.Find(id);
            if (bitacora == null)
            {
                return HttpNotFound();
            }
            return View(bitacora);
        }

        // GET: Bitacora/Create
        public ActionResult Create()
        {
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1");
            return View();
        }

        // POST: Bitacora/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,id_usuario,fecha_cambio,codigo_registro,tipo_registro,descripcion,detalle_registro")] bitacora bitacora)
        {
            if (ModelState.IsValid)
            {
                db.bitacoras.Add(bitacora);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1", bitacora.id_usuario);
            return View(bitacora);
        }

        // GET: Bitacora/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            bitacora bitacora = db.bitacoras.Find(id);
            if (bitacora == null)
            {
                return HttpNotFound();
            }
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1", bitacora.id_usuario);
            return View(bitacora);
        }

        // POST: Bitacora/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,id_usuario,fecha_cambio,codigo_registro,tipo_registro,descripcion,detalle_registro")] bitacora bitacora)
        {
            if (ModelState.IsValid)
            {
                db.Entry(bitacora).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1", bitacora.id_usuario);
            return View(bitacora);
        }

        // GET: Bitacora/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            bitacora bitacora = db.bitacoras.Find(id);
            if (bitacora == null)
            {
                return HttpNotFound();
            }
            return View(bitacora);
        }

        // POST: Bitacora/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            bitacora bitacora = db.bitacoras.Find(id);
            db.bitacoras.Remove(bitacora);
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
