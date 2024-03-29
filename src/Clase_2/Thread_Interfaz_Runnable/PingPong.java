package Clase_2.Thread_Interfaz_Runnable;

import static java.lang.Thread.sleep;

public class PingPong implements  Runnable{
    private String word;//Lo que va a escribir
    private int delay;//Tiempo entre escrituras

    //Constructor
    public PingPong(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }
    //Getter y Setter

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public int getDelay() {
        return delay;
    }
    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(word + " ");
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
