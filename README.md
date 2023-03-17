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

        ArrayList<String> tiket = new ArrayList<>();

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie heisst Du denn?");
        String heroName = sc.nextLine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen in unserem Zoo " + heroName + " !" + " Welche Tiere mochtest du sehen? Raubtiere oder Pflanzenfresser? Wahle R fur Raubtiere odere P fur Pflanzenfresser ");
        String eingabe = scanner.nextLine();

        String befehl;

        while ((befehl = sc.nextLine()) != null) {
            switch (befehl.toUpperCase()) {
                case "R":
                    System.out.println("Sie werden einen Lowen und einen Tiger sehen");
                    tiket.addAll(raubtiere);
                    break;

                case "P":
                    System.out.println("Sie werden einen Hasen und einen Elefanten sehen");
                    tiket.addAll(pflanzenfresser);
                    break;

                default:
                    System.out.println("Ich habe das nicht verstanden");
            }
            System.out.println("Deine Auswahl: " + tiket.toString());
        }
	        
	        
	             
	        
	   
	}

}
