package textadventure;
import java.util.Scanner;


public class game {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);  
		
		
		System.out.println("Möchtest du Das Spiel Starten Ja/Nein");
		
	    if (sc.nextLine() .equalsIgnoreCase("Ja")) {
	    	System.out.println("SpielStart"); 
	    
	  
		}if (sc.nextLine() .equalsIgnoreCase("Nein")) {
			System.out.println("Dann Schließt sich das spiel"); 
			System.exit(0);
	
		
	    	
	/*
		System.out.print("Setze dein Characternamen :"); 
		String name = sc.nextLine().replaceAll(" ","");
		System.out.println(name);
*/	}
	}
}

