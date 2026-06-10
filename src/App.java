import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        System.out.println("=== PRACTICA: ESTRUCTURAS DINAMICAS LINEALES ===");
        //icc-est-u2-estructurasDinamicasLineales
        // Pruebas de las estructuras base
        runLinkList();
        runQueue();
        runStack();
        
        System.out.println("\n=== PRUEBAS DE LOS EJERCICIOS ===");
        
        // Ejercicio 1
        Ejercicio1 ej1 = new Ejercicio1();
        System.out.println("Invertir 'COMPUTACION': " + ej1.invertString("COMPUTACION"));
        
        // Ejercicio 2
        Ejercicio2 ej2 = new Ejercicio2();
        System.out.println("Es 'radar' palíndromo? " + ej2.esPalindromo("radar"));
        System.out.println("Es 'computacion' palíndromo? " + ej2.esPalindromo("computacion"));
    }

    private static void runLinkList() {
        System.out.println("\n--- 1. LinkedList ---");
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");
        
        System.out.println("Primer elemento: " + nombres.getFirst());
        System.out.println("Elemento en el índice 4: " + nombres.get(4));
    }

    private static void runQueue() {
        System.out.println("\n--- 2. Queue (ArrayDeque como Cola) ---");
        Queue<String> cola = new ArrayDeque<>();
        
        // Inserción (Enqueue)
        cola.offer("Cliente 1");
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");
        
        // Consulta el primero
        System.out.println("Siguiente en ser atendido (peek): " + cola.peek());
        
        // Eliminación (Dequeue)
        System.out.println("Atendiendo a: " + cola.poll());
        System.out.println("Atendiendo a: " + cola.poll());
    }

    private static void runStack() {
        System.out.println("\n--- 3. ArrayDeque como Pila ---");
        ArrayDeque<String> pila = new ArrayDeque<>();
        
        // Inserción (Push)
        pila.push("Libro A");
        pila.push("Libro B");
        pila.push("Libro C");
        
        // Consulta el tope (Peek)
        System.out.println("Elemento en el tope de la pila (peek): " + pila.peek());
        
        // Eliminación (Pop)
        System.out.println("Sacando elemento: " + pila.pop());
        System.out.println("Sacando elemento: " + pila.pop());
    }
}