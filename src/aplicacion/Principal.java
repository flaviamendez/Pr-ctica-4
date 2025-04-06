/**
 * Clase principal que permite al usuario calcular la distancia de Levenshtein
 * entre dos palabras ingresadas.
 * 
 * El programa solicita al usuario que introduzca dos palabras, las convierte
 * a minúsculas para evitar errores por diferencias en mayúsculas/minúsculas, y
 * luego calcula y muestra la distancia de Levenshtein entre ellas.</p>
 * 
 * @author Flavia Mendez Tsutsumi
 * @version 1.0
 */
package aplicacion;

import dominio.CalculadoraDeDistancias;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir palabras al usuario
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();

        // Calcular la distancia con .toLowerCase() para evitar errores por mayúsculas
        int distancia = CalculadoraDeDistancias.calcularDistancia(
            palabra1.toLowerCase(),
            palabra2.toLowerCase()
        );

        System.out.println("La distancia de Levenshtein entre \"" + palabra1 + "\" y \"" + palabra2 + "\" es: " + distancia);
        
        sc.close();
    }
}
