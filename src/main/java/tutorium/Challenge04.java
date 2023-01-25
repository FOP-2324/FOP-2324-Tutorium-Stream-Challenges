package tutorium;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * The fourth Stream challenge of the tutorium.
 * This will test {@link Stream#flatMap(Function)}
 *
 * @author Ruben Deisenroth
 */
public class Challenge04 {

    /**
     * Executes the challenge.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = List.of("Hallo Welt", "Heute ist ein schöner Tag", "Ich bin ein String");

        // Finde alle Einzelwörter in der Liste und gib sie in einer Liste aus
        // Nutze dazu Stream.flatMap()
        // Hinweis: Methode split() von String um einen String in Wörter zu zerlegen
        List<String> result = null;
        // <USER CODE>

        // </USER CODE>
        System.out.println(result);
    }

}
