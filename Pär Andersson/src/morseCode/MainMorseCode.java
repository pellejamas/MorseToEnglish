package morseCode;

import java.util.Scanner;

public class MainMorseCode extends MorseToEnglish {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MorseToEnglish translator = new MorseToEnglish();
		System.out.println("Du har 3 alternativ:");
		System.out.println("1. �vers�tta Engelska till Morsekod.\n2. �vers�tta Morsekod till Engelska. \n3. Avsluta programet! ");
		while (!sc.hasNextInt()) {
			System.err.println("\n***FELMEDDELANDE! FEL TECKEN! (V�LJ 1 2 3)***");
			sc.next();
		}
		int choice = Integer.valueOf(sc.nextLine());
		switch (choice) {
		case 1:
			System.out.println("--> 1. Skriv en mening som �vers�tts till morse kod: (Anv�nd mellanslag mellan orden)");
			String input = sc.nextLine().toLowerCase();
			String result = translator.englishToMorse(input);
			System.out.println("--> �vers�ttningen till morse blir: \n" + result);
			
			break;
					
		case 2:
			System.out.println("--> 2. Skriv Morsekod: (Ha mellanslag mellan varje \"bokstav\") (anv�nd | f�r mellanrum mellan orden.)");
			input = sc.nextLine().toLowerCase();
			result = translator.morseToEnglish(input);
			System.out.println("--> �vers�ttning till text blir:\n" + result);
			break;
			
		case 3:
			System.out.println("Programmet avslutas");
			break;

		default:
			System.err.println("\n***FELMEDDELANDE! FEL SIFFRA! (V�LJ 1 2 3)***");
			sc.next();
		}
		sc.close(); // close scanner
		System.exit(0);
	}
}