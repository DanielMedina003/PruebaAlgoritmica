import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        // Leer tamaño de la lista
        System.out.print("Ingrese el tamaño de la lista: ");
        int n = scanner.nextInt();
        // Leer lista ordenada de números (permitiendo duplicados)
        List<Integer> lista = new ArrayList<>();
        System.out.print("Ingrese los números ordenados separados por espacios: ");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }
        // Ordenar la lista para asegurarnos de que esté en orden
        Collections.sort(lista);
        // Imprimimos la lista de forma ordenada y con numero repetidos si es el caso 
        System.out.println("Lista almacenada: " + lista);
        // Ingresamos el numero de consultas a validad
        System.out.print("Ingrese el número de consultas: ");
        int q = scanner.nextInt();
        // Leer los números a evaluar
        System.out.print("Ingrese los números a evaluar separados por espacios: ");
        for (int i = 0; i < q; i++) {
            int num = scanner.nextInt();
            Integer lower = null, higher = null;

            // Buscar el número menor más alto y el mayor más bajo
            //se utiliza la j ya que estamos dentro de un for ya con la variable i utilizada
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j) < num) {
                    lower = lista.get(j);
                } else if (lista.get(j) > num) {
                    higher = lista.get(j);
                    break; // No necesitamos seguir buscando
                }
            }
            // Imprimir resultado
            // el '? ' lo utlizamos como un if-else que se llama operacion ternaria
            System.out.println("Para el número " + num + ": " + (lower == null ? "X" : lower) + " " + (higher == null ? "X" : higher));
        }
        scanner.close();
    }
}
