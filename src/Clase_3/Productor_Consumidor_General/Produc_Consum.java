package Clase_3.Productor_Consumidor_General;
public class Produc_Consum {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Productor p = new Productor(cola, 1);
        Consumidor c = new Consumidor(cola, 1);
        p . start() ;
        c . start() ;
    }
}