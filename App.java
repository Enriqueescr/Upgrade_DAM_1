import java.util.*;

public class App {

    // Media (int[])
    public static double calcular(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }

    // Moda (double[]) - Sin usar Map
    public static double calcular(double[] numeros) {
        double moda = numeros[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < numeros.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = numeros[i];
            }
        }
        return moda;
    }

    // Mediana (String[])
    public static String calcular(String[] cadenas) {
        Arrays.sort(cadenas); // Orden alfabético
        int n = cadenas.length;
        return cadenas[n / 2]; // Mediana
    }

    public static void main(String[] args) {
        // Ejemplo 1: Media
        int[] numerosEnteros = {10, 20, 30, 40};
        System.out.println("Media: " + calcular(numerosEnteros));

        // Ejemplo 2: Moda
        double[] numerosDecimales = {1.5, 2.3, 1.5, 4.5, 2.3, 2.3};
        System.out.println("Moda: " + calcular(numerosDecimales));

        // Ejemplo 3: Mediana
        String[] cadenas = {"manzana", "naranja", "pera", "kiwi", "fresa"};
        System.out.println("Mediana: " + calcular(cadenas));
    }
}
