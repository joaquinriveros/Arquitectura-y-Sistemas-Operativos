package Clase_3.Ejercico3_4;


/* tarta resto una tarta cuando comen
si no hay tarta se duermen los consumidores
el cocinero duerme hasta que le llaman


 */

public class Proceso implements Runnable {

    private boolean consumidor;

    private static int  tarta = 0;
    private static Object lock = new Object();

    public Proceso(boolean consumidor) {
        this.consumidor = consumidor;
    }

    public void run() {

        while (true) {
            if (consumidor) {
                consumiendo();
            } else {
                cocinando();
            }

        }
    }

   public void consumiendo() {
       synchronized (lock) {
           if (tarta > 0) {
               tarta--;
               System.out.println("Quedan " + tarta + " porciones de tarta");

               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           } else {
               lock.notifyAll();

               try {
                   lock.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }
    public void cocinando(){
            synchronized (lock){

                if (tarta == 0) {
                    tarta =10;
                    System.out.println(" Soy el cocinero y quedan "+tarta+".");

                    lock.notifyAll();
                }


                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        }

