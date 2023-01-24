package reusableCode;

public class WordLinkedListTest {

	public static void main(String[] args) {
		WordLinkedList wll;
		wll = new WordLinkedList();
		
		wll.addWord("Diego");
		wll.addWord("Fortnite");
		wll.addWord("MacBook");
		wll.addWord("Switch");
		wll.addWord("Controller");
		wll.addWord("Forsen");
		wll.addWord("Cow");
		wll.addWord("Diego");
		wll.addWord("Diego");
		wll.addWord("Diego");
		wll.addWord("Diego");
		wll.addWord("Diego");
		wll.addWord("Diego");
		wll.addWord("Diego");
		
		System.out.println("find: " + wll.findWord("Diego"));
		System.out.println("find: " + wll.findWord("Case"));
		System.out.println("exists: " + wll.existsWord("MacBook"));
		System.out.println("exists: " + wll.existsWord("Elise"));
		//wll.printWordList(1);
	}

}
