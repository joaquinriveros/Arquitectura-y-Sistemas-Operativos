package Clase_2.Thread_Interfaz_Runnable;

import Clase_2.Thread_Herencia.PinPong;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        //Los objetos r1 y r2 definen la funcionalidad
        //(definen los metodos run())
        PinPong r1 = new PinPong("PING",1300);
        PinPong r2 = new PinPong("PONG",1550);
        //Se crean los Threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        //Se activan los Threads
        t1.start();
        t2.start();
    }
}
