package dominio;

public class CalculadoraDeDistancias {

    /**
     * Calcula la distancia de edición (distancia de Levenshtein) entre dos cadenas de texto.
     * La distancia de edición es el número mínimo de operaciones necesarias para transformar
     * una cadena en otra, donde las operaciones permitidas son inserción, eliminación y sustitución
     * de un carácter.
     *
     * @param s1 La primera cadena de texto.
     * @param s2 La segunda cadena de texto.
     * @return La distancia de edición entre las dos cadenas.
     */
    public static int calcularDistancia(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] matriz = new int[m + 1][n + 1];

        // Inicialización de la primera columna
        for (int i = 0; i <= m; i++) {
            matriz[i][0] = i;
        }

        // Inicialización de la primera fila
        for (int j = 0; j <= n; j++) {
            matriz[0][j] = j;
        }

        // Llenado de la matriz
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int costo = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;

                matriz[i][j] = Math.min(
                    Math.min(matriz[i - 1][j] + 1,      
                             matriz[i][j - 1] + 1),      
                    matriz[i - 1][j - 1] + costo         
                );
            }
        }

        return matriz[m][n];
    }
}
