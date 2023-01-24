package reusableCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WordHashMap extends WordList {
	static HashMap<String, Integer>wordsHash = new HashMap<String, Integer>();
	
	public WordHashMap() {
		super();
	}

	@Override
	public int findWord(String inWord) {
		if (wordsHash.containsKey(inWord)) {
			return wordsHash.get(inWord);
		} else {
			return 0;
		}
	}

	@Override
	public boolean existsWord(String inWord) {
		if (wordsHash.containsKey(inWord)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int addWord(String inWord) {
		if (wordsHash.containsKey(inWord)) {
			wordsHash.put(inWord, wordsHash.get(inWord)+1);
			super.incTotalAllWords();
		} else {
			wordsHash.put(inWord, 1);
			super.incTotalAllWords();
			super.incNumUniqueWords();
		}
		return wordsHash.get(inWord);
	}

	@Override
	public int incWord(String inWord) {
		if (wordsHash.containsKey(inWord)) {
			super.incTotalAllWords();
			wordsHash.put(inWord, wordsHash.get(inWord)+1);
			return wordsHash.get(inWord);
		} else {
			return 0;
		}
	}

	@Override
	public void printWordList(int inMinimum) {
		System.out.println(super.toString());
		Iterator<Entry<String, Integer> > iterator = wordsHash.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> map = (Map.Entry<String, Integer>) iterator.next();
			if (map.getValue() >= inMinimum) {
				System.out.println(map.getKey()+":"+map.getValue());
			}
		}
	}
	
	public String toString() {
		return super.toString();
	}

}
