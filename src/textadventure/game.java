package textadventure;
import java.util.Scanner;


public class game {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);  
		
		boolean widerholung = false;
		
		System.out.println("Möchtest du Das Spiel Starten Ja/Nein");
		
		String answer = sc.nextLine();
		
		while(widerholung == false){
			
			
		}
		if (answer .equalsIgnoreCase("Ja")) {
	    	System.out.println("SpielStart"); 
	    	widerholung = true;
	    
	  
		}if (answer .equalsIgnoreCase("Nein")) {
			System.out.println("Dann Schließt sich das spiel"); 
			System.exit(0);
			
		}else {
			System.out.println("Die Antwort wir Verweigert");
			while(widerholung == false);
		}
	}
	/*
		System.out.print("Setze dein Characternamen :"); 
		String name = sc.nextLine().replaceAll(" ","");
		System.out.println(name);
*/	}
	

