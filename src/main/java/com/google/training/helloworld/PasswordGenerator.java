package com.google.training.helloworld;
import java.util.Random;

public final class PasswordGenerator{

	/**
	 * 
	 */
	private static final int charactersSize = 100;

	private static char[] characters = new char[charactersSize];

	private static int charactersCount = 0;
	
	private static boolean isInit=false;

	private int passwordSize = 15;

	public PasswordGenerator() {
		
		if (!isInit)initCharacters();
	}

	private static char[] initCharacters() {
		int i = 0;

		// add 0-9
		for (int j = 48; j < 58; ++i, ++j, ++charactersCount) {
			characters[i] = (char) j;
		}

		// add @ + a-z
		for (int j = 64; j < 91; ++i, ++j, ++charactersCount) {
			characters[i] = (char) j;
		}

		// add A-Z
		for (int j = 97; j < 123; ++i, ++j, ++charactersCount) {
			characters[i] = (char) j;
		}
        isInit=true;
		return characters;
	}

	public String generate() {

		Random rnd = new Random();

		String password = "";

		for (int i = 0; i < passwordSize; ++i) {
			password += characters[rnd.nextInt(charactersCount)];
		}

		return password;
	}

}
class Password{
	public String password;

	public Password(String s){
		this.password=s;
	}
}