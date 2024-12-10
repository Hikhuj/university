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
    public class Usuario_RolController : Controller
    {
        private eDescargasEntities db = new eDescargasEntities();

        // GET: Usuario_Rol
        public ActionResult Index()
        {
            var usuarios_roles = db.usuarios_roles.Include(u => u.role).Include(u => u.usuario);
            return View(usuarios_roles.ToList());
        }

        // GET: Usuario_Rol/Details/5
        public ActionResult Details(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            usuarios_roles usuarios_roles = db.usuarios_roles.Find(id);
            if (usuarios_roles == null)
            {
                return HttpNotFound();
            }
            return View(usuarios_roles);
        }

        // GET: Usuario_Rol/Create
        public ActionResult Create()
        {
            ViewBag.id_rol = new SelectList(db.roles, "id", "tipo_rol");
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1");
            return View();
        }

        // POST: Usuario_Rol/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,id_usuario,id_rol")] usuarios_roles usuarios_roles)
        {
            if (ModelState.IsValid)
            {
                db.usuarios_roles.Add(usuarios_roles);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.id_rol = new SelectList(db.roles, "id", "tipo_rol", usuarios_roles.id_rol);
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1", usuarios_roles.id_usuario);
            return View(usuarios_roles);
        }

        // GET: Usuario_Rol/Edit/5
        public ActionResult Edit(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            usuarios_roles usuarios_roles = db.usuarios_roles.Find(id);
            if (usuarios_roles == null)
            {
                return HttpNotFound();
            }
            ViewBag.id_rol = new SelectList(db.roles, "id", "tipo_rol", usuarios_roles.id_rol);
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1", usuarios_roles.id_usuario);
            return View(usuarios_roles);
        }

        // POST: Usuario_Rol/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,id_usuario,id_rol")] usuarios_roles usuarios_roles)
        {
            if (ModelState.IsValid)
            {
                db.Entry(usuarios_roles).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.id_rol = new SelectList(db.roles, "id", "tipo_rol", usuarios_roles.id_rol);
            ViewBag.id_usuario = new SelectList(db.usuarios, "id", "usuario1", usuarios_roles.id_usuario);
            return View(usuarios_roles);
        }

        // GET: Usuario_Rol/Delete/5
        public ActionResult Delete(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            usuarios_roles usuarios_roles = db.usuarios_roles.Find(id);
            if (usuarios_roles == null)
            {
                return HttpNotFound();
            }
            return View(usuarios_roles);
        }

        // POST: Usuario_Rol/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(string id)
        {
            usuarios_roles usuarios_roles = db.usuarios_roles.Find(id);
            db.usuarios_roles.Remove(usuarios_roles);
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
