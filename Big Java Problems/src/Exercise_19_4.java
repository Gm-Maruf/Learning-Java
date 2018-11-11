import java.io.File;
import java.io.IOException;
import java.util.*;

public class Ex_19_4 {

	private static Scanner in;

	public static void main(String[] args) throws IOException
	{
		String file = "C:\\Users\\Gm Maruf\\eclipse-workspace\\LabTest6\\src";
        in = new Scanner(new File(file));
        
	    List<String> wordList = new ArrayList<>();
	    List<String> wordSortedList = new ArrayList<>();
	    
	    while (in.hasNext()) 
	    { 
	    	wordList.add(in.next()); 
	    }
	    

	    long count = 0;
	    
	    Collections.sort(wordList);
	    
		wordList.stream()
	    	.filter(w -> w.length()<=4)
	    	.distinct().forEach(System.out :: println);
		
	    for (String w : wordList)
	    {
	    	if(w.length()<5)
	    	{
	    		System.out.println(w);
	    	}
	    }
	}
}
