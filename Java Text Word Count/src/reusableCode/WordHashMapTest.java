package reusableCode;

public class WordHashMapTest {

	public static void main(String[] args) {
		WordHashMap whm;
		whm = new WordHashMap();
		
		whm.addWord("Diego");
		whm.addWord("Fortnite");
		whm.addWord("MacBook");
		whm.addWord("Switch");
		whm.addWord("Controller");
		whm.addWord("Forsen");
		whm.addWord("Cow");
		whm.addWord("Diego");
		whm.addWord("Diego");
		whm.addWord("Diego");
		whm.addWord("Diego");
		whm.addWord("Diego");
		whm.addWord("Diego");
		whm.addWord("Diego");
		
		System.out.println("find: " + whm.findWord("Diego"));
		System.out.println("find: " + whm.findWord("Case"));
		System.out.println("exists: " + whm.existsWord("MacBook"));
		System.out.println("exists: " + whm.existsWord("Elise"));
		
		whm.printWordList(1);
	}

}
