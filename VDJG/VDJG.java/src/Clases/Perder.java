package Clases;
import java.util.Scanner;
public class Perder {

        public static void PerderMedia(int aciertos, int fallos, int comodinesUsados, Scanner scan, Jugador jugador, String rojo, String sinColor, char tecla){
            if (aciertos < 7){
                System.out.println(rojo+"Has perdido."+sinColor);
                    System.out.println("Pulsa cualquier tecla para volver al menú");
                    tecla=scan.next().charAt(0);
                    jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
            }
        }
        public static void PerderDificil(int aciertos, int fallos, int comodinesUsados, Scanner scan, Jugador jugador, String rojo, String sinColor, char tecla){
            if(aciertos<=7){
                System.out.println(rojo+"Has perdido."+sinColor);
                    System.out.println("Pulsa cualquier tecla para volver al menú");
                    tecla=scan.next().charAt(0);
                    jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
            }
        }
}

