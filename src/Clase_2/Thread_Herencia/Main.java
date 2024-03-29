package Clase_2.Thread_Herencia;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) { //Declaracion de 2 Threads
        PinPong t1 = new PinPong("PING",1300);
        PinPong t2 = new PinPong("PONG",1550);
        //Activacion
        t1.start();
        t2.start();
        //Espera 2 segundos
        try {
            //Espera 2 segundos
            sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e.getCause());
        }
        //Finalizo la ejecucion de los Threads
        t1.stop();
        t2.stop();
    }
}
