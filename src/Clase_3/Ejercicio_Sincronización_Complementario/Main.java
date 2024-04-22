package Clase_3.Ejercicio_Sincronización_Complementario;
/*

La impresión alternada de números pares e impares:

Supongamos que deseas imprimir números en orden ascendente comenzando desde 1,
pero de forma que un hilo imprima solo números pares y otro solo números impares.
Debes garantizar que los números se impriman en orden, es decir, primero los impares
y luego los pares, y que ambos hilos se ejecuten de forma alternada.

Aquí está el esquema del problema:

Tienes una clase Impresora que tiene un método imprimir(int numero).
Este método simplemente imprime el número en la consola.

Tienes dos clases de hilo: HiloImpar e HiloPar, ambas extendiendo de Thread.
Cada hilo tiene una referencia a la misma instancia de Impresora.
El método run() de cada hilo imprime números pares o impares, respectivamente, en orden ascendente.

Los hilos deben sincronizarse para imprimir números en orden alternado,
es decir, primero un hilo imprime un número, luego el otro hilo imprime el siguiente número, y así sucesivamente.

*/

public class Main {
    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        HiloImpar impar = new HiloImpar(impresora);
        HiloPar par = new HiloPar(impresora);

        impar.start();
        par.start();

    }
}
