
public class WordList {

	private WordMeaningNode list;
	
	WordList()
	{
		list = null;
	}
	
	void append(WordMeaning w) //stores node in the end of the list
	{
		WordMeaningNode wmn = new WordMeaningNode(w); 
		if(list == null) list = wmn; 
		else 
		{
			WordMeaningNode aux = list;
			while(aux.next != null) aux = aux.next;
			aux.next = wmn;
		} 
	}
	
	//returns each word and its definition
	public String toString() 
	{
		String r = ""; 
		WordMeaningNode aux = list;
		if(aux != null) {
			while(aux.next != null)
			{
				r += aux.wMeaning.toString() + "\n";
				aux = aux.next;
			}//adds each word and meaning to the string 'r'
			r += aux.wMeaning.toString();
		}
		
		/*array that contains each combination of word and definition separated
		by lines*/
		String[] array = r.split("\\n+"); 
		
		return arraySort(array);
	}
	
	//sorts each node and its definition
	private String arraySort(String[] array) 
	{
		String sortedString = "";
		
		//compares each item in the array and sorts them
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j]) > 0)
				{
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		/*adds each item in the array to the string in lexicographical order
		separated by lines*/
		for (int i = 0; i < array.length; i++) { 
			sortedString += array[i] + "\n";
		}
		return sortedString;
	}
}
