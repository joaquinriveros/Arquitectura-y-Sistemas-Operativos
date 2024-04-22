package Clase_3.Ejercicio_Sincronización_Complementario;

public class HiloImpar extends Thread{

    //Atributo
    Impresora impresora;
    int numero = 1;

    //Constructor
    public HiloImpar(Impresora impresora) {
        this.impresora = impresora;
    }

    //Metodos
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 10; i += 2) {
            impresora.imprimir(i);
        }
    }
}
