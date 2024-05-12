package Clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Jugador {

    private String nombre;
    private int edad; 
    private int puntuacion;
    
    

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Jugador(String nombre, int edad, int puntuacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public void calcularPuntuacion(int aciertosTotales, int fallos){
        puntuacion = (aciertosTotales/fallos)*10;
    }
    public static Jugador registrarJugador() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scan.nextLine();
        int edad = 0;
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.println("Introduce tu edad: ");
                edad = scan.nextInt();
                if (edad < 17) {
                    throw new EdadInvalidaException("Error: Debes ser mayor de 17 años para jugar al juego.");
                }
                edadValida = true; // La edad es válida, salir del bucle
            } catch (EdadInvalidaException e) {
                System.out.println(e.getMessage());
                // Volver a solicitar la edad en el siguiente ciclo
            } catch (InputMismatchException ex) {
                System.out.println("Error: Debes introducir un numero para la validar la edad.");
                scan.nextLine(); // Limpiar el buffer del scanner
            }
        }
        System.out.println("\nBienvenid@, "+ nombre + "!\n");
        return new Jugador(nombre, edad);
    }
    
    public void guardarResultados(int aciertosTotales, int fallos, int comodinesUsados, Jugador j1) {
        try {
            FileWriter writer = new FileWriter("resultados.txt", true); // Abre el archivo en modo de añadir al final
            writer.write("Nombre del jugador: "+ j1.getNombre() + ", Edad: " + j1.getEdad() + ", Puntuacion: " + puntuacion + ", Aciertos: " + aciertosTotales + ", Fallos: " + fallos + ", Comodines utilizados: " + comodinesUsados + "\n");
            writer.close(); // Cierra el archivo después de escribir
            System.out.println("Resultados de la partida guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los resultados de la partida: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", puntuacion=" + puntuacion + "]";
    }
    
    
}
