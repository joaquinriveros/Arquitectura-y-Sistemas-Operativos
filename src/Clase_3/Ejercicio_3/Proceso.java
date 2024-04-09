package Clase_3.Ejercicio_3;

public class Proceso extends Thread{
    private int id = 0;
    static int contador = 0;

    public Proceso(String name, int id){
        super(name);
        this.id = id;
    }

    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 10; i++) {
            contador ++;
        }
    }
}
