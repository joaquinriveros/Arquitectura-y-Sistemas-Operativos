package Clase_3.Ejercico4_1;

public class Proceso1 implements Runnable{

     private static Monitor1 mon = new Monitor1();
     private int id;

    public Proceso1(int id) {
        this.id = id;
    }

    @Override
    public void run() {

         int cont =mon.inc(20000);

        System.out.println(cont);

        mon.ordenar(id);

               }


           }

        



