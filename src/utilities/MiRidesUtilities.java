package utilities;

import exception_handling.InvalidRegID;

/*
 * Class:			DateTime
 * Description:		Helpful Utilities for the application 
 * Author:			Jay Kumar
 */

public class MiRidesUtilities
{

	private final static int ID_LENGTH = 6;

	public static String isRegNoValid(String regNo)
	{
		int regNoLength = regNo.length();
		if (regNoLength != ID_LENGTH)
		{
			throw new InvalidRegID("Error: registration number must be 6 characters");

		}
		boolean letters = regNo.substring(0, 3).matches("[a-zA-Z]+");
		if (!letters)
		{
			throw new InvalidRegID("Error: The registration number should begin with three alphabetical characters.");

		}
		boolean numbers = regNo.substring(3).matches("[0-9]+");
		if (!numbers)
		{
			throw new InvalidRegID("Error: The registration number should end with three numeric characters.");

		}
		return regNo;
	}

}
