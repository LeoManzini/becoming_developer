package br.com.leomanzini.data_structures;

public class ArrayList 
{
	private static int totalNamesInserted = 0;
	
	public static String[] listStart(String nameList[]) 
	{
		for(int counter = 0; counter < nameList.length; counter++) 
		{
			nameList[counter] = " ";
		}
		
		return nameList;
	}
	
	public static String[] insertAtArraY(String nameList[], String newName) 
	{
		for(int counter = 0; counter <= totalNamesInserted; counter++) 
		{
			nameList[counter] = newName;
		}
		totalNamesInserted++;
		return nameList;
	}
	
	public static void printList(String nameList[]) 
	{
		for(int counter = 0; counter < nameList.length; counter++)
		{
			System.out.println("Position [" + (counter + 1) + "] value: " + nameList[counter]);
		}
	}
	
	public static void main(String args[]) 
	{
		String nameList[] = new String[10];
		nameList = listStart(nameList);
		nameList = insertAtArraY(nameList, "Giovanna");
		nameList = insertAtArraY(nameList, "Henrique");
		
		printList(nameList);
	}
}
