package Clase_2.Ejemplo_Metodo_Is_Alive;
public class Ejemplo_isAlive {
    public static void main(String[] args){
        Obrera agente =new Obrera();
        agente.start();
        // Hace algo durante el cálculo.
        //.....
        //Espera que agente haya terminado
        while (agente.isAlive()) Thread.yield();
        // Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}

