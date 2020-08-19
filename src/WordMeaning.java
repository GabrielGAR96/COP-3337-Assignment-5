
public class WordMeaning {
	
	String word;
	String meaning;
	
	public WordMeaning(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}

	//returns the word and its meaning separated by a dash
	public String toString() 
	{
		return word + " - " + meaning;
	}
}
