package Clase_3.Ejercico4_1;
public class Monitor1 {

    private int cont =0;
    private int order =0;
    private int id;



    public synchronized  int inc(int parametro){
        for (int i = 0; i < parametro; i++) {
             cont++;
        }
        return cont;
    }
    public synchronized void ordenar(int id ){

        while (id !=order){
            try {
                wait();// va a una cola diferente de la de synchronized duermen
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }

        System.out.println("Soy el hilo "+id);
        order++;
        notifyAll();// pasan de la cola wait al sychronized

    }

}
