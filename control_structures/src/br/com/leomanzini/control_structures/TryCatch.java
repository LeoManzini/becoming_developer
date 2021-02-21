package br.com.leomanzini.control_structures;

public class TryCatch {
	
	private static void increaseLetters() throws NullPointerException // Throwing exception
	{
		String phrase = null;
		String newPhrase = null;
		newPhrase = phrase.toUpperCase();
		System.out.println("Old phrase: " + phrase);
	    System.out.println("New phrase: " + newPhrase);
	}
	
	private static void increaseLettersThrowingGenericException() throws Exception // Forcing a generic exception
	{
		String phrase = null;
		String newPhrase = null;
	    try
	    {
	    	newPhrase = phrase.toUpperCase();
	    }
	    catch(NullPointerException e)
	    {
	      throw new Exception(e);
	    }
		System.out.println("Old phrase: " + phrase);
	    System.out.println("New phrase: " + newPhrase);
	}

	public static void main(String[] args) throws WithoutBException {
		
	    String phrase = null;
	    String newPhrase = null;
		
	    // Treating the error above the phrase
		try 
		{
			newPhrase = phrase.toUpperCase();
		    
		} catch (NullPointerException e) 
		{
		    System.out.println("The initial sentence is null, to solve this problem, it has been assigned a default value.");
		    phrase = "Empty phrase";
		    newPhrase = phrase.toUpperCase();
		}
	    System.out.println("Old phrase: " + phrase);
	    System.out.println("New phrase: " + newPhrase);
	    
	    // Using finally
		try 
		{
			newPhrase = phrase.toUpperCase();
		    
		} catch (NullPointerException e) 
		{
		    System.out.println("The initial sentence is null, to solve this problem, it has been assigned a default value.");
		    phrase = "Empty phrase";
		    newPhrase = phrase.toUpperCase();
		}
	    finally
	    {
	    	newPhrase = phrase.toUpperCase();
	    }
	    System.out.println("Old phrase: " + phrase);
	    System.out.println("New phrase: " + newPhrase);
	    
	    // Throwing an exception
	    try
	    {
	    	increaseLetters();
	    }
	    catch(NullPointerException e)
	    {
	    	System.out.println("Exit with error NullPointerException executing the method increaseLetters() " + e);
	    }
	    
	    // Forcing a generic exception
	    try
	    {
	    	increaseLettersThrowingGenericException();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Exit with error executing the method increaseLettersThrowingGenericException() " + e);
	    }
	    
	    // Throw your created exception
	    String frase = "I'm a test!";
	    if(!frase.contains("b") || !frase.contains("B"))
	    throw new WithoutBException();
	}
}
