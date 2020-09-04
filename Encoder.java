import java.util.*;
import java.io.BufferedReader;

/**
 *	1. read the text until we find. pattern that is not in our table
	2. put that pattern into the table, output the code for everything BUT the last letter of that new pattern
	3. reset to only include what we have not output a code for

 */
//public class Encoder {
//	//build the list/table, acts like a dictionary
//	public static List <Integer> compressed (String uncompressed) {
//
//
//		//make table that has the list of string and their value
//		Hashtable<String, int> table = new Hashtable<String, int>();
//
//		//make file reader
//		BufferedReader br = new BufferedReader(new FileReader(uncompressed));
//
//		//read in file to code
//		int counter = 0;
//
//		while (br.ready) 
//		{
//			table.put (""+br.read(), counter);
//			//make table and input a-z
//
//			//make array of strings (input), each character has an index


public class Encoder (String inputFileName){

	//make table that has the list of string and their value
	Hashtable<String, int> table = new Hashtable<String, int>();


	//make file reader
	BufferedReader br = new BufferedReader(new FileReader(inputFileName));

	//make table and input a-z

	//make an array (input), each character has an index


	public void encodeFile ()
	{
		for (i=0; i<26; i++)
		{
			table.put(""+ (char)(i+97), i)
		}

		String read = ""; // String that you take in


		//read in file to code and add to input
		while (br.ready) 
		{
			read = ""+br.read();
			if (table.containsKey(read))
			{
				table.put(read, table.size)
			}
			table.put (""+br.read(), counter)
			br.read();
		}
		//save
		br.close();

	}


}
