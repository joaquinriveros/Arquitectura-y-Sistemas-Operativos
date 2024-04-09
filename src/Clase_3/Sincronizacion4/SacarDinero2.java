package Clase_3.Sincronizacion4;

public class SacarDinero2 extends Thread {
    private Cuenta2 c;
    public SacarDinero2(String n, Cuenta2 c) {
        super(n);
        this.c = c;
    }
    public  void run() {
        for (int x = 1; x<= 4; x++) {
            c.RetirarDinero(10, getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) { }
        }
    }// run
}
