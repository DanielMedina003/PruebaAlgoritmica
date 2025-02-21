import java.util.Scanner;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        //creamos un mensaje para pedir el tamano de la lista
        //
        System.out.println("Ingre el tamano de la lista");
        int n = scanner.nextInt();
        
        //leemos los numero de la lista de forma ordenanda
        //usando el TreeSet, que nos sirve  para almacenar elementos de forma ordenada 

        TreeSet<Integer> set = new TreeSet<>();// usamos TreeSet que nos sirve si se llega 
        //a meter datos de forma desordenada a la lista, los organizara para no afectar el proceso requirido
        System.out.print("Ingrese los números ordenados separados por espacios: ");
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt()); // Se usa TreeSet para eliminar duplicados automáticamente
        }

    }
}
