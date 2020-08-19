import javax.swing.JOptionPane;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initial list of words and meanings
		WordMeaning w1 = new WordMeaning("Cup", "a container from which we "
				+ "drink");
		WordMeaning w2 = new WordMeaning("Library", "a collection of books");
		WordMeaning w3 = new WordMeaning("School", "a place of learning");
		
		WordList list = new WordList();
		
		//appends list of words and meanings
		list.append(w1);
		list.append(w2);
		list.append(w3);
		
		
		String options = "1. Add word\n"
                + "2. Display words\n"
                + "3. Quit\n";
		
		boolean running = true;
		
		while(running)
		{
			String s = JOptionPane.showInputDialog(null, options);           
            int i = Integer.parseInt(s);
            
            switch(i)
            {
            case 1: //add word
            	String word = JOptionPane.showInputDialog("Insert the word you"
            			+ " want to add");
            	String definition = JOptionPane.showInputDialog("Insert the"
            			+ " definition of the word");
            	WordMeaning w = new WordMeaning(word, definition);
            	list.append(w);
            	break;
            case 2: //show words
            	JOptionPane.showMessageDialog(null, list.toString());
            	break;
            case 3: //quit program
            	running = false;
            	break;
               
            }
		}
		
	}

}
