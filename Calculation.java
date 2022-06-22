package com.Aparana;

public class Calculation {
	int add(int first_number, int second_number) {
		int add = first_number + second_number;
		return add;
	}

	public int subtract(int first_number, int second_number) {
		int subtract = first_number - second_number;
		return subtract;
	}

	public int multiple(int first_number, int second_number) {
		int multiple = first_number * second_number;
		return multiple;
	}

	public int divide(int first_number, int second_number) throws InvalidArgumentsException {

		if (second_number == 0) {
			throw new InvalidArgumentsException("invalid digit");
		}
		int divide = first_number / second_number;
		return divide;

	}
	public String add(String first_character, String second_character) {
		//String add = first_character  +  second_character;
		//first_character= first_character.concat(second_character);
		return first_character +  second_character;
	}

	
	//  public float ac(int n2) { float ac = (float) (4046.85 * n2); ; return ac; }
	 
}
