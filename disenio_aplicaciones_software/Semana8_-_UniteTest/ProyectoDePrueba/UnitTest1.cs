using System;
using Semana8__UniteTest;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ProyectoDePrueba
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void CrearMundo1()
        {
            /*
             * Se debe crear tres pasos para una prueba de un elemento
             * Arrange: Arreglo
             * Act: Actuar
             * Assert: Afirmar
             */

            //Arrange
            var c = new Genio();

            //Act
            var r = c.CrearMundo(1);

            //Assert
            Assert.AreEqual("Mundo magico", r);

        }

        [TestMethod]
        public void CrearMundo2()
        {
            /*
             * Se debe crear tres pasos para una prueba de un elemento
             * Arrange: Arreglo
             * Act: Actuar
             * Assert: Afirmar
             */

            //Arrange
            var c = new Genio();

            //Act
            var r = c.CrearMundo(2);

            //Assert
            Assert.AreEqual("mundo electrico", r);

        }

        [TestMethod]
        public void CrearMundo3()
        {
            /*
             * Se debe crear tres pasos para una prueba de un elemento
             * Arrange: Arreglo
             * Act: Actuar
             * Assert: Afirmar
             */

            //Arrange
            var c = new Genio();

            //Act
            var r = c.CrearMundo(3);

            //Assert
            Assert.AreEqual("Mundo acuatico", r);

        }

    }
}
