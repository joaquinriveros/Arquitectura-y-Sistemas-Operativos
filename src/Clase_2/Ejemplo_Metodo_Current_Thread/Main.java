package Clase_2.Ejemplo_Metodo_Current_Thread;
public class Main {
    public static void main(String[] args){
        Cliente juan= new Cliente();
        juan.setName("Juan López");

        Cliente ines= new Cliente();
        ines.setName("Inés García");

        juan.start();
        ines.start();
    }
}

