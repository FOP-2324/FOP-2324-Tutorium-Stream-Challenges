package tutorium;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * The sixths Stream challenge of the tutorium.
 * This will test {@link java.util.stream.Stream#iterate(Object, UnaryOperator)}, {@link java.util.stream.Stream#takeWhile(Predicate)} and {@link Stream#count()} .
 *
 * @author Ruben Deisenroth
 */
public class Challenge06 {

    /**
     * Executes the challenge.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Wir wollen das siebener einmaleins bis 1000 überprüfen, und die Anzahl der Zahlen ausgeben,
        // die kleiner als 1000 sind und durch 3 teilbar sind.
        //
        // Wir starten also mit 7 und addieren jeden Schritt 7 dazu. (nutze hierfür Stream.iterate())
        // Wir wollen aber nur die Zahlen, die kleiner als 1000
        // Nutze dazu Stream.takeWhile() um den Stream zu begrenzen
        // Außerdem wollen wir nur die Zahlen, die durch 3 teilbar sind
        // Nutze dazu Stream.filter() um die Zahlen zu filtern
        // Wir wollen am Ende die Anzahl der Zahlen ausgeben
        // Nutze dazu Stream.count()
        // Hinweis: Am Besten erstmal mit Kleinen Werten testen, um zu sehen ob es funktioniert
        long result = -1;
        // <USER CODE>

        // </USER CODE>
        System.out.println(result);
    }

}
