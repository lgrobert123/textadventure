package textadventure;
import java.util.Scanner;


public class game {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);  
		
		boolean widerholung = false;
		
		
		
		System.out.println("M�chtest du Das Spiel Starten Ja/Nein");

		while(widerholung == false){
			
		String answer = sc.nextLine();
		
		
			if (answer .equalsIgnoreCase("Ja")) {
				System.out.println("SpielStart"); 
				widerholung = true;
	    
	  
			}if (answer .equalsIgnoreCase("Nein")) {
				System.out.println("Dann Schlie�t sich das spiel"); 
				System.exit(0);
			 
			} else if (answer .equalsIgnoreCase("Ja")){
				System.out.println("Die Antwort wir Verweigert");
				System.out.println("M�chtest du Das Spiel Starten Ja/Nein");
					}
				}
			}
	/*
		System.out.print("Setze dein Characternamen :"); 
		String name = sc.nextLine().replaceAll(" ","");
		System.out.println(name);
*/		}
	

