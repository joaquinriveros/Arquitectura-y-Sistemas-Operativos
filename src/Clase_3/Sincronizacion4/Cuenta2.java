package Clase_3.Sincronizacion4;

public class Cuenta2 {

    private int saldo ;

    Cuenta2(int s) {saldo = s;}

    int getSaldo() {return saldo;}

    void restar(int cantidad){saldo=saldo-cantidad;}

    synchronized void RetirarDinero(int cant, String nom) {
        if (getSaldo() >= cant) {
            System.out.println(nom+": SE VA A RETIRAR SALDO (ACTUAL ES: "+getSaldo()+ ")" );
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {    }

            restar(cant);

            System.out.println("\t"+nom+ " retira =>"+cant + " ACTUAL("+getSaldo()+")" );
        } else {
            System.out.println(nom+ " No puede retirar dinero, NO HAY SALDO("+getSaldo()+")" );
        }
        if (getSaldo() < 0) {
            System.out.println("SALDO NEGATIVO => "+getSaldo());
        }
    }//retirar
}
