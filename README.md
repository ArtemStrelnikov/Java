import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> raubtiere = new ArrayList<>();
        raubtiere.add("Lowe");
        raubtiere.add("Tiger");

        ArrayList<String> pflanzenfresser = new ArrayList<>();
        pflanzenfresser.add("Hase");
        pflanzenfresser.add("Elefant");

        ArrayList<String> ergebnis = new ArrayList<>();
        
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Daten ein, die dem dritten Array hinzugefugt werden sollen: ");
        String eingabe = scanner.nextLine();

        if (eingabe.equalsIgnoreCase("Raubtiere")) {
            ergebnis.addAll(raubtiere);
        } else if (eingabe.equalsIgnoreCase("Pflanzenfresser")) {
            ergebnis.addAll(pflanzenfresser);
        } else if (eingabe.equalsIgnoreCase("Beide")) {
            ergebnis.addAll(raubtiere);
            ergebnis.addAll(pflanzenfresser);
        } else {
            System.out.println("Ungultige Eingabe. Bitte versuchen Sie es erneut.");
            return;
        }

           System.out.println("Drittes Array: " + ergebnis);
        
    }
}

