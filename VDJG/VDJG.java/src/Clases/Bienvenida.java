package Clases;
import java.util.Scanner;

public class Bienvenida {
    public Bienvenida(){
        
    }
    public void Bienvenida(Scanner scan, char tecla){
        System.out.println("¸,ø¤º°`°º¤ø,,ø¤º° °º¤ø,,ø¤º°`°º¤ø,");
        System.out.println("Bienvenido a 'La Máquina del Tiempo");
        System.out.println("¸,ø¤º°`°º¤ø,,ø¤º° °º¤ø,,ø¤º°`°º¤ø,");
        System.out.println("Pulse cualquier tecla para continuar");
        tecla=scan.next().charAt(0);
        Jugador jugador = Jugador.registrarJugador();
    }
}
