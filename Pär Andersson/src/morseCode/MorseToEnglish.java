package morseCode;

public class MorseToEnglish {
	
	private char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
				'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?', ' '};

	private String[] morse = { "*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--", "-*", 
				"---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", 
				"*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "--**--", "*-*-*-",	"**--**", "|" };
		
	public String englishToMorse (String input) {
		
		// Engelska till Morsekod
		char[] chars = input.toCharArray();
		String str = "";
		for (int i = 0; i < chars.length; i++) {
			for (int index = 0; index < english.length; index++) {
				if (english[index] == chars[i]) {
					str = str + morse[index] + " ";
				}
			}
		}
		return str;
	}

	public String morseToEnglish(String input) {

		// Morsekod till Engelska
		String[] array = input.split(" ");
		String ch = "";
		for (int i = 0; i < array.length; i++) {
			for (int index = 0; index < morse.length; index++) {
				if (morse[index].equals(array[i])) {
					ch = ch + english[index] + "";
				}
			}
		}
		return ch;
	}
}