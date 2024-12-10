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
    public class Easy_PayController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Easy_Pay
        public ActionResult Index()
        {
            return View(db.easy_pay.ToList());
        }

        // GET: Easy_Pay/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            easy_pay easy_pay = db.easy_pay.Find(id);
            if (easy_pay == null)
            {
                return HttpNotFound();
            }
            return View(easy_pay);
        }

        // GET: Easy_Pay/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Easy_Pay/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,num_cuenta,codigo_seguridad,contrasenia,id_tarjeta")] easy_pay easy_pay)
        {
            if (ModelState.IsValid)
            {
                db.easy_pay.Add(easy_pay);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(easy_pay);
        }

        // GET: Easy_Pay/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            easy_pay easy_pay = db.easy_pay.Find(id);
            if (easy_pay == null)
            {
                return HttpNotFound();
            }
            return View(easy_pay);
        }

        // POST: Easy_Pay/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,num_cuenta,codigo_seguridad,contrasenia,id_tarjeta")] easy_pay easy_pay)
        {
            if (ModelState.IsValid)
            {
                db.Entry(easy_pay).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(easy_pay);
        }

        // GET: Easy_Pay/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            easy_pay easy_pay = db.easy_pay.Find(id);
            if (easy_pay == null)
            {
                return HttpNotFound();
            }
            return View(easy_pay);
        }

        // POST: Easy_Pay/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            easy_pay easy_pay = db.easy_pay.Find(id);
            db.easy_pay.Remove(easy_pay);
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
