package Clase_2.Ejercicio_Procesos;

public class Proceso extends Thread{
    private int PID;
    private  String  mensaje;
    private static int contador = 0;

    //Constructor
    public Proceso(int PID, String mensaje) {
        this.PID = PID;
        this.mensaje = mensaje;
    }
    //Getter y Setter
    public int getPID() {
        return PID;
    }
    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Proceso.contador = contador;
    }

    //Metodos
    public void run(){
        contador ++;
        super.run();
        System.out.println("Soy el proceso que " + mensaje);
    }
}
