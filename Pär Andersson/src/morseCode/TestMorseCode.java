package morseCode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestMorseCode {
	// Totalt 10 tester varav 2 felaktiga.
	// Testar 5st Från englishToMorse varav 1 är ett feltest.
	@ParameterizedTest
	@ValueSource(strings = { "a" })
	public void test1LetterReturnMorseCode(String input) {

		// Arrange
		// Act
		MorseToEnglish object = new MorseToEnglish();
		String output = object.englishToMorse(input);
		// Assert
		assertEquals("*- ", output);
	}

	@ParameterizedTest
	@ValueSource(strings = { "pelle" })
	public void test2WordReturnMorseWord(String input) {

		MorseToEnglish object = new MorseToEnglish();
		String output = object.englishToMorse(input);
		assertEquals("*--* * *-** *-** * ", output);
	}

	@ParameterizedTest
	@ValueSource(strings = { "pelle is happy" })
	public void test3SentenceReturnMorseSentence(String input) {

		MorseToEnglish object = new MorseToEnglish();
		String output = object.englishToMorse(input);
		assertEquals("*--* * *-** *-** * | ** *** | **** *- *--* *--* -*-- ", output);
	}

	@ParameterizedTest
	@ValueSource(strings = { "abcdefghijklmnopqrstuvwxyz1234567890.,? " })
	public void test4AllLetterNumbersReturnAllMorseCode(String input) {

		MorseToEnglish object = new MorseToEnglish();
		String output = object.englishToMorse(input);
		assertEquals(
				"*- -*** -*-* -** * **-* --* **** ** *--- -*- *-** -- -* --- *--* --*- *-* *** - **- ***- *-- -**- -*-- --** *---- **--- ***-- ****- ***** -**** --*** ---** ----* ----- *-*-*- --**-- **--** | ",
				output);
	}

	// Felaktigt test! "åäö" finns inte!
	@ParameterizedTest
	@ValueSource(strings = { "åäö" })
	public void test5WrongLettersFailcode(String input) {

		MorseToEnglish object = new MorseToEnglish();
		String output = object.englishToMorse(input);
		assertEquals(input, output);
		fail("åäö Finns inte!");
	}

	// Testar 5st Från morseToEnglish varav 1 är ett feltest.
	@ParameterizedTest
	@ValueSource(strings = { "-- " })
	public void test6MorseCodeReturnLetter(String input2) {

		// Arrange
		// Act
		MorseToEnglish object2 = new MorseToEnglish();
		String output2 = object2.morseToEnglish(input2);
		// Assert
		assertEquals("m", output2);
	}

	@ParameterizedTest
	@ValueSource(strings = { "*** - *- **-* **-* *- -* " })
	public void test7MorseWordReturnWord(String input2) {

		MorseToEnglish object2 = new MorseToEnglish();
		String output2 = object2.morseToEnglish(input2);
		assertEquals("staffan", output2);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-- --- *-* *** * -*-* --- -** * | ** *** | **-* **- -* **--** " })
	public void test8MorseSentenceReturnSentence(String input2) {

		MorseToEnglish object2 = new MorseToEnglish();
		String output2 = object2.morseToEnglish(input2);

		assertEquals("morsecode is fun?", output2);
	}

	@ParameterizedTest
	@ValueSource(strings = {
			"*- -*** -*-* -** * **-* --* **** ** *--- -*- *-** -- -* --- *--* --*- *-* *** - **- ***- *-- -**- -*-- --** *---- **--- ***-- ****- ***** -**** --*** ---** ----* ----- *-*-*- --**-- **--** | " })
	public void test9AllMorseCodeReturnAllLetterNumbers(String input2) {

		// Arrange
		// Act
		MorseToEnglish object2 = new MorseToEnglish();
		String output2 = object2.morseToEnglish(input2);
		// Assert
		assertEquals("abcdefghijklmnopqrstuvwxyz1234567890.,? ", output2);
	}

	// Felaktigt test! "_." Dessa funkar inte i morsekoden.
	@ParameterizedTest
	@ValueSource(strings = { "_. " })
	public void test10WrongMorseFailcode(String input) {

		MorseToEnglish object = new MorseToEnglish();
		String output = object.morseToEnglish(input);
		assertEquals(input, output);
		fail("_. Finns inte!");
	}
}