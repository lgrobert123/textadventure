package textadventure;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		boolean widerholung = false;
		boolean charnameset = false;

		String Helper = "Pipi: ";

		System.out.println("Möchtest du Das Spiel Starten Ja/Nein");

		while (widerholung == false) {

			String answer = sc.nextLine();

			if (answer.equalsIgnoreCase("Ja")) {
				System.out.println("SpielStart"); // Spiel wird Gestartet
				widerholung = true;

			}
			if (answer.equalsIgnoreCase("Nein")) {
				System.out.println("Dann Schließt sich das spiel");
				System.exit(0); // Spiel wird Bendet

			}
			if (!answer.equalsIgnoreCase("Ja")) { // Kein richtige antwort = while
				System.out.println("Die Antwort wir Verweigert");
				System.out.println("Möchtest du Das Spiel Starten Ja/Nein");

			}
		}

		while (charnameset == false) { // Charactername wir gesetzt

			System.out.println("Sätze deinen Characternamen");
			String Charname = sc.nextLine().replaceAll(" ", "");
			System.out.println("Soll das dein Charactername sein " + "'" + Charname + "'");
			System.out.println("Ja/Nein");
			String answersetCharname = sc.nextLine();

			if (answersetCharname.equalsIgnoreCase("Ja")) {
				System.out.println("Bestätigt");
				charnameset = true;

			}
		}

		System.out.println(Helper +"Hallo" + Charname + "Ich Bin ein Geist Ein kleiner Begleiter Der Dir Hilft");

	}
}

/*
 * System.out.print("Setze dein Characternamen :"); String name =
 * sc.nextLine().replaceAll(" ",""); System.out.println(name);
 */
