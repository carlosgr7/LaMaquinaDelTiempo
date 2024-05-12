import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import Clases.Jugador;
import Clases.Bienvenida;
import Clases.Estadisticas;
import Clases.LaTrama;
import Clases.Reglas;
import Clases.Perder;
public class App {
    public static void main(String[] args) throws Exception { //comienzo de la main jeje
        Scanner scan = new Scanner (System.in);
        char tecla='a';
        int [] numRespuestas={1,2,3,4};
        int aciertos=0;
        int fallos=0;
        int aleatorio=0;
        int datosPosibles=9;
        char respuesta='a';
        int comodines=0;
        int comodinesUsados=0;
        int aciertosTotales=0;;
        String lugar="a";
        String dias="b";
        String horas="c";
        String motivo="d";
        String objeto="e";
        Jugador jugador  = new Jugador(objeto, aciertosTotales);
        String[] frasesCorrectas = { //Array de frases para felicitar una respuesta correcta
            "¡Impresionante! Has respondido correctamente.",
            "¡Maravilloso! Sigues acertando.",
            "¡Excelente trabajo! Cada acierto te acerca más al éxito.",
            "¡Espectacular! Parece que tienes un don para esto.",
            "¡Increíble! Tu inteligencia brilla con cada respuesta acertada.",
            "¡Asombroso! No hay nada que se te escape.",
            "¡Genial! Cada respuesta correcta te lleva más cerca de la victoria.",
            "¡Fantástico! Tu habilidad para resolver preguntas es admirable.",
            "¡Bravo! No hay desafío que no puedas superar.",
            "¡Espléndido! No dejas de sorprenderme con tus aciertos.",
            "Bien! Continúa así y llegarás lejos.",
            "¡Sorprendente! Tu astucia te está llevando al triunfo.",
            "¡Bien! No hay obstáculo que te detenga.",
            "¡Perfecto! Cada respuesta acertada es un paso más hacia la gloria.",
            "¡Espera un segundo! ¿Eres un genio?",
            "¡Estás brillando! Sigue así y conquistarás todo.",
            "¡Eres un maestro! Las respuestas correctas te dominan.",
            "¡Increíble conocimiento! Estás haciendo historia.",
        };
        String[] frasesIncorrectas = { //Array de frases para las respuestas incorrectas
            "¡Error! La respuesta incorrecta te acerca a la visita de la policía.",
            "¡Ups! Parece que te estás acercando a una cita con la justicia.",
            "¡Incorrecto! ¿Preparado para la llamada de las autoridades?",
            "¡Equivocado! Sigue así y activaremos las alarmas.",
            "¡Incorrecto! La respuesta errónea te acerca a los grilletes.",
            "¡Fallaste! La próxima vez podrías tener compañía policial.",
            "¡Nop! Un paso más y la policía podría tocar a tu puerta.",
            "¡Incorrecto! ¿Oíste eso? Podría ser el sonido de sirenas.",
            "¡Error! El camino equivocado podría conducirte a problemas legales.",
            "¡Mal! ¿Escuchas eso? Podrían ser pasos de policía.",
            "¡No es correcto! La próxima vez, el uniforme podría ser para ti.",
            "¡Incorrecto! Estás cavando tu propia trampa legal.",
            "¡Fallaste! ¿Huele eso? Puede ser el aroma de problemas legales.",
            "¡Eso no es! La respuesta incorrecta podría tener consecuencias.",
            "¡No acertaste! El siguiente paso podría ser una visita policial.",
            "¡Error! ¿Escuchas las sirenas acercándose?",
            "¡Incorrecto! Un poco más y podrías tener problemas legales.",
            "¡Fallaste! ¿Eso fue un golpe en la puerta? Espero que no sea la policía.",
            "¡Eso no está bien! ¿Te suenan esas sirenas en la distancia?",
            "¡Mal! La respuesta equivocada podría abrirte las puertas del calabozo."
        };
        int numFrases = 17;
        final String verde = "\u001B[32m"; //Aqui declaro como Strings todos los codigos de los colores que voy a usar durante el juego para modificar la salida del texto
        final String amarillo = "\u001B[33m";
        final String azul = "\u001B[34m";
        final String rojo = "\u001B[31m";
        final String morado = "\u001B[35m";
        final String sinColor = "\u001B[0m";
        Collections.shuffle(Arrays.asList(numRespuestas)); //mezcla el orden de los arrays de respuestas posibles que declaro en cada modulo, para que cada vez que se ejecuta el juego tengan un orden diferente
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.Bienvenida(scan, tecla);
        Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);


    }
    public static void Menu(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String[] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador) {
        int opcionMenu = 0;
        System.out.println("*****MENU PRINCIPAL******");
        System.out.printf("1. Nueva partida\n2. Reglas\n3. Estadísticas\n4. La Trama\n");
        try {
            System.out.println("Introduzca la opcion deseada (1, 2, 3 o 4)");
            opcionMenu = scan.nextInt();
            do {
                switch (opcionMenu) { //switch para las posibles opciones que puede elegir el jugador y moverse por el menu
                    case 1: //opcion para iniciar la partida
                        NuevaPartida(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
                        break;
                    case 2: //opcion para mostrar las reglas y volver al menu
                        Reglas.Reglas(verde, amarillo, rojo, morado, azul, sinColor, respuesta, scan);
                        Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
                        break;
                    case 3: //opcion para mostrar las estadisticas, con un condicional para ver si ha jugado al menos una partida porque si no da error al no haber estadisticas acumuladas aun
                        if (aciertosTotales > 1 || fallos > 1) {
                            Estadisticas.Estadisticas(aciertosTotales, fallos, comodinesUsados, scan, jugador);
                            Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
                        } else {
                            System.out.println("Debes jugar al menos una partida para acceder a las estadísticas.");
                            Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
                        }
                        break;
                    case 4: //opcion para explicar la trama del juego
                        LaTrama.LaTrama();
                        System.out.println("Pulsa cualquier tecla para volver al menú");
                        tecla = scan.next().charAt(0);
                        Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
                        break;
                    default:
                        System.out.println("Introduce una opción correcta.");
                        Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
                        break;
                }
            } while (opcionMenu != 4);
        } catch (InputMismatchException ex) {
            System.out.println("Error: Introduzca una opción correcta.");
            scan.next(); // Limpia el buffer del scanner para evitar bucles infinitos
            Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
        }
    }
    public static void NuevaPartida (Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        String dificultad;
        aciertos = 0;//inicializamos los datos de aciertos y fallos a cero para que no se vuelvan a contar
        do{
            System.out.println("Por favor, seleccione un nivel de dificultad (media/dificil)"); // Hasta ahora solo he implementado el modo normal, pero queda pendiente implementar el fácil y el difícil
            scan.nextLine();
            dificultad=scan.nextLine();
        }while(!dificultad.equalsIgnoreCase("media")&&!dificultad.equalsIgnoreCase("dificil"));

        if (dificultad.equalsIgnoreCase("media")){
            PartidaMedia70(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas,jugador);
        }else if(dificultad.equalsIgnoreCase("dificil")){
            PartidaDificil70(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
        }
            
    }
    public static void PartidaMedia70(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aleatorio = (int) (Math.random() * datosPosibles);//Genera un numero aleatorio para que cada partida tenga una combinación de datos diferentes//
        String [] lugares = {"el Green","el Ahorra-Mas","la cola del banco","la carretera Alcala-Camarma","las fiestas de Valdeaveruelo","el Parque O Donell","tu casa","la gasolinera","el concierto de Victor Manuel","la clase de boxeo"};//al principio de cada modulo de preguntas, se declaran las posibles pistas que se van a dar al final de este si se superan las preguntas, en la que cada vez que se ejecute el juego, será aleatorio gracias al metodo random
        String [] media70 = {"1. ¿Qué evento importante en la década de 1970 dio inicio a la era de la informática personal y los microprocesadores?"
        ,"2. ¿Cuál fue el nombre del líder chino que murió en 1976 y fue fundamental en la fundación de la República Popular China?","3. ¿Quién fue el presidente de Estados Unidos durante la mayor parte de la década de 1970?",
        "4. ¿Qué evento deportivo marcó la entrada de China en la comunidad internacional en 1971?","5. ¿Qué álbum de estudio de Pink Floyd, lanzado en 1973, es considerado uno de los mejores álbumes de rock progresivo de todos los tiempos?",
        "6. ¿Qué forma de arte visual, que utiliza ilusiones ópticas, ganó popularidad en la década de 1970?","7. ¿Quién fue el líder soviético que firmó el Tratado de Helsinki en 1975, comprometiéndose con la cooperación y la seguridad en Europa?", //al principio de cada modulo se declaran todos las preguntas que van dentro de un array
        "8. ¿Qué evento medioambiental importante en 1972 llevó a la prohibición de ciertos productos químicos perjudiciales para la capa de ozono?","9. ¿Quién fue el famoso boxeador que se enfrentó a George Foreman en la 'Rumble in the Jungle' en 1974?",
        "10. ¿Qué líder egipcio firmó un acuerdo de paz con Israel en 1979, poniendo fin a décadas de conflicto?"};
        String [] respuestasmedia70A = {"Llegada del hombre a la Luna","Kim Il-sung","Ronald Reagan","Juegos Olimpicos de Munich 1972","'The Wall'","Cubismo","Leonid Brezhnev","Acuerdo de Kioto","Joe Frazier","Yasser Arafat"};//igual que el modulo de preguntas, pero con el de respuestas incorrectas, de los que habra 3 arrays
        String [] respuestasmedia70B = {"Desarrollo del ARPANET","Ho Chi Minh","John F. Kennedy","Copa Mundial de la FIFA 1974","'Dark Side of the Moon'","Surrealismo","Mijail Gorbachov","Protocolo de Montreal","Sonny Liston","Gamal Abdel Nasser"};
        String [] respuestasmedia70C = {"Descubrimiento del boson de Higgs","Chiang Kai-shek","Jonh F. Kennedy","Juegos Olimpicos de Montreal 1976","'Wish You Were Here'","Expresionismo abstracto","Nikita Jrushchov","Creacion de la Agencia de Proteccion Ambiental de EE. UU.","Mike Tyson","Hosni Mubarak"};
        String [] respuestasCorrectasmedia70 = {"Invencion del microprocesador","Mao Zedong","Richard Nixon","Partido de ping pong entre China y Estados Unidos","'The Dark Side of the Moon'","Arte cinetico","Alexei Kosygin","Conferencia de Estocolmo sobre el Medio Ambiente","Muhammad Ali","Anwar Sadat"};//aqui se acumulan todas las respuestas correctas
        System.out.println("Pablo, un científico al borde de la perdición debido a su adicción al alcohol, vive una vida monótona y solitaria. Un día, la rutina se quiebra cuando la policía llama a su puerta acusándolo de un asesinato reciente. Desconcertado y asustado, Pablo se ve envuelto en un torbellino de eventos cuando busca respuestas en su propio pasado. Mientras revisa sus pertenencias en busca de algo que explique la acusación en su contra, Pablo abre un cajón olvidado y encuentra un prototipo de su máquina del tiempo, un proyecto que había abandonado. En ese momento, un misterioso Sabio del Tiempo se revela y le propone un pacto: si Pablo puede superar una serie de desafíos respondiendo preguntas triviales de diferentes décadas, obtendrá los datos necesarios para hacer funcionar la máquina del tiempo y corregir el error que lo persigue.");//dialogo introductorio
        System.out.println("Pulsa cualquier tecla para continuar");
        tecla=scan.next().charAt(0);
        System.out.println(verde+"Miercoles, 13 de diciembre de 2023, 18:26 horas, Alcalá de Henares (Madrid)"+sinColor);
        System.out.println("La habitación de Pablo está desordenada, botellas vacías por todas partes. Un olor a alcohol impregna el aire. Pablo, un científico desaliñado, duerme profundamente en su cama. De repente, fuertes golpes en la puerta lo despiertan. Se restriega los ojos y se levanta torpemente.\n"+azul+"Policía: "+sinColor+"¡Abra la puerta! Policía, tenemos preguntas que hacerle.\n(Pablo, nervioso, se aproxima a la puerta y la abre con cautela. Dos oficiales de policía lo miran seriamente.)\n"+azul+"Oficial 1: "+sinColor+"Buenas, ¿es usted el señor Pablo Sierra?\n"+amarillo+"Pablo: "+sinColor+" Sí, soy yo. ¿Qué está pasando?\n"+azul+"Oficial 2: "+sinColor+"Tenemos información que sugiere que podría estar involucrado en un asunto grave. Necesitamos que venga a la comisaría para responder algunas preguntas.\n"+amarillo+"Pablo: "+sinColor+"¡¿Qué?! No entiendo. Yo... yo no he hecho nada.\n(Pablo, sintiendo el peso de la situación, se apresura a vestirse mientras su mente da vueltas tratando de entender qué asesinato se le imputa. En medio del caos, activa su proyecto mas preciado, una máquina del tiempo inacabada e inestable, la cual había desarrollado previamente y guardada en su armario, aunque aún teme usarla debido a su inestabilidad.)\n"+amarillo+"Pablo: "+sinColor+"(Para sí mismo) Mi máquina del tiempo... ¿Debería usarla? No está terminada, pero... tal vez sea mi única salida.\n(La habitación comienza a distorsionarse mientras la máquina del tiempo se activa. Pablo, confundido, es transportado a una década totalmente diferente. En ese momento, el Sabio del Tiempo de los años 70 aparece ante él.)\n"+verde+"Sabio del Tiempo: "+sinColor+"¡Bienvenido, Pablo! Te encuentras en una encrucijada en el tejido del tiempo. Soy un Sabio del Tiempo, y tu única salvación es superar las pruebas que te propondré.\n"+amarillo+"Pablo: "+sinColor+"(Nervioso) ¿Pruebas? ¿Quién eres?\n"+verde+"Sabio del Tiempo: "+sinColor+"Soy el guardián de los hilos temporales. Para enmendar tu error, necesitarás respuestas de distintas épocas. Acertando preguntas, obtendrás datos cruciales. Solo así podrás viajar al momento exacto y corregir tu destino. Si logras superarme, te diré el "+morado+"lugar "+sinColor+" donde cometiste el asesinato. ¿Estás listo, o prefieres ir a la cárcel? Vamos allá...¡comienza el cuestionario!");
        System.out.println("Pulsa cualquier tecla para continuar");
        tecla=scan.next().charAt(0);
        for(int i = 0; i<media70.length;i++){//primer bucle para controlar la muestra de preguntas
            List<String> respuestas70mediaList = Arrays.asList( /*Esta funcion crea una lista de arrays para poder mezclarlas mas adelante cada vez que se ejecute tenga un orden diferente */
                respuestasmedia70A[i],
                respuestasmedia70B[i],
                respuestasmedia70C[i],
                respuestasCorrectasmedia70[i]
            );
            Collections.shuffle(respuestas70mediaList); /*Baraja las posibles respuestas */
            System.out.println(media70[i]);
            for(int j = 0;j<respuestas70mediaList.size();j++){//nuevo bucle para mostras las respuestas ya que si lo incluyo en el de las preguntas, se muestran en bucle las preguntas despues de cada posible respuesta
                char [] letraOpcion = {'a','b','c','d'};//array de posibles letras para asociarlas a las respuestas
                System.out.println(letraOpcion[j]+" "+respuestas70mediaList.get(j));//muestra las respuestas junto con la letra
                
            }
            System.out.println("Introduzca la letra de la respuesta correcta (A/B/C/D): "); //Recojo la letra asociada a la respuesta//
            respuesta = scan.next().toUpperCase().charAt(0);

            if (respuesta == (char) ('A' + respuestas70mediaList.indexOf(respuestasCorrectasmedia70[i]))) { //Con este condicional comparo la letra asociada a la respuesta para ir sumando aciertos o fallos//
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);//muestro una frase aleatoria del array de frases correctas
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
            } else {
                fallos++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesIncorrectas[aleatorioFrases]);//muestro una frase aleatoria del array de frases incorrectas
            }

        }
        aciertos = 10;
        if(aciertos>=7){
                System.out.println("Sabio del tiempo: Enhorabuena, muchacho. Has logrado superar la prueba, y como muestra de tu sabiduría te daré la información que venías buscando. El lugar donde cometiste el homicidio fue en "+azul+ lugares[aleatorio]+sinColor+". Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida *desaparece*");
        }
        lugar=lugares[aleatorio];//asocio a la variable lugar el lugar aleatorio generado para usarlo facilmente en el modulo ResolucionFinal, asi con todas los datos que se van obteniendo a lo largo del juego
        if(aciertos>=8){
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");//se otorga un comodin si se obtienen 8 o mas respuestas correctas
            comodines=comodines+1;
        }
        if(aciertos>=7){ //Esta parte no puedo poner metodo ganar, porque tiene una frase personalizada para cada nivel de dificultad
            System.out.println("Después de superar los desafíos, te sientes mareado mientras la máquina del tiempo se activa automáticamente.");
            System.out.println(amarillo+"Pablo: "+sinColor+"¡Espera! ¿Qué está sucediendo?");
            PartidaMedia80(scan, aciertos, fallos, aleatorio, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
        }
        if(aciertos<7){//Uso los metodos creados en otros archivos para mostrar los mensajes de perdida, guardar los datos y volver al menu
                Perder.PerderMedia(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertosTotales, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

            }
        
    }
    public static void PartidaDificil70(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aleatorio = (int) (Math.random() * datosPosibles);//Genera un numero aleatorio para que cada partida tenga una combinación de datos diferentes//
        String [] lugares = {"el Green","el Ahorra-Mas","la cola del banco","la carretera Alcala-Camarma","las fiestas de Valdeaveruelo","el Parque O Donell","tu casa","la gasolinera","el concierto de Victor Manuel","la clase de boxeo"};//al principio de cada modulo de preguntas, se declaran las posibles pistas que se van a dar al final de este si se superan las preguntas, en la que cada vez que se ejecute el juego, será aleatorio gracias al metodo random
        String[] dificil70 = {"1. ¿Qué innovación tecnológica, lanzada en 1971, marcó el inicio de la era digital y revolucionó la industria de la computación?", "2. ¿Cuál fue el nombre del programa espacial de la Unión Soviética que envió el primer vehículo robótico a la Luna en 1970?", "3. ¿Quién fue el líder comunista que sucedió a Mao Zedong como presidente de China en 1976?", "4. ¿Cuál fue el nombre del acuerdo de paz firmado en 1973 que puso fin a la participación estadounidense en la Guerra de Vietnam?", "5. ¿Qué movimiento social, surgido en Jamaica en la década de 1970, promovió el uso de marihuana y la música reggae?", "6. ¿Qué científico descubrió el virus que causa la enfermedad del SIDA en la década de 1970?", "7. ¿Quién fue el primer presidente en ser destituido en Brasil, en 1974, tras un escándalo de corrupción?", "8. ¿Qué país africano obtuvo la independencia de Portugal en 1975 después de una larga guerra de liberación?", "9. ¿Qué incidente de secuestro de avión en 1976 llevó al rescate audaz de pasajeros en Uganda?", "10. ¿Qué líder revolucionario y político guatemalteco fue asesinado en 1976 en Ciudad de México?"};
        String[] respuestasdificil70A = {"MySQL", "Programa Sol", "Hua Guifeng", "Tratado del 76", "Movimiento Rockero", "Curt Lupin", "Frankz Beckenbaüer", "Zambia", "Operación Gussort", "Miguel de Unamuno"};
        String[] respuestasdificil70B = {"Transistor", "Programa Vostok", "Lin Biao", "Conferencia de Ginebra", "Movimiento Punk", "Francis Crick", "Fernando Collor de Mello", "Mozambique", "Secuestro de Lufthansa", "Jacob Árbenz"};
        String[] respuestasdificil70C = {"Fibra óptica", "Programa Apolo", "Zhou Enlai", "Acuerdo de Paz de Helsinki", "Movimiento Hippie", "Robert Gallo", "João Goulart", "Zaire", "Secuestro de Air France", "Salvador Allende"};
        String[] respuestasCorrectasdificil70 = {"Microprocesador Intel 4004", "Programa Luna", "Hua Guofeng", "Acuerdos de Paz de París", "Movimiento Rastafari", "Luc Montagnier", "Juscelino Kubitschek", "Angola", "Operación Entebbe", "Pablo Neruda"};

        System.out.println("Pablo, un científico al borde de la perdición debido a su adicción al alcohol, vive una vida monótona y solitaria. Un día, la rutina se quiebra cuando la policía llama a su puerta acusándolo de un asesinato reciente. Desconcertado y asustado, Pablo se ve envuelto en un torbellino de eventos cuando busca respuestas en su propio pasado. Mientras revisa sus pertenencias en busca de algo que explique la acusación en su contra, Pablo abre un cajón olvidado y encuentra un prototipo de su máquina del tiempo, un proyecto que había abandonado. En ese momento, un misterioso Sabio del Tiempo se revela y le propone un pacto: si Pablo puede superar una serie de desafíos respondiendo preguntas triviales de diferentes décadas, obtendrá los datos necesarios para hacer funcionar la máquina del tiempo y corregir el error que lo persigue.");//dialogo introductorio
        System.out.println("Pulsa cualquier tecla para continuar");
        tecla=scan.next().charAt(0);
        System.out.println(verde+"Miercoles, 13 de diciembre de 2023, 18:26 horas, Alcalá de Henares (Madrid)"+sinColor);
        System.out.println("La habitación de Pablo está desordenada, botellas vacías por todas partes. Un olor a alcohol impregna el aire. Pablo, un científico desaliñado, duerme profundamente en su cama. De repente, fuertes golpes en la puerta lo despiertan. Se restriega los ojos y se levanta torpemente.\n"+azul+"Policía: "+sinColor+"¡Abra la puerta! Policía, tenemos preguntas que hacerle.\n(Pablo, nervioso, se aproxima a la puerta y la abre con cautela. Dos oficiales de policía lo miran seriamente.)\n"+azul+"Oficial 1: "+sinColor+"Buenas, ¿es usted el señor Pablo Sierra?\n"+amarillo+"Pablo: "+sinColor+" Sí, soy yo. ¿Qué está pasando?\n"+azul+"Oficial 2: "+sinColor+"Tenemos información que sugiere que podría estar involucrado en un asunto grave. Necesitamos que venga a la comisaría para responder algunas preguntas.\n"+amarillo+"Pablo: "+sinColor+"¡¿Qué?! No entiendo. Yo... yo no he hecho nada.\n(Pablo, sintiendo el peso de la situación, se apresura a vestirse mientras su mente da vueltas tratando de entender qué asesinato se le imputa. En medio del caos, activa su proyecto mas preciado, una máquina del tiempo inacabada e inestable, la cual había desarrollado previamente y guardada en su armario, aunque aún teme usarla debido a su inestabilidad.)\n"+amarillo+"Pablo: "+sinColor+"(Para sí mismo) Mi máquina del tiempo... ¿Debería usarla? No está terminada, pero... tal vez sea mi única salida.\n(La habitación comienza a distorsionarse mientras la máquina del tiempo se activa. Pablo, confundido, es transportado a una década totalmente diferente. En ese momento, el Sabio del Tiempo de los años 70 aparece ante él.)\n"+verde+"Sabio del Tiempo: "+sinColor+"¡Bienvenido, Pablo! Te encuentras en una encrucijada en el tejido del tiempo. Soy un Sabio del Tiempo, y tu única salvación es superar las pruebas que te propondré.\n"+amarillo+"Pablo: "+sinColor+"(Nervioso) ¿Pruebas? ¿Quién eres?\n"+verde+"Sabio del Tiempo: "+sinColor+"Soy el guardián de los hilos temporales. Para enmendar tu error, necesitarás respuestas de distintas épocas. Acertando preguntas, obtendrás datos cruciales. Solo así podrás viajar al momento exacto y corregir tu destino. Si logras superarme, te diré el "+morado+"lugar "+sinColor+" donde cometiste el asesinato. ¿Estás listo, o prefieres ir a la cárcel? Vamos allá...¡comienza el cuestionario!");
        System.out.println("Pulsa cualquier tecla para continuar");
        tecla=scan.next().charAt(0);
        for(int i = 0; i<dificil70.length;i++){//primer bucle para controlar la muestra de preguntas
            List<String> respuestas70dificilList = Arrays.asList( /*Esta funcion crea una lista de arrays para poder mezclarlas mas adelante cada vez que se ejecute tenga un orden diferente */
                respuestasdificil70A[i],
                respuestasdificil70B[i],
                respuestasdificil70C[i],
                respuestasCorrectasdificil70[i]
            );
            Collections.shuffle(respuestas70dificilList); /*Baraja las posibles respuestas */
            System.out.println(dificil70[i]);
            for(int j = 0;j<respuestas70dificilList.size();j++){//nuevo bucle para mostras las respuestas ya que si lo incluyo en el de las preguntas, se muestran en bucle las preguntas despues de cada posible respuesta
                char [] letraOpcion = {'a','b','c','d'};//array de posibles letras para asociarlas a las respuestas
                System.out.println(letraOpcion[j]+" "+respuestas70dificilList.get(j));//muestra las respuestas junto con la letra
                
            }
            System.out.println("Introduzca la letra de la respuesta correcta (A/B/C/D): "); //Recojo la letra asociada a la respuesta//
            respuesta = scan.next().toUpperCase().charAt(0);

            if (respuesta == (char) ('A' + respuestas70dificilList.indexOf(respuestasCorrectasdificil70[i]))) { //Con este condicional comparo la letra asociada a la respuesta para ir sumando aciertos o fallos//
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);//muestro una frase aleatoria del array de frases correctas
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
            } else {
                fallos++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesIncorrectas[aleatorioFrases]);//muestro una frase aleatoria del array de frases incorrectas
            }

        }
        aciertos = 10;
        if(aciertos>=8){
                System.out.println("Sabio del tiempo: Enhorabuena, muchacho. Has logrado superar la prueba, y como muestra de tu sabiduría te daré la información que venías buscando. El lugar donde cometiste el homicidio fue en "+azul+ lugares[aleatorio]+sinColor+". Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida *desaparece*");
        }
        lugar=lugares[aleatorio];//asocio a la variable lugar el lugar aleatorio generado para usarlo facilmente en el modulo ResolucionFinal, asi con todas los datos que se van obteniendo a lo largo del juego
        if(aciertos>=9){
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");//se otorga un comodin si se obtienen 8 o mas respuestas correctas
            comodines=comodines+1;
        }
        if(aciertos>=8){
            System.out.println("Después de superar los desafíos, te sientes mareado mientras la máquina del tiempo se activa automáticamente.");
            System.out.println(amarillo+"Pablo: "+sinColor+"¡Espera! ¿Qué está sucediendo?");
            PartidaDificil80(scan, aciertos, fallos, aleatorio, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
        }
        if(aciertos<=7){
                Perder.PerderDificil(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

            }


    }
    private static List<String> eliminarRespuestaIncorrecta(List<String> respuestas, String respuestaIncorrecta) { //metodo que elimina una de las respuestas incorrectas
        List<String> nuevaLista = new ArrayList<>(respuestas);//creo una nueva lista de arrays y hago una copia de la lista original 'respuestas'
        nuevaLista.remove(respuestaIncorrecta);//elimino la respuesta incorrecta especificada 'respuestaIncorrecta' de la nueva lista
        return nuevaLista;
    }

    public static void PartidaMedia80(Scanner scan, int aciertos, int fallos, int aleatorio, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador) {
        aciertos=0;
        String[] dia = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        int numDias = 6;
        int diasAletorio = (int) (Math.random() * numDias);

        String[] media80 = {"1. ¿Cuál fue el evento que marcó el comienzo de la Perestroika y Glasnost en la Unión Soviética en la década de 1980?",
            "2. ¿Qué líder polaco y activista por los derechos humanos fue galardonado con el Premio Nobel de la Paz en 1983?",
            "3. ¿Quién fue el presidente de Estados Unidos durante la mayor parte de la década de 1980?",
            "4. ¿Cuál fue el nombre del transbordador espacial de la NASA que realizó su primer vuelo en 1981?",
            "5. ¿Qué banda británica lanzó el álbum 'The Joshua Tree' en 1987, que incluía éxitos como 'With or Without You'?",
            "6. ¿Quién fue el líder chino conocido por su papel en las protestas de la Plaza Tiananmén en 1989?",
            "7. ¿Cuál fue el nombre del líder sudafricano liberado de prisión en 1989, marcando el inicio del fin del apartheid?",
            "8. ¿Qué evento nuclear ocurrió en 1986 en Ucrania y fue el peor desastre nuclear de la historia?",
            "9. ¿Cuál fue el país anfitrión de los Juegos Olímpicos de Invierno de 1988?",
            "10. ¿Quién fue el pintor neerlandés conocido por sus obras abstractas geométricas, como 'Broadway Boogie Woogie'?"};
        String[] respuestasmedia80A = {"Accidente de Three Mile Island", "Mozart", "George W. Bush", "Atlantis", "The Police", "Hu Jintao", "Desmond Tutu", "Holocausto", "Alemania", "Pablo Picasso"};
        String[] respuestasmedia80B = {"Caída del Muro de Berlín", "Benedicto XVI", "George Clinton", "Discovery", "The Rolling Stones", "Hu Yaobang", "F.W. de Klerk", "Desastre de Fukushima", "Estados Unidos", "Vincent van Gogh"};
        String[] respuestasmedia80C = {"Colapso del comunismo", "Karol Wojtyła (Papa Juan Pablo II)", "Jimmy Carter", "Challenger", "Madonna", "Mijaíl Gorbachov", "Steve Biko", "Conferencia de Estocolmo", "Noruega", "Rembrandt"};
        String[] respuestasCorrectasmedia80 = {"El accidente nuclear de Chernobyl", "Lech Walesa", "Ronald Reagan", "Columbia", "U2", "Deng Xiaoping", "Nelson Mandela", "Accidente de Chernobyl", "Canadá", "Piet Mondrian"};
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"¡Ah, otro viajero del tiempo! ¿Qué te trae a mi década?");
        System.out.println(amarillo+"Pablo: "+sinColor+"No estoy seguro, me enviaron aquí después de responder algunas preguntas. ¿Quién eres?");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Soy el Sabio del Tiempo de esta era. Has pasado las pruebas hasta ahora, pero no esperes que sea fácil aquí.");
        System.out.println(amarillo+"Pablo: "+sinColor+" ¿Por qué?");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+" No confío en que puedas superar mis desafíos. La década de 1980 es un periodo de cambios radicales, y la gente como tú no entiende nuestra complejidad.");
        System.out.println(amarillo+"Pablo: "+sinColor+"No entiendo a qué te refieres. Solo quiero resolver el misterio y enmendar mi error.");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Veremos si puedes. Prepárate para las preguntas, y que la suerte esté de tu lado. Si consigues superarme, te daré el "+morado+"día "+sinColor+"del asesinato.");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < media80.length; i++) {
            List<String> respuestas80mediaList = Arrays.asList(
                respuestasmedia80A[i],
                respuestasmedia80B[i],
                respuestasmedia80C[i],
                respuestasCorrectasmedia80[i]
            );
        List<String> respuestas80mediaComodinList = new ArrayList<>(respuestas80mediaList);
        Collections.shuffle(respuestas80mediaList); /*Baraja las posibles respuestas */
        Collections.shuffle(respuestas80mediaComodinList);
        if(comodines>0){
            System.out.println("Tienes " + comodines + " comodines");
        }
        System.out.println(media80[i]);
        for (int j = 0; j < respuestas80mediaList.size(); j++) {
            char[] letraOpcion = {'a', 'b', 'c', 'd'};
            System.out.println(letraOpcion[j] + " " + respuestas80mediaList.get(j));
        }

        int indiceRespuestaIncorrectaEliminada = -1;

        if (comodines >= 1) {
            System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
            respuesta = scan.next().charAt(0);

            if (respuesta == '$') { //condicional para ver si el usuario quiere utilizar un comodin y eliminar una respuesta incorrecta
                comodinesUsados++;
                System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                System.out.println(media80[i]);
                for (int j = 0; j < respuestas80mediaList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    System.out.println(letraOpcion[j] + " " + respuestas80mediaComodinList.get(j));
                }

                // Elimina una respuesta incorrecta al azar
                Random random = new Random(); //creo la clase random para aleatorizar numeros
                indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas80mediaComodinList.size());//aleatoriza un numero entre 0 y el tamaño de la lista de respuestas incorrectas para eliminar una
                respuestas80mediaList = eliminarRespuestaIncorrecta(respuestas80mediaList, respuestas80mediaComodinList.get(indiceRespuestaIncorrectaEliminada));//utilizo el metodo eliminarRespuestaIncorrecta, anteriormente definido, para eliminar la respuesta incorrecta correspondiente al indice aleatorio generado. La nueva lista resultante se asigna a respuestas80mediaList.

                comodines = comodines - 1;
            }
        }

        if(respuesta=='$'){    // Muestra la pregunta con las respuestas originales y la respuesta incorrecta eliminada
            System.out.println(media80[i]);
            for (int j = 0; j < respuestas80mediaList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                if (j == indiceRespuestaIncorrectaEliminada) {
                    System.out.println(letraOpcion[j] + " " +  respuestas80mediaList.get(j));
                    } else {
                        System.out.println(letraOpcion[j] + " " + respuestas80mediaList.get(j));
                    }
            }
        }

            // Pide al usuario que vuelva a ingresar su respuesta
        System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
        respuesta = scan.next().toUpperCase().charAt(0);

            // Compara la respuesta del usuario con la respuesta correcta
        if (respuesta == (char) ('A' + respuestas80mediaList.indexOf(respuestasCorrectasmedia80[i]))) {
            aciertos++;
            aciertosTotales++;
            int aleatorioFrases= (int) (Math.random() * numFrases);
            System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
            } else {
                fallos++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesIncorrectas[aleatorioFrases]);
            }
        }
        aciertos = 10;
        if (aciertos >= 7) {
            System.out.println("Sorprendente, no sabía que un zoquete de tu calibre pudiera albergar tanta cantidad de datos aleatorios en ese diminuto, pero funcional cerebro que parece que tienes. Has logrado superar la prueba, y como muestra de tu sabiduría te daré la información que venías buscando y un " + morado + "comodín" + sinColor + ". El día que cometiste tu error fue el " + azul + dia[diasAletorio] + sinColor + ". Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida *desaparece*");
        }
        dias=dia[diasAletorio];
        if (aciertos >= 8) {
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");
            comodines = comodines + 1;
        }
        if(aciertos>=7){
            System.out.println("La máquina del tiempo se vuelve a activar y en un abrir y cerrar de ojos, Pablo se encuentra en la siguiente década\nPulsa cualquier tecla para continuar");
            tecla=scan.next().charAt(0);
            PartidaMedia90(scan, aciertos, fallos, aleatorio, diasAletorio, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
        }
        if(aciertos<7){
            Perder.PerderMedia(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
            jugador.guardarResultados(aciertosTotales, fallos, comodinesUsados, jugador);
            Menu(scan, aciertos, fallos, aleatorio, diasAletorio, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

        }
    

    }
    public static void PartidaDificil80(Scanner scan, int aciertos, int fallos, int aleatorio, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos=0;
        String[] dia = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        int numDias = 6;
        int diasAletorio = (int) (Math.random() * numDias);
        String[] dificil80 = {"1. ¿Quién fue el presidente de Estados Unidos durante la mayor parte de la década de 1980?", "2. ¿Cuál fue el nombre del líder soviético que implementó políticas de glásnost y perestroika en la Unión Soviética?", "3. ¿Qué evento deportivo de invierno tuvo lugar en Estados Unidos en 1980 y fue conocido por la victoria del equipo de hockey sobre hielo de Estados Unidos sobre la Unión Soviética?", "4. ¿Qué accidente nuclear ocurrió en 1986 en en mundo?", "5. ¿Qué presidente egipcio firmó un tratado de paz con Israel en 1979, poniendo fin a décadas de hostilidad?", "6. ¿Quién fue el líder chino que implementó reformas económicas en China a partir de finales de la década de 1970?", "7. ¿Qué presidente de Brasil lanzó el Plan Cruzado en 1986 para combatir la inflación?", "8. ¿Qué líder político británico lideró al Partido Conservador durante la mayor parte de la década de 1980?", "9. ¿Qué álbum de estudio de Michael Jackson, lanzado en 1982, se convirtió en el álbum más vendido de todos los tiempos?", "10. ¿Quién fue el líder sudafricano que fue liberado de la prisión en 1990, poniendo fin al apartheid en Sudáfrica?"};
        String[] respuestasdificil80A = {"John F Kennedy", "Gorbev Gorbachov", "Mundial Hockey 1980", "Desastre del Ran-Zaz", "Abderraman VI", "Ling Xiaoyu", "Jacinto Dos Areias", "Lucibelle Hurdington", "Dangerous", "Mahatma Ghandi"};
        String[] respuestasdificil80B = {"Jimmy Carter", "Vladímir Putin", "Copa Mundial de la FIFA 1980", "Desastre de Three Mile Island", "Hosni Mubarak", "Mao Zedong", "José Sarney", "Tony Blair", "'Bad'", "F.W. de Klerk"};
        String[] respuestasdificil80C = {"George H. W. Bush", "Leonid Brezhnev", "Juegos Olímpicos de Verano de Los Ángeles 1980", "Accidente de Fukushima Daiichi", "Yitzhak Rabin", "Hu Jintao", "Luiz Inácio Lula da Silva", "Winston Churchill", "'Off the Wall'", "Steve Biko"};
        String[] respuestasCorrectasdificil80 = {"Ronald Reagan", "Mijaíl Gorbachov", "Juegos Olímpicos de Invierno de Lake Placid 1980", "Accidente de Chernobyl", "Anwar Sadat", "Deng Xiaoping", "Fernando Collor de Mello", "Margaret Thatcher", "'Thriller'", "Nelson Mandela"};
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"¡Ah, otro viajero del tiempo! ¿Qué te trae a mi década?");
        System.out.println(amarillo+"Pablo: "+sinColor+"No estoy seguro, me enviaron aquí después de responder algunas preguntas. ¿Quién eres?");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Soy el Sabio del Tiempo de esta era. Has pasado las pruebas hasta ahora, pero no esperes que sea fácil aquí.");
        System.out.println(amarillo+"Pablo: "+sinColor+" ¿Por qué?");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+" No confío en que puedas superar mis desafíos. La década de 1980 es un periodo de cambios radicales, y la gente como tú no entiende nuestra complejidad.");
        System.out.println(amarillo+"Pablo: "+sinColor+"No entiendo a qué te refieres. Solo quiero resolver el misterio y enmendar mi error.");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Veremos si puedes. Prepárate para las preguntas, y que la suerte esté de tu lado. Si consigues superarme, te daré el "+morado+"día "+sinColor+"del asesinato.");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < dificil80.length; i++) {//primer bucle para controlar la muestra de preguntas
            List<String> respuesta80dificilList = Arrays.asList(
                respuestasdificil80A[i],
                respuestasdificil80B[i],
                respuestasdificil80C[i],
                respuestasCorrectasdificil80[i]
            );
        List<String> respuestas80dificilComodinList = new ArrayList<>(respuesta80dificilList);//creo una lista de arrays para poder mezclarlas mas adelante cada vez que se ejecute tenga un orden diferente
        Collections.shuffle(respuesta80dificilList); /*Baraja las posibles respuestas */
        Collections.shuffle(respuestas80dificilComodinList);
        if(comodines>0){
            System.out.println("Tienes " + comodines + " comodines");
        }
        System.out.println(dificil80[i]);
        for (int j = 0; j < respuesta80dificilList.size(); j++) {
            char[] letraOpcion = {'a', 'b', 'c', 'd'};
            System.out.println(letraOpcion[j] + " " + respuesta80dificilList.get(j));
        }

        int indiceRespuestaIncorrectaEliminada = -1;

        if (comodines >= 1) {
            System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
            respuesta = scan.next().charAt(0);

            if (respuesta == '$') { //condicional para ver si el usuario quiere utilizar un comodin y eliminar una respuesta incorrecta
                comodinesUsados++;
                System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                System.out.println(dificil80[i]);
                for (int j = 0; j < respuesta80dificilList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    System.out.println(letraOpcion[j] + " " + respuestas80dificilComodinList.get(j));
                }

                // Elimina una respuesta incorrecta al azar
                Random random = new Random(); //creo la clase random para aleatorizar numeros
                indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas80dificilComodinList.size());//aleatoriza un numero entre 0 y el tamaño de la lista de respuestas incorrectas para eliminar una
                respuesta80dificilList = eliminarRespuestaIncorrecta(respuesta80dificilList, respuestas80dificilComodinList.get(indiceRespuestaIncorrectaEliminada));//utilizo el metodo eliminarRespuestaIncorrecta, anteriormente definido, para eliminar la respuesta incorrecta correspondiente al indice aleatorio generado. La nueva lista resultante se asigna a respuesta80dificilList.

                comodines = comodines - 1;
            }
        }

        if(respuesta=='$'){    // Muestra la pregunta con las respuestas originales y la respuesta incorrecta eliminada
            System.out.println(dificil80[i]);
            for (int j = 0; j < respuesta80dificilList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                if (j == indiceRespuestaIncorrectaEliminada) {
                    System.out.println(letraOpcion[j] + " " +  respuesta80dificilList.get(j));
                    } else {
                        System.out.println(letraOpcion[j] + " " + respuesta80dificilList.get(j));
                    }
            }
        }

            // Pide al usuario que vuelva a ingresar su respuesta
        System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
        respuesta = scan.next().toUpperCase().charAt(0);

            // Compara la respuesta del usuario con la respuesta correcta
        if (respuesta == (char) ('A' + respuesta80dificilList.indexOf(respuestasCorrectasdificil80[i]))) {
            aciertos++;
            aciertosTotales++;
            int aleatorioFrases= (int) (Math.random() * numFrases);
            System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
            } else {
                fallos++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesIncorrectas[aleatorioFrases]);
            }
        }
        aciertos = 10;
        if (aciertos >= 8) {
            System.out.println("Sorprendente, no sabía que un zoquete de tu calibre pudiera albergar tanta cantidad de datos aleatorios en ese diminuto, pero funcional cerebro que parece que tienes. Has logrado superar la prueba, y como muestra de tu sabiduría te daré la información que venías buscando y un " + morado + "comodín" + sinColor + ". El día que cometiste tu error fue el " + azul + dia[diasAletorio] + sinColor + ". Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida *desaparece*");
        }
        dias=dia[diasAletorio];
        if (aciertos >= 9) {
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");
            comodines = comodines + 1;
        }
        if(aciertos>=8){
            System.out.println("La máquina del tiempo se vuelve a activar y en un abrir y cerrar de ojos, Pablo se encuentra en la siguiente década\nPulsa cualquier tecla para continuar");
            tecla=scan.next().charAt(0);
            PartidaDificil90(scan, aciertos, fallos, aleatorio, diasAletorio, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
        }
        if(aciertos<=7){
            Perder.PerderDificil(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
            jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
            Menu(scan, aciertos, fallos, aleatorio, diasAletorio, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

        }

    }     
    public static void PartidaMedia90(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos = 0;
        String [] hora = {"19:24","23:13","15:56","05:10","3:45","21:36","00:30","02:43","08:26","10:15"};
        int horaAleatoria = (int) (Math.random() * datosPosibles);
        String[] media90 = { "1. ¿Cuál fue el nombre del telescopio espacial lanzado en 1990 que ha proporcionado imágenes asombrosas del universo?", "2. ¿En qué año se completó la unificación de Alemania, poniendo fin a la Guerra Fría?", "3. ¿Quién fue el primer presidente de Rusia después de la disolución de la Unión Soviética en 1991?", "4. ¿Qué país fue el anfitrión de los Juegos Olímpicos de Verano de 1996?",  "5. ¿Cuál fue el álbum más vendido de la década de 1990, lanzado por una banda británica?",
        "6. ¿Quién fue el artista pop conocido por sus obras inspiradas en la cultura popular, como las latas de sopa Campbell?",  "7. ¿Quién fue la 'Dama de Hierro', la primera ministra del Reino Unido durante gran parte de la década de 1990?",  "8. ¿Cuál fue el primer animal clonado a nivel mundial, anunciado en 1996?", "9. ¿Quién fue el jugador de baloncesto icónico que lideró los Chicago Bulls durante la década de 1990?",  "10. ¿Qué acuerdo histórico se firmó en 1998, contribuyendo al proceso de paz en Irlanda del Norte?"};
        String[] respuestasmedia90A = {"Copernicus", "1989", "Dmitry Medvedev", "Australia", "The Dark Side of the Moon (Pink Floyd)", "Jackson Pollock", "Angela Merkel", "Raton", "Magic Johnson", "Acuerdo de Ginebra"};
        String[] respuestasmedia90B = { "Kepler", "1995", "Vladimir Putin", "Francia", "Thriller (Michael Jackson)", "Salvador Dali", "Indira Gandhi", "Pez", "Larry Bird","Acuerdo de Oslo"};
        String[] respuestasmedia90C = {"Galileo","1993","Mikhail Gorbachev", "España", "The Joshua Tree (U2)", "Pablo Picasso", "Theresa May", "Perro", "Kobe Bryant", "Acuerdo de Belfast"};
        String[] respuestasCorrectasmedia90 = {"Hubble","1991","Boris Yeltsin","Estados Unidos","Spice (Spice Girls)","Andy Warhol","Margaret Thatcher","Oveja (Dolly)","Michael Jordan","Acuerdo de Viernes Santo"};
        System.out.println(amarillo+"Pablo: "+sinColor+"Este ambiente si que me va sonando más, estoy en los 90, ¿verdad?");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Bienvenido, viajero. No te haré perder el tiempo porque veo que ya sabes como funciona el juego. Si consigues superarme, te dare la "+morado+"la hora "+sinColor+"del asesinato. Suerte.");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < media90.length; i++) {
            List<String> respuestas90mediaList = Arrays.asList(
                    respuestasmedia90A[i],
                    respuestasmedia90B[i],
                    respuestasmedia90C[i],
                    respuestasCorrectasmedia90[i]
                );
            List<String> respuestas90mediaComodinList = new ArrayList<>(respuestas90mediaList);
            Collections.shuffle(respuestas90mediaList); /*Baraja las posibles respuestas */
            Collections.shuffle(respuestas90mediaComodinList);
            if(comodines>0){
                System.out.println("Tienes " + comodines + " comodines");
            }
            System.out.println(media90[i]);
            for (int j = 0; j < respuestas90mediaList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                System.out.println(letraOpcion[j] + " " + respuestas90mediaList.get(j));
            }

            int indiceRespuestaIncorrectaEliminada = -1;

            if (comodines >= 1) {
                System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
                respuesta = scan.next().charAt(0);

                if (respuesta == '$') {
                    comodinesUsados++;
                    System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                    System.out.println(media90[i]);
                    for (int j = 0; j < respuestas90mediaList.size(); j++) {
                        char[] letraOpcion = {'a', 'b', 'c', 'd'};
                        System.out.println(letraOpcion[j] + " " + respuestas90mediaComodinList.get(j));
                    }

                        // Elimina una respuesta incorrecta al azar
                        Random random = new Random();
                        indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas90mediaComodinList.size());
                        respuestas90mediaList = eliminarRespuestaIncorrecta(respuestas90mediaList, respuestas90mediaComodinList.get(indiceRespuestaIncorrectaEliminada));

                        comodines = comodines - 1;
                }
            }

            if(respuesta=='$'){
                System.out.println(media90[i]);
                for (int j = 0; j < respuestas90mediaList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    if (j == indiceRespuestaIncorrectaEliminada) {
                        System.out.println(letraOpcion[j] + " " + respuestas90mediaList.get(j));
                    } else {
                            System.out.println(letraOpcion[j] + " " + respuestas90mediaList.get(j));
                    }
                }
            }    

                // Pide al usuario que vuelva a ingresar su respuesta
            System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
            respuesta = scan.next().toUpperCase().charAt(0);

                // Compara la respuesta del usuario con la respuesta correcta
            if (respuesta == (char) ('A' + respuestas90mediaList.indexOf(respuestasCorrectasmedia90[i]))) {
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
                } else {
                    fallos++;
                    int aleatorioFrases= (int) (Math.random() * numFrases);
                    System.out.println(frasesIncorrectas[aleatorioFrases]);
                }
            }
            aciertos = 10;
            if(aciertos>=7){
                    System.out.println("Sabio del tiempo: "+rojo+"*palmadas irónicas*"+sinColor+". Si llego a saberlo, te lo habría puesto mucho más difícil, pero aun así te daré la información que venías buscando y un "+morado +"comodín"+sinColor+". La hora a la que cometiste el fatal asesinato fue a las "+azul+ hora[horaAleatoria]+sinColor+" horas. Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida *desaparece*");
            }
            horas=hora[horaAleatoria];
            if (aciertos >= 8) {
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");
            comodines = comodines + 1;
            }
            if(aciertos>=7){
            System.out.println("Se tambalea el suelo, parece que se está abriendo otra brecha espacio-temporal.\nPulsa cualquier tecla para continuar.");
            tecla=scan.next().charAt(0);
            PartidaMedia00(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            }
            if(aciertos<7){
                Perder.PerderMedia(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertosTotales, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

            }
            
    }
    public static void PartidaDificil90(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos = 0;
        String [] hora = {"19:24","23:13","15:56","05:10","3:45","21:36","00:30","02:43","08:26","10:15"};
        int horaAleatoria = (int) (Math.random() * datosPosibles);
        String[] dificil90 = {"1. ¿Quién fue el presidente de Estados Unidos durante la mayor parte de la década de 1990?", "2. ¿Qué tratado internacional, firmado en 1992, tiene como objetivo principal reducir las emisiones de gases de efecto invernadero?", "3. ¿Quién fue el líder sudafricano que se convirtió en presidente en 1994, poniendo fin al apartheid?", "4. ¿Qué evento deportivo de verano tuvo lugar en Barcelona, destacando la participación del equipo de baloncesto 'Dream Team' de Estados Unidos?", "5. ¿Qué líder israelí fue asesinado en 1995 por un extremista de derecha?", "6. ¿Cuál fue el nombre del primer ministro británico que implementó políticas de 'tercera vía' y lideró al Partido Laborista en la década de 1990?", "7. ¿Qué líder ruso sucedió a Mijaíl Gorbachov como presidente de la Federación Rusa en 1991?", "8. ¿Cuál fue el nombre del primer presidente de la Federación Rusa, que fue elegido en 1991?", "9. ¿Qué acuerdo de paz, firmado en 1998, buscaba resolver el conflicto en Irlanda del Norte?", "10. ¿Quién fue el líder palestino que firmó los Acuerdos de Oslo con Israel en 1993?"};
        String[] respuestasdificil90A = {"Richard Nixon", "Protocolo de Montreal", "Desmond Tutu", "Juegos Paralímpicos de Verano", "Shimon Peres", "Gordon Brown", "Vladímir Putin", "Mijaíl Gorbachov", "Acuerdo de Buenos Aires", "Halil Halel"};
        String[] respuestasdificil90B = {"George H. W. Bush", "Acuerdo de Schengen", "F.W. de Klerk", "Copa Mundial de la FIFA", "Menachem Begin", "John Major", "Vladímir Putin", "Vladímir Putin", "Acuerdo de Belfast", "Mahmoud Abbas"};
        String[] respuestasdificil90C = {"Barack Obama", "Tratado de No Proliferación Nuclear", "Thabo Mbeki", "Juegos Olímpicos de Invierno", "Golda Meir", "Gordon Brown", "Dmitri Medvédev", "Mijaíl Gorbachov", "Acuerdo de Sunningdale", "Yitzhak Rabin"};
        String[] respuestasCorrectasdificil90 = {"Bill Clinton", "Protocolo de Kioto", "Nelson Mandela", "Juegos Olímpicos de Verano", "Yitzhak Rabin", "Tony Blair", "Boris Yeltsin", "Boris Yeltsin", "Acuerdo de Viernes Santo", "Yasser Arafat"};
        System.out.println(amarillo+"Pablo: "+sinColor+"Este ambiente si que me va sonando más, estoy en los 90, ¿verdad?");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Bienvenido, viajero. No te haré perder el tiempo porque veo que ya sabes como funciona el juego. Si consigues superarme, te dare la "+morado+"la hora "+sinColor+"del asesinato. Suerte.");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < dificil90.length; i++) {
            List<String> respuestas90dificilList = Arrays.asList(
                    respuestasdificil90A[i],
                    respuestasdificil90B[i],
                    respuestasdificil90C[i],
                    respuestasCorrectasdificil90[i]
                );
            List<String> respuestas90dificilComodinList = new ArrayList<>(respuestas90dificilList);
            Collections.shuffle(respuestas90dificilList); /*Baraja las posibles respuestas */
            Collections.shuffle(respuestas90dificilComodinList);
            if(comodines>0){
                System.out.println("Tienes " + comodines + " comodines");
            }
            System.out.println(dificil90[i]);
            for (int j = 0; j < respuestas90dificilList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                System.out.println(letraOpcion[j] + " " + respuestas90dificilList.get(j));
            }

            int indiceRespuestaIncorrectaEliminada = -1;

            if (comodines >= 1) {
                System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
                respuesta = scan.next().charAt(0);

                if (respuesta == '$') {
                    comodinesUsados++;
                    System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                    System.out.println(dificil90[i]);
                    for (int j = 0; j < respuestas90dificilList.size(); j++) {
                        char[] letraOpcion = {'a', 'b', 'c', 'd'};
                        System.out.println(letraOpcion[j] + " " + respuestas90dificilComodinList.get(j));
                    }

                        // Elimina una respuesta incorrecta al azar
                        Random random = new Random();
                        indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas90dificilComodinList.size());
                        respuestas90dificilList = eliminarRespuestaIncorrecta(respuestas90dificilList, respuestas90dificilComodinList.get(indiceRespuestaIncorrectaEliminada));

                        comodines = comodines - 1;
                }
            }

            if(respuesta=='$'){
                System.out.println(dificil90[i]);
                for (int j = 0; j < respuestas90dificilList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    if (j == indiceRespuestaIncorrectaEliminada) {
                        System.out.println(letraOpcion[j] + " " + respuestas90dificilList.get(j));
                    } else {
                            System.out.println(letraOpcion[j] + " " + respuestas90dificilList.get(j));
                    }
                }
            }    

                // Pide al usuario que vuelva a ingresar su respuesta
            System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
            respuesta = scan.next().toUpperCase().charAt(0);

                // Compara la respuesta del usuario con la respuesta correcta
            if (respuesta == (char) ('A' + respuestas90dificilList.indexOf(respuestasCorrectasdificil90[i]))) {
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
                } else {
                    fallos++;
                    int aleatorioFrases= (int) (Math.random() * numFrases);
                    System.out.println(frasesIncorrectas[aleatorioFrases]);
                }
            }
            aciertos = 10;
            if(aciertos>=8){
                    System.out.println("Sabio del tiempo: "+rojo+"*palmadas irónicas*"+sinColor+". Si llego a saberlo, te lo habría puesto mucho más difícil, pero aun así te daré la información que venías buscando y un "+morado +"comodín"+sinColor+". La hora a la que cometiste el fatal asesinato fue a las "+azul+ hora[horaAleatoria]+sinColor+" horas. Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida *desaparece*");
            }
            horas=hora[horaAleatoria];
            if (aciertos >= 9) {
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");
            comodines = comodines + 1;
            }
            if(aciertos>=8){
            System.out.println("Se tambalea el suelo, parece que se está abriendo otra brecha espacio-temporal.\nPulsa cualquier tecla para continuar.");
            tecla=scan.next().charAt(0);
            PartidaDificil00(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            }
            if(aciertos<=7){
                Perder.PerderDificil(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

            }

    }
    public static void PartidaMedia00(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos=0;
        String [] motivos = {"se acabo el Ballantines","alguien dijo que sabia mas de rap que tu","te llamaron calvo","dijo que Torrejon era mejor ciudad que Alcala","que han subido las copas 1 euro","alguien te dijo que Como Conoci a Vuestra Madre es mejor que Friends"
        ,"tus gatos habian vuelto a hacer sus necesidades en tu cama","porque el Luismi ha cerrado por vacaciones 15 dias y tuviste que ir a por tabaco a la Calle Mayor","el repartidor de Glovo se retraso 10 minutos","alguien dijo que Zatu era el mejor rapero de la historia de España"};
        // Década del 2000
        String[] media2000 = {
            "1. ¿Qué país fue el anfitrión de los Juegos Olímpicos de Verano en 2008?",
            "2. ¿Cuál fue el nombre del primer presidente afroamericano de Estados Unidos, elegido en 2008?",
            "3. ¿Qué enfermedad causada por un nuevo tipo de coronavirus se identificó por primera vez en 2002?",
            "4. ¿Cuál fue el primer país en adoptar el euro como moneda en el año 2002?",
            "5. ¿Qué popular red social fue lanzada en 2004 por Mark Zuckerberg?",
            "6. ¿Quién fue el famoso director de cine que lanzó la trilogía de 'El Señor de los Anillos' en la década del 2000?",
            "7. ¿Qué evento deportivo tuvo lugar en Sudáfrica en 2010, siendo la primera vez que se celebró en el continente africano?",
            "8. ¿Cuál fue el nombre del huracán devastador que golpeó la costa del Golfo de Estados Unidos en 2005?",
            "9. ¿Qué artista pop lanzó el álbum 'Blackout' en 2007?",
            "10. ¿Cuál fue el nombre del primer iPhone lanzado por Apple en 2007?"
        };
        String[] respuestasmedia2000A = {"Australia","George W. Bush","Zika","Italia","Twitter","Christopher Nolan","Juegos Olímpicos de la juventud","Huracán Rita","Justin Timberlake","iPhone 2G"};
        String[] respuestasmedia2000B = {"Estados Unidos","Bill Clinton","H1N1","España","Youtube","Steven Spielberg","Juegos Olímpicos de Invierno","Huracán Sandy","Lady Gaga","iPhone 3G"};
        String[] respuestasmedia2000C = {"Brasil","Donald Trump","Ébola","Francia","Instagram","Quentin Tarantino","Copa Mundial de Rugby","Huracán Ike","Kanye West","iPhone 4"};
        String[] respuestasCorrectasmedia2000 = {"China","Barack Obama","SARS","Alemania","Facebook","Peter Jackson","Copa Mundial de la FIFA","Huracán Katrina","Britney Spears","iPhone 1"};
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"¡Bienvenido, joven! Hacía mucho tiempo que nadie llegaba hasta aquí");
        System.out.println(amarillo+"Pablo: "+sinColor+"Gr-gracias, espero que no sea en vano, la verdad.");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Estoy seguro de que no. Creo en que todos nos merecemos una segunda oportunidad, y tras superar estos desafios estoy seguro de que podrás reconducir tu vida. Si consigues superar la década de los 2000, te diré el "+morado+"motivo "+sinColor+"del asesinato. Suerte.");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < media2000.length; i++) {
            List<String> respuestas2000mediaList = Arrays.asList(
                    respuestasmedia2000A[i],
                    respuestasmedia2000B[i],
                    respuestasmedia2000C[i],
                    respuestasCorrectasmedia2000[i]
                );
            List<String> respuestas00mediaComodinList = new ArrayList<>(respuestas2000mediaList);
            Collections.shuffle(respuestas2000mediaList); /*Baraja las posibles respuestas */
            Collections.shuffle(respuestas00mediaComodinList);
            if(comodines>0){
                System.out.println("Tienes " + comodines + " comodines");
            }
            System.out.println(media2000[i]);
            for (int j = 0; j < respuestas2000mediaList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                System.out.println(letraOpcion[j] + " " + respuestas2000mediaList.get(j));
            }

            int indiceRespuestaIncorrectaEliminada = -1;

            if (comodines >= 1) {
                System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
                respuesta = scan.next().charAt(0);

                if (respuesta == '$') {
                    comodinesUsados++;
                    System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                    System.out.println(media2000[i]);
                    for (int j = 0; j < respuestas2000mediaList.size(); j++) {
                        char[] letraOpcion = {'a', 'b', 'c', 'd'};
                        System.out.println(letraOpcion[j] + " " + respuestas00mediaComodinList.get(j));
                    }

                        // Elimina una respuesta incorrecta al azar
                        Random random = new Random();
                        indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas00mediaComodinList.size());
                        respuestas2000mediaList = eliminarRespuestaIncorrecta(respuestas2000mediaList, respuestas00mediaComodinList.get(indiceRespuestaIncorrectaEliminada));

                        comodines = comodines - 1;
                }
            }

            if(respuesta=='$'){
                System.out.println(media2000[i]);
                for (int j = 0; j < respuestas2000mediaList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    if (j == indiceRespuestaIncorrectaEliminada) {
                        System.out.println(letraOpcion[j] + " " +  respuestas2000mediaList.get(j));
                    } else {
                            System.out.println(letraOpcion[j] + " " + respuestas2000mediaList.get(j));
                    }
                }
            }    

                // Pide al usuario que vuelva a ingresar su respuesta
            System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
            respuesta = scan.next().toUpperCase().charAt(0);

                // Compara la respuesta del usuario con la respuesta correcta
            if (respuesta == (char) ('A' + respuestas2000mediaList.indexOf(respuestasCorrectasmedia2000[i]))) {
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");

                } else {
                    fallos++;
                    int aleatorioFrases= (int) (Math.random() * numFrases);
                    System.out.println(frasesIncorrectas[aleatorioFrases]);
                }
            }
            aciertos = 10;
            if(aciertos>=7){
                
                    System.out.println("Sabio del tiempo: Estoy realmente sorprendido, jamás pensé que pudieras lograr llegar hasta aquí. Te daré la información que venías buscando y un "+morado +"comodín"+sinColor+". El motivo por el que estabas tan alterado aquel día y cometiste el asesinato fue porque "+azul+ motivos[datosPosibles]+sinColor+". Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida "+azul+"*desaparece*"+sinColor);
            }
            motivo=motivos[datosPosibles];
            if (aciertos >= 8){
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");
            comodines = comodines + 1;
            }
            if(aciertos>=7){
                System.out.println("Parece que la máquina del tiempo se está estropeando, no queda mucho tiempo para superar las pruebas antes de que sea demasiado tarde.\nPulsa cualquier tecla para continuar.");
                tecla=scan.next().charAt(0);
                PartidaMedia2010(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            }
            if(aciertos<7){
                Perder.PerderMedia(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertosTotales, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

            }    

    }
    public static void PartidaDificil00(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos=0;
        String [] motivos = {"se acabo el Ballantines","alguien dijo que sabia mas de rap que tu","te llamaron calvo","dijo que Torrejon era mejor ciudad que Alcala","que han subido las copas 1 euro","alguien te dijo que Como Conoci a Vuestra Madre es mejor que Friends"
        ,"tus gatos habian vuelto a hacer sus necesidades en tu cama","porque el Luismi ha cerrado por vacaciones 15 dias y tuviste que ir a por tabaco a la Calle Mayor","el repartidor de Glovo se retraso 10 minutos","alguien dijo que Zatu era el mejor rapero de la historia de España"};
        String[] dificil00 = {"1. ¿Quién fue el número 2 del draft de la NBA 2003?", "2. ¿Qué ataque terrorista ocurrió el 11 de septiembre de 2001?", "3. ¿Quién fue el primer ministro británico durante gran parte de la década de 2000?", "4. ¿Qué país se unió a la Unión Europea en 2004, expandiendo significativamente la membresía del bloque?", "5. ¿Qué líder cubano entregó el poder a su hermano en 2006 debido a problemas de salud?", "6. ¿Qué tratado internacional, firmado en 2005, tiene como objetivo prevenir la proliferación nuclear y promover el desarme?", "7. ¿Cuál fue el nombre del líder palestino que murió en 2004, siendo sucedido por Mahmud Abás?", "8. ¿Qué evento deportivo de verano tuvo lugar en China en 2008, marcando la primera vez que se celebró en ese país?", "9. ¿Qué país asiático sufrió un devastador tsunami en 2004, provocando una enorme tragedia humanitaria?", "10. ¿Cuál fue el nombre del primer presidente negro de Sudáfrica, elegido en 1999?"};
        String[] respuestasdificil00A = {"Carmelo Anthony", "Ataque al Empire State", "Margaret Thatcher", "Rumania", "Juan Cruz", "Tratado de Bombas Nucleares", "Yasser Halul", "Juegos Olímpicos de Chiangpeng", "Vietnam", "Mahatma Ghandi"};
        String[] respuestasdificil00B = {"Chris Bosh", "Ataque al Pentágono", "Gordon Brown", "Hungría", "Julio Salinas", "Tratado de Armas Nucleares de Irán", "Mahmud Abás", "Mundial de Baloncesto", "Indonesia", "Thabo Mbeki"};
        String[] respuestasdificil00C = {"Dwayne Wade", "Atentados de Madrid", "Jacques Chirac", "Eslovaquia", "Che Guevara", "Tratado de Prohibición Completa de Pruebas Nucleares", "Muamar el Gadafi", "Mundial de la FIFA", "India", "Jacob Zuma"};
        String[] respuestasCorrectasdificil00 = {"Darko Milicic", "Ataques al Worl Trade Center", "Tony Blair", "Polonia", "Fidel Castro", "Tratado de No Proliferación Nuclear", "Yasser Arafat", "Juegos Olímpicos de Pekín", "Tailandia", "Nelson Mandela"};
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"¡Bienvenido, joven! Hacía mucho tiempo que nadie llegaba hasta aquí");
        System.out.println(amarillo+"Pablo: "+sinColor+"Gr-gracias, espero que no sea en vano, la verdad.");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Estoy seguro de que no. Creo en que todos nos merecemos una segunda oportunidad, y tras superar estos desafios estoy seguro de que podrás reconducir tu vida. Si consigues superar la década de los 2000, te diré el "+morado+"motivo "+sinColor+"del asesinato. Suerte.");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < dificil00.length; i++) {
            List<String> respuestas00dificilList = Arrays.asList(
                    respuestasdificil00A[i],
                    respuestasdificil00B[i],
                    respuestasdificil00C[i],
                    respuestasCorrectasdificil00[i]
                );
            List<String> respuestas00dificilComodinlList = new ArrayList<>(respuestas00dificilList);
            Collections.shuffle(respuestas00dificilList); /*Baraja las posibles respuestas */
            Collections.shuffle(respuestas00dificilComodinlList);
            if(comodines>0){
                System.out.println("Tienes " + comodines + " comodines");
            }
            System.out.println(dificil00[i]);
            for (int j = 0; j < respuestas00dificilList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                System.out.println(letraOpcion[j] + " " + respuestas00dificilList.get(j));
            }

            int indiceRespuestaIncorrectaEliminada = -1;

            if (comodines >= 1) {
                System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
                respuesta = scan.next().charAt(0);

                if (respuesta == '$') {
                    comodinesUsados++;
                    System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                    System.out.println(dificil00[i]);
                    for (int j = 0; j < respuestas00dificilList.size(); j++) {
                        char[] letraOpcion = {'a', 'b', 'c', 'd'};
                        System.out.println(letraOpcion[j] + " " + respuestas00dificilComodinlList.get(j));
                    }

                        // Elimina una respuesta incorrecta al azar
                        Random random = new Random();
                        indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas00dificilComodinlList.size());
                        respuestas00dificilList = eliminarRespuestaIncorrecta(respuestas00dificilList, respuestas00dificilComodinlList.get(indiceRespuestaIncorrectaEliminada));

                        comodines = comodines - 1;
                }
            }

            if(respuesta=='$'){
                System.out.println(dificil00[i]);
                for (int j = 0; j < respuestas00dificilList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    if (j == indiceRespuestaIncorrectaEliminada) {
                        System.out.println(letraOpcion[j] + " " +  respuestas00dificilList.get(j));
                    } else {
                            System.out.println(letraOpcion[j] + " " + respuestas00dificilList.get(j));
                    }
                }
            }    

                // Pide al usuario que vuelva a ingresar su respuesta
            System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
            respuesta = scan.next().toUpperCase().charAt(0);

                // Compara la respuesta del usuario con la respuesta correcta
            if (respuesta == (char) ('A' + respuestas00dificilList.indexOf(respuestasCorrectasdificil00[i]))) {
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");

                } else {
                    fallos++;
                    int aleatorioFrases= (int) (Math.random() * numFrases);
                    System.out.println(frasesIncorrectas[aleatorioFrases]);
                }
            }
            aciertos = 10;
            if(aciertos>=8){
                
                    System.out.println("Sabio del tiempo: Estoy realmente sorprendido, jamás pensé que pudieras lograr llegar hasta aquí. Te daré la información que venías buscando y un "+morado +"comodín"+sinColor+". El motivo por el que estabas tan alterado aquel día y cometiste el asesinato fue porque "+azul+ motivos[datosPosibles]+sinColor+". Espero que sepas usar la información en tu favor y no vuelvas a cometer el mismo error. Suerte en la vida "+azul+"*desaparece*"+sinColor);
            }
            motivo=motivos[datosPosibles];
            if (aciertos >= 9){
            System.out.println("¡Has obtenido un "+morado+"comodin"+sinColor+" extra!");
            comodines = comodines + 1;
            }
            if(aciertos>=8){
                System.out.println("Parece que la máquina del tiempo se está estropeando, no queda mucho tiempo para superar las pruebas antes de que sea demasiado tarde.\nPulsa cualquier tecla para continuar.");
                tecla=scan.next().charAt(0);
                PartidaDificil2010(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            }
            if(aciertos<=7){
                Perder.PerderDificil(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
                jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

            }

    }
    public static void PartidaMedia2010(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos=0;
        String[] objetos= {"tus propias manos","una botella vacia de DYC","tu coche, atropellandole","un bidon de gasolina y un mechero, prendiendole fuego","una copa que le lanzaste a la cabeza","una llave inglesa"
        ,"apagandole cigarrillos por todo el cuerpo","el cuter del curro","las llaves de casa","un machete"};
        String[] media2010 = {
            "1. ¿En qué país se llevó a cabo la Copa Mundial de la FIFA en 2014?",
            "2. ¿Quién fue el fundador de SpaceX y Tesla Motors, conocido por sus avances en la tecnología espacial?",
            "3. ¿Qué movimiento social y político se originó en 2011, caracterizado por protestas y manifestaciones?",
            "4. ¿Cuál fue la enfermedad viral que se propagó a nivel mundial en 2014 y afectó a miles de personas?",
            "5. ¿Qué acuerdo internacional sobre cambio climático se alcanzó en París en 2015?",
            "6. ¿Quién fue el líder norcoreano conocido por sus programas nucleares y su reunión con Donald Trump en 2018?",
            "7. ¿Cuál fue la ciudad brasileña que albergó los Juegos Olímpicos de Verano en 2016?",
            "8. ¿Qué red social centrada en la imagen se lanzó en 2010 y se volvió extremadamente popular?",
            "9. ¿Cuál fue el nombre del famoso rover de la NASA que aterrizó en Marte en 2012?",
            "10. ¿Qué película ganó el premio a la Mejor Película en los Premios de la Academia en 2019?"
        };

        String[] respuestasmedia2010A = {"Argentina","Mark Zuckerberg","Black Lives Matter","MERS","Acuerdo de Kyoto","Vladimir Putin","Brasilia","Facebook","Perseverance","La La Land"};
        String[] respuestasmedia2010B = {"Alemania","Jeff Bezos","Occupy Wall Street","Zika","Tratado de No Proliferación Nuclear","Xi Jinping","Sao Paulo","Snapchat","Opportunity","Birdman"};
        String[] respuestasmedia2010C = {"Sudáfrica","Bill Gates","Tea Party","SARS","Protocolo de Montreal","Donald Trump","Belo Horizonte","Twitter","Spirit","The Shape of Water"};
        String[] respuestasCorrectasmedia2010 = {"Brasil","Elon Musk","Primavera Árabe","Ébola","Acuerdo de París","Kim Jong-un","Rio de Janeiro","Instagram","Curiosity","Parasite"};
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Vaya, parece que has llegado a tu última parada. Y no creas que lo sabes todo, aunque sea la década más reciente, tu grave adicción al alcohol durante estos últimos años ha hecho que mucha información esté deteriorada en tu cabeza.");
        System.out.println(amarillo+"Pablo: "+sinColor+"Vaya...realmente es algo que tengo que cambiar, por favor, dadme una segunda oportunidad y todo eso cambiará.");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Eso depende excluvisamente de ti. Si superas mi prueba, te daré la última pista que necesitas, el "+morado+"objeto "+sinColor+" que utilizaste en el asesinato. Suerte");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < media2010.length; i++) {
            List<String> respuestas2010mediaList = Arrays.asList(
                    respuestasmedia2010A[i],
                    respuestasmedia2010B[i],
                    respuestasmedia2010C[i],
                    respuestasCorrectasmedia2010[i]
                );
            List<String> respuestas2010mediaComodinList = new ArrayList<>(respuestas2010mediaList);
            Collections.shuffle(respuestas2010mediaList); /*Baraja las posibles respuestas */
            Collections.shuffle(respuestas2010mediaComodinList);
            if(comodines>0){
                System.out.println("Tienes " + comodines + " comodines");
            }
            System.out.println(media2010[i]);
            for (int j = 0; j < respuestas2010mediaList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                System.out.println(letraOpcion[j] + " " + respuestas2010mediaList.get(j));
            }

            int indiceRespuestaIncorrectaEliminada = -1;

            if (comodines >= 1) {
                System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
                respuesta = scan.next().charAt(0);

                if (respuesta == '$') {
                    comodinesUsados++;
                    System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                    System.out.println(media2010[i]);
                    for (int j = 0; j < respuestas2010mediaList.size(); j++) {
                        char[] letraOpcion = {'a', 'b', 'c', 'd'};
                        System.out.println(letraOpcion[j] + " " + respuestas2010mediaComodinList.get(j));
                    }

                        // Elimina una respuesta incorrecta al azar
                        Random random = new Random();
                        indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas2010mediaComodinList.size());
                        respuestas2010mediaList = eliminarRespuestaIncorrecta(respuestas2010mediaList, respuestas2010mediaComodinList.get(indiceRespuestaIncorrectaEliminada));

                        comodines = comodines - 1;
                }
            }

            if(respuesta=='$'){
                System.out.println(media2010[i]);
                for (int j = 0; j < respuestas2010mediaList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    if (j == indiceRespuestaIncorrectaEliminada) {
                        System.out.println(letraOpcion[j] + " " +respuestas2010mediaList.get(j));
                    } else {
                            System.out.println(letraOpcion[j] + " " + respuestas2010mediaList.get(j));
                    }
                }
            }    

                // Pide al usuario que vuelva a ingresar su respuesta
            System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
            respuesta = scan.next().toUpperCase().charAt(0);

                // Compara la respuesta del usuario con la respuesta correcta
            if (respuesta == (char) ('A' + respuestas2010mediaList.indexOf(respuestasCorrectasmedia2010[i]))) {
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
                } else {
                    fallos++;
                    int aleatorioFrases= (int) (Math.random() * numFrases);
                    System.out.println(frasesIncorrectas[aleatorioFrases]);
                }
            }
    
            objeto=objetos[datosPosibles];
            aciertos = 10;
            if(aciertos>=7){
                    
                    System.out.println("No puedo creer que lo hayas logrado, Pablo. No habría apostado ni un mísero euro a que conseguirías completar todos los retos. Te daré la información que venías buscando. El objeto con el que cometiste el asesinato fue con "+azul+ objetos[datosPosibles]+sinColor+". Ya tienes toda la información que necesitabas. Ahora busca al sabio de la decada actual y dale toda la información que has recogido. Espero que no nos tengamos que ver nunca más, ya que no damos terceras oportunidades. Suerte en la vida "+azul+"*desaparece*"+sinColor);
                    System.out.println("Sientes como el suelo empieza a quebrarse y todo se vuelve muy oscuro, y caes en una habitación vacía con la máquina que parece estar apunto de romperse.\nPulsa cualquier tecla para continuar.");
                    tecla=scan.next().charAt(0);
                    ResolucionFinal(lugar, dias, horas, motivo, objeto, scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            
                    
            if(aciertos<7){
                Perder.PerderMedia(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertosTotales, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            }
        }


    }
    public static void PartidaDificil2010(Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String lugar, String dias, String horas, String motivo, String objeto, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){
        aciertos=0;
        String[] objetos= {"tus propias manos","una botella vacia de DYC","tu coche, atropellandole","un bidon de gasolina y un mechero, prendiendole fuego","una copa que le lanzaste a la cabeza","una llave inglesa"
        ,"apagandole cigarrillos por todo el cuerpo","el cuter del curro","las llaves de casa","un machete"};
        String[] dificil10 = {"¿Quién fue el artista detrás del éxito 'Shape of You' en 2017?", "¿Cuál de las siguientes películas ganó el Oscar a la Mejor Película en 2010?", "¿Quién se convirtió en el primer presidente negro de Estados Unidos en 2009?", "¿Qué selección ganó la Copa del Mundo de la FIFA en 2014?", "¿Qué famoso telescopio espacial fue lanzado por la NASA en 1990 y estuvo en funcionamiento durante gran parte de la década de los 2010?", "¿Qué empresa lanzó el primer iPhone en 2007, que cambió el panorama de los teléfonos inteligentes durante la década de los 2010?", "¿Quién fue el primer rapero en ganar un premio Pulitzer en 2018?", "¿Qué película de superhéroes inició el Universo Cinematográfico de Marvel en 2008?", "¿Qué evento histórico desencadenó la Primavera Árabe en 2010?", "¿Quién ganó el premio FIFA Balón de Oro en 2015?"};
        String[] respuestasdificil10A = {"Taylor Swift", "The Hurt Locker", "Joe Biden", "España", "Kepler", "Samsung", "Kanye West", "Capitan America", "Asesinato de Osama bin Laden", "Luis Suarez"};
        String[] respuestasdificil10B = {"Justin Bieber", "Inception", "Donald Trump", "Brasil", "James Webb", "Google", "Jay-Z", "The Avengers", "Guerra en Siria", "Cristiano Ronaldo"};
        String[] respuestasdificil10C = {"Bruno Mars", "The Social Network", "Hillary Clinton", "Argentina", "Curiosity", "Sony", "Drake", "Thor", "Atentados en Paris", "Neymar"};
        String[] respuestasCorrectasdificil10 = {"Ed Sheeran", "The King's Speech", "Barack Obama", "Alemania", "Hubble", "Apple", "Kendrick Lamar", "Iron Man", "Inmolación de Mohamed Bouazizi", "Lionel Messi"};
        
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Vaya, parece que has llegado a tu última parada. Y no creas que lo sabes todo, aunque sea la década más reciente, tu grave adicción al alcohol durante estos últimos años ha hecho que mucha información esté deteriorada en tu cabeza.");
        System.out.println(amarillo+"Pablo: "+sinColor+"Vaya...realmente es algo que tengo que cambiar, por favor, dadme una segunda oportunidad y todo eso cambiará.");
        System.out.println(verde+"Sabio del Tiempo: "+sinColor+"Eso depende excluvisamente de ti. Si superas mi prueba, te daré la última pista que necesitas, el "+morado+"objeto "+sinColor+" que utilizaste en el asesinato. Suerte");
        System.out.println("Pulsa cualquier tecla para comenzar el reto");
        tecla=scan.next().charAt(0);
        for (int i = 0; i < dificil10.length; i++) {
            List<String> respuestas10dificilList = Arrays.asList(
                    respuestasdificil10A[i],
                    respuestasdificil10B[i],
                    respuestasdificil10C[i],
                    respuestasCorrectasdificil10[i]
                );
            List<String> respuestas10dificilComodinList = new ArrayList<>(respuestas10dificilList);
            Collections.shuffle(respuestas10dificilList); /*Baraja las posibles respuestas */
            Collections.shuffle(respuestas10dificilComodinList);
            if(comodines>0){
                System.out.println("Tienes " + comodines + " comodines");
            }
            System.out.println(dificil10[i]);
            for (int j = 0; j < respuestas10dificilList.size(); j++) {
                char[] letraOpcion = {'a', 'b', 'c', 'd'};
                System.out.println(letraOpcion[j] + " " + respuestas10dificilList.get(j));
            }

            int indiceRespuestaIncorrectaEliminada = -1;

            if (comodines >= 1) {
                System.out.println("Dispones de " + comodines + " comodin(es), ¿quieres utilizar uno? Pulsa $ para utilizarlo, cualquier otra tecla para no utilizarlo.");
                respuesta = scan.next().charAt(0);

                if (respuesta == '$') {
                    comodinesUsados++;
                    System.out.println("Has usado un comodín, ahora te quedan " + comodines + " comodines");
                    System.out.println(dificil10[i]);
                    for (int j = 0; j < respuestas10dificilList.size(); j++) {
                        char[] letraOpcion = {'a', 'b', 'c', 'd'};
                        System.out.println(letraOpcion[j] + " " + respuestas10dificilComodinList.get(j));
                    }

                        // Elimina una respuesta incorrecta al azar
                        Random random = new Random();
                        indiceRespuestaIncorrectaEliminada = random.nextInt(respuestas10dificilComodinList.size());
                        respuestas10dificilList = eliminarRespuestaIncorrecta(respuestas10dificilList, respuestas10dificilComodinList.get(indiceRespuestaIncorrectaEliminada));

                        comodines = comodines - 1;
                }
            }

            if(respuesta=='$'){
                System.out.println(dificil10[i]);
                for (int j = 0; j < respuestas10dificilList.size(); j++) {
                    char[] letraOpcion = {'a', 'b', 'c', 'd'};
                    if (j == indiceRespuestaIncorrectaEliminada) {
                        System.out.println(letraOpcion[j] + " " +respuestas10dificilList.get(j));
                    } else {
                            System.out.println(letraOpcion[j] + " " + respuestas10dificilList.get(j));
                    }
                }
            }    

                // Pide al usuario que vuelva a ingresar su respuesta
            System.out.println("Introduce la letra de la respuesta correcta (A/B/C/D).: ");
            respuesta = scan.next().toUpperCase().charAt(0);

                // Compara la respuesta del usuario con la respuesta correcta
            if (respuesta == (char) ('A' + respuestas10dificilList.indexOf(respuestasCorrectasdificil10[i]))) {
                aciertos++;
                aciertosTotales++;
                int aleatorioFrases= (int) (Math.random() * numFrases);
                System.out.println(frasesCorrectas[aleatorioFrases]+" Llevas "+aciertos+" aciertos.");
                } else {
                    fallos++;
                    int aleatorioFrases= (int) (Math.random() * numFrases);
                    System.out.println(frasesIncorrectas[aleatorioFrases]);
                }
            }
    
            objeto=objetos[datosPosibles];
            aciertos = 10;
            if(aciertos>=8){
                    
                    System.out.println("No puedo creer que lo hayas logrado, Pablo. No habría apostado ni un mísero euro a que conseguirías completar todos los retos. Te daré la información que venías buscando. El objeto con el que cometiste el asesinato fue con "+azul+ objetos[datosPosibles]+sinColor+". Ya tienes toda la información que necesitabas. Ahora busca al sabio de la decada actual y dale toda la información que has recogido. Espero que no nos tengamos que ver nunca más, ya que no damos terceras oportunidades. Suerte en la vida "+azul+"*desaparece*"+sinColor);
                    System.out.println("Sientes como el suelo empieza a quebrarse y todo se vuelve muy oscuro, y caes en una habitación vacía con la máquina que parece estar apunto de romperse.\nPulsa cualquier tecla para continuar.");
                    tecla=scan.next().charAt(0);
                    ResolucionFinal(lugar, dias, horas, motivo, objeto, scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            
            
                    
            if(aciertos<=7){
                Perder.PerderDificil(aciertosTotales, fallos, comodinesUsados, scan, jugador, rojo, sinColor, tecla);
                jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
                Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);
            }
        }




    }
    public static void ResolucionFinal(String lugar, String dias, String horas, String motivo, String objeto, Scanner scan, int aciertos, int fallos, int aleatorio, int datosPosibles, String rojo, String amarillo, String azul, String verde, String sinColor, String morado, char respuesta, int comodines, char tecla, int aciertosTotales, int comodinesUsados, String [] frasesCorrectas, int numFrases, String[] frasesIncorrectas, Jugador jugador){

            System.out.println(amarillo+"Pablo: "+sinColor+"Vale, creo que lo tengo, he reunido todos los datos que necesitaba, ahora solo tengo que introducirlos en la máquina para viajar atrás en el tiempo y revertir el asesinato...aunque...este cacharro tiene pinta de estar apunto de romperse, creo que solo tengo una oportunidad, allá voy.");
            System.out.println("Bien, si no recuerdo mal, el lugar donde sucedió todo fue... "+azul+"INTRODUCE EL LUGAR AL QUE DESEAS VIAJAR: "+sinColor);
            scan.nextLine();
            String intentoLugar=scan.nextLine().toLowerCase();//escaneo todas las variables que el jugador ya tiene y tiene que introducir exactamente igual se le van dando durante el juego

            System.out.println(verde+"Voz robótica: "+sinColor+"Lugar introducido: "+intentoLugar);

            System.out.println(amarillo+"Pablo: "+sinColor+"Vale, vale, creo que el lugar ya está, ahora toca el día, que si no recuerdo mal fue el..."+azul+"INTRODUCE EL DÍA AL QUE DESEAS VIAJAR: "+sinColor);
            String intentoDia=scan.nextLine().toLowerCase();

            System.out.println(verde+"Voz robótica: "+sinColor+"Día introducido: "+intentoDia);

            System.out.println(amarillo+"Pablo: "+sinColor+"Bueno, ¿parece que no va tan mal la cosa no? Ahora toca la hora, que me acuerdo que el Sabio del Tiempo me dijo que fue a las..."+azul+"INTRODUCE LA HORA A LA QUE DESEAS VIAJAR: "+sinColor);
            String intentoHora=scan.nextLine().toLowerCase();

            System.out.println(verde+"Voz robótica: "+sinColor+"Hora introducida: "+intentoHora);

            System.out.println(amarillo+"Pablo: "+sinColor+"Bien, ahora toca poner el motivo por el que cometí aquella cagada (aunque seguro que tenía la razón) "+azul+"INTRODUCE EL MOTIVO DE TU ERROR: "+sinColor);
            String intentoMotivo=scan.nextLine().toLowerCase();

            System.out.println(verde+"Voz robótica: "+sinColor+"Motivo introducida: "+intentoMotivo);

            System.out.println(amarillo+"Pablo: "+sinColor+"Vale, solo me queda el último dato por introducir, que es el objeto del 'asesinato', que fue..."+azul+"INTRODUCE EL OBJETO CON EL QUE COMETISTE EL ERROR: "+sinColor);
            String intentoObjeto=scan.nextLine().toLowerCase();

            System.out.println(verde+"Voz robótica: "+sinColor+"Objeto introducido: "+intentoObjeto);
            if(intentoLugar.equalsIgnoreCase(lugar)&&intentoDia.equalsIgnoreCase(dias)&&intentoHora.equalsIgnoreCase(horas)&&intentoMotivo.equalsIgnoreCase(motivo)&&intentoObjeto.equalsIgnoreCase(objeto)){//condicional para comprobar si se han introducido los datos correctamente y si se introducen correctamente se gana el juego.
                System.out.println(verde+"Voz robótica: "+sinColor+"VIAJANDO AL LUGAR "+azul+lugar+sinColor+", AL DÍA "+azul+dias+sinColor+", A LAS "+azul+horas+sinColor+" HORAS, EN EL QUE SE COMETIÓ UN ASESINATO PORQUE "+azul+motivo+sinColor+", CON EL OBJETO "+azul+objeto+sinColor);
                System.out.println("JUEGO COMPLETADO, ENHORABUENA, HAS GANADO.");
                
            }else{
                
                System.out.println("Has fallado al introducir los datos, has perdido");
            }

        System.out.println("PULSA CUALQUIER TECLA PARA VOLVER AL MENU");//vuelve al menu gane o pierda el juego, donde se podran ver las estadisticas de la partida si se pulsa el boton correspondiente a las estadisticas
        tecla=scan.next().charAt(0);
        jugador.guardarResultados(aciertos, fallos, comodinesUsados, jugador);
        Menu(scan, aciertos, fallos, aleatorio, datosPosibles, rojo, amarillo, azul, verde, sinColor, morado, respuesta, comodines, tecla, aciertosTotales, comodinesUsados, lugar, dias, horas, motivo, objeto, frasesCorrectas, numFrases, frasesIncorrectas, jugador);

    }
}
