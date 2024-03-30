package Clase_2.Manejo_Prioridades;
public class Main {
    public static void main(String[] args) {
        new SimplePriorities(Thread.MAX_PRIORITY);
        for(int i = 0; i < 5; i++)
            new SimplePriorities(Thread.MIN_PRIORITY);
    }
}

