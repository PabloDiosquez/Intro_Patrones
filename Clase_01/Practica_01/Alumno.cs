﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_01
{
    public class Alumno: Persona
    {
        // Atributos

        private int legajo;

        private double promedio;

        // Constructor

        /// <summary>
        /// El constructor de la clase que recibe un nombre “n”, un DNI “d”, un legajo “l” y un promedio “p” y los 
        /// almacena en las variables correspondientes.
        /// </summary>
        /// <param name="nombre">String</param>
        /// <param name="dni">Int</param>
        /// <param name="legajo">Int</param>
        /// <param name="promedio">Double</param>
        public Alumno(string nombre, int dni, int legajo, double promedio) : base(nombre, dni)
        {
            this.legajo = legajo;

            this.promedio = promedio;
        }

        // Métodos de instancia 🥐

        /// <summary>
        /// Describe el legajo del alumno que recibe el mensaje.
        /// </summary>
        /// <returns>int</returns>
        public int getLegajo()
        {
            return legajo;
        }

        /// <summary>
        /// Describe el promedio del alumno que recibe el mensaje.
        /// </summary>
        /// <returns>double</returns>
        public double getPromedio()
        {
            return promedio;
        }

    }
}
