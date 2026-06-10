import java.util.Stack;

public class Ejercicio1 {
    
    public String invertString(String texto) {
        if (texto == null) {
            return null;
        }
        
        // Crear la pila de caracteres
        Stack<Character> pila = new Stack<>();
        
        // 1. Almacenar cada carácter dentro de la pila
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        
        // 2. Extraer los caracteres de la pila para formar el texto invertido
        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }
        
        return resultado.toString();
    }
}