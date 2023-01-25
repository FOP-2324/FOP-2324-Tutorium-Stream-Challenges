package tutorium;

import java.util.List;

/**
 * The third Stream challenge of the tutorium.
 * This will test {@link java.util.stream.Stream#reduce(java.util.function.BinaryOperator)}.
 *
 * @author Ruben Deisenroth
 */
public class Challenge03 {

    /**
     * Executes the challenge.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> list = List.of("Uga", "Buga", "Suga", "Nope");

        // Reduziere die Liste zu dem String: "NopeSugaBugaUga"
        // Nutze dazu Stream.reduce()
        // Hinweis: Die Methode reduce() von Stream hat zwei Parameter
        String result = null;
        // <USER CODE>

        // </USER CODE>
        System.out.println(result);
    }

}
