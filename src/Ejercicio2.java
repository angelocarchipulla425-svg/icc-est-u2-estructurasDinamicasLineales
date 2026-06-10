import java.util.Stack;

public class Ejercicio2 {

    public boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        
        // Limpiamos el texto de espacios y lo ponemos en minúsculas
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
        
        // 1. Crear una pila de caracteres.
        Stack<Character> pila = new Stack<>();
        
        // 2. Recorrer el texto carácter por carácter.
        // 3. Insertar cada carácter en la pila.
        for (int i = 0; i < textoLimpio.length(); i++) {
            pila.push(textoLimpio.charAt(i));
        }
        
        // 4. Sacar los caracteres de la pila para formar el texto invertido.
        StringBuilder textoInvertido = new StringBuilder();
        while (!pila.isEmpty()) {
            textoInvertido.append(pila.pop());
        }
        
        // 5. Comparar el texto original con el texto invertido.
        // 6 y 7. Retornar true si son iguales, false si son diferentes.
        return textoLimpio.equals(textoInvertido.toString());
    }
}