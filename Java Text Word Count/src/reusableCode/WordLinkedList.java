package reusableCode;

import java.util.LinkedList;
import java.util.ListIterator;

class WordCountNode {
	String word;
	int count;
	
	public WordCountNode(String inWord) {
		word = inWord;
		count = 1;
	}	
	
	public String getWord() {
		return word;
	}
	
	public int getCount() {
		return count;
	}
	
	public int incrementCount() {
		count++;
		return count;
	}
}

public class WordLinkedList extends WordList {
	static LinkedList<WordCountNode> words = new LinkedList<WordCountNode>();
	
	public WordLinkedList() {
		super();
	}

	@Override
	public int findWord(String inWord) {
		boolean foundWord = false;
		int count = 0;
		ListIterator<WordCountNode> iterator = words.listIterator();
		
		while (iterator.hasNext()) {
			WordCountNode n = (WordCountNode) iterator.next();
			int comparison = inWord.compareTo(n.getWord());
			if (comparison == 0) {
				foundWord = true;
				count = n.getCount();
				break;
			}
		}
		
		if (foundWord) {
			return count;
		} else {
			return 0;
		}
	}

	@Override
	public boolean existsWord(String inWord) {
		if (findWord(inWord) == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int addWord(String inWord) {
		boolean foundWord = false;
		int count = 0;
		ListIterator<WordCountNode> iterator = words.listIterator();
		
		while(iterator.hasNext()) {
			WordCountNode n = (WordCountNode) iterator.next();
			int cmp = inWord.compareTo(n.getWord());
			//index++;
			if(cmp==0) {
				foundWord=true;
				n.incrementCount();
				super.incTotalAllWords();
				count = n.getCount();
				break;
			}
		}
		
		if (foundWord == false) {
			words.add(new WordCountNode(inWord));
			super.incNumUniqueWords();
			super.incTotalAllWords();
			return 1;
		}
		
		return count;
	}

	@Override
	public int incWord(String inWord) {
		boolean foundWord = false;
		int count = 0;
		
		ListIterator <WordCountNode> iterator = words.listIterator();
		
		while (iterator.hasNext()) {
			WordCountNode n = (WordCountNode) iterator.next();
			int cmp = inWord.compareTo(n.getWord());
			if (cmp == 0) {
				foundWord = true;
				n.incrementCount();
				count = n.getCount();
				break;
			} else if (cmp<0) {
				break;
			}
		}
		if (foundWord == true) {
			super.incTotalAllWords();
			return count;
		} else {
			return 0;
		}
	}

	@Override
	public void printWordList(int inMinimum) {
		System.out.println(super.toString());
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getCount() >= inMinimum) {
				System.out.println(words.get(i).getWord() + ":" + words.get(i).getCount());
			}
		}
	}
	
	public String toString() {
		return super.toString();
	}

}
