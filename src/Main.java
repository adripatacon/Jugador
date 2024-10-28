import javax.swing.*;
import java.io.BufferedReader; // Solo me permite con cadenas de caracteres
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws IOException {

        // Instanciar un objeto de la clase Jugador.
        Jugador Ronaldo = new Jugador("Ronaldo", 22);

        // Instanciar un objeto para leer cadenas de caracteres
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Instanciar un objeto para leer cualquier tipo de dato.
        Scanner sc = new Scanner(System.in);

        // Leer cadenas de caracteres.
        String jugador1; // Creamos una variable para leer.
        System.out.println("Nombre: ");
        jugador1 = br.readLine(); // Leemos la entrada como cadena.
        System.out.println("");
        Ronaldo.setNombre(jugador1); // Le asignamos la variable leída con el setter.


        // Cambiar una cadena de caracteres a un integer.
        System.out.println("Edad: ");
        String jugador2 = br.readLine(); // Leemos la entrada como cadena.
        int edad = Integer.parseInt(jugador2); // Convertimos la cadena a un entero.
        Ronaldo.setEdad(edad); // Asignamos la edad usando el setter.


    }
}
