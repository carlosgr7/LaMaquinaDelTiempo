package Clases;

import java.util.Scanner;

public class Reglas {
    public Reglas(){
        
    }
    public static void Reglas(String verde, String amarillo, String rojo, String morado, String azul, String sinColor, char respuesta, Scanner scan){
        System.out.println("***Reglas de "+amarillo+"La Máquina del Tiempo"+sinColor+"***");
        System.out.println("1. Para contestar las preguntas del trivial, debes introducir la letra de la opción que crees que es la respuesta correcta.\n2. Para utilizar los comodines debes usar la tecla especial '$'.\n3. Ganarás comodines si aciertas más de un número determinado de preguntas, dependiendo del nivel de dificultad.\n4. Dificultad: Los niveles de dificultad cambian el nivel de dificultad de las preguntas y el numero de aciertos necesarios para pasar de nivel.\n5. En los modo de dificultad medio , es necesario acertar un mínimo de 7 preguntas para poder avanzar, 8 si estas jugando el modo dificil.");
        System.out.println("Pulsa cualquier tecla para volver al Menú");
        respuesta=scan.next().charAt(0);
    }
}
