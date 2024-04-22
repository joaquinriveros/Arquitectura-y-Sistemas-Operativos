package Clase_3.Ejercicio_Sincronización_Complementario;

public class HiloPar extends Thread{

    //Atributo
    Impresora impresora;
    int numero = 2;

    //Constructor
    public HiloPar(Impresora impresora) {
        this.impresora = impresora;
    }

    //Metodos
    @Override
    public void run() {
        super.run();
        for (int i = 2; i <= 10; i += 2) {
            impresora.imprimir(i);
        }
    }
}
