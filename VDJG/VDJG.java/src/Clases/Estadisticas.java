package Clases;

import java.util.Scanner;

public class Estadisticas {
    public Estadisticas(){

    }
    public static void Estadisticas(int aciertosTotales, int fallos, int comodinesUsados, Scanner scan, Jugador jugador){
        int preguntasRespondidas= aciertosTotales + fallos;
        double porcentajeAcierto = (aciertosTotales/preguntasRespondidas);
        double porcentajeFallo= (fallos/preguntasRespondidas);
        System.out.println("Aciertos totales: "+aciertosTotales+"\nFallos totales: "+fallos+"\nNº de comodines utilizados: "+comodinesUsados+"\nTotal de preguntas respondidas: "+preguntasRespondidas+"\n% de aciertos: "+porcentajeAcierto+"%"+"\n% de fallos: "+porcentajeFallo+"%");
        System.out.println("\nPulsa cualquier tecla para volver al menu:");
        char letra=scan.next().charAt(0);
        
        
    }
}
