package reusableCode;

/**
 * 
 * @author TMyatt
 */
public class WordListMain {
	/**
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		
		WordArrayList wl;
		
		wl = new WordArrayList();

		wl.addWord("Myatt");
		wl.addWord("Myatt");
		wl.addWord("Timothy");
		wl.addWord("Esquire");
		wl.addWord("Myatt");
		wl.addWord("Myatt");
		wl.addWord("Timothy");

		System.out.println("find: " + wl.findWord("Timothy"));
		System.out.println("find: " + wl.findWord("Myatt"));
		System.out.println("find: " + wl.findWord("HelpMeICan"));
		System.out.println("exists: " + wl.existsWord("Timothy"));
		System.out.println("exists: " + wl.existsWord("Myatt"));
		System.out.println("exists: " + wl.existsWord("HelpMeICan"));
		wl.printWordList(1);
	}
}