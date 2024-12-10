using System;
using Semana8___UniteTest;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ProyectoDePrueba
{
    [TestClass]
    public class UnitTest2
    {
        [TestMethod]
        public void suma()
        {

            var c = new calculo();

            var r = c.suma(3, 8);

            Assert.AreEqual(11, r);

        }

        [TestMethod]
        public void resta()
        {

            var c = new calculo();

            var r = c.resta(7, 5);

            Assert.AreEqual(2, r);

        }

        [TestMethod]
        public void multiplicacion()
        {

            var c = new calculo();

            var r = c.multiplicacion(2, 3);

            Assert.AreEqual(6, r);

        }

    }

}
