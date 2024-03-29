package Clase_2.Thread_Herencia;

public class PinPong extends Thread{
    private String word;// Lo que va a escribir
    private int delay;//Tiempo entre escrituras

    //Constructor
    public PinPong(String word, int delay) {
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

    //Metodos
    @Override
    public void run(){ //Se sobreescribe run() de Thread
        super.run();
        while (true){
            System.out.println(word + " ");
            try {
                sleep(delay); // sleep(); es un metodo estatico de la clase Thread,
                              // por lo que lo puedo llamar directamente por su nombre.
            }catch (InterruptedException e){
                return;
            }
        }
    }

}
