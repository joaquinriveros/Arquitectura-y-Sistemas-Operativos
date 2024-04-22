package Clase_3.Ejercico4_1;

public class Monitor0 {

    private int cont =0;
//Se simplifica la concurrencia
   public synchronized  void inc(){
        for (int i = 0; i < 20000; i++) {
             cont++;
        }
    }
    public synchronized int getCont()
    {
        return cont;
    }
}
