package reusableCode;

import java.io.*;
import java.util.*;

public class Main {
	
	static String getVerse(String inLine) {
		String[] ver = inLine.split("\t");
		return ver[1];
	}
	
	public static void main(String[] args) {
		long mSec, mSecSum = 0;
		try {
			Scanner inputFile = new Scanner (new File(args[0]));
			
			WordArrayList wordArrayList = null;
			WordLinkedList wordLinkedList = null;
			WordHashMap wordHashMap = null;
			
			switch (args[1].toUpperCase()) {
				case "A":
					wordArrayList = new WordArrayList();
					break;
				case "L":
					wordLinkedList = new WordLinkedList();
					break;
				case "H":
					wordHashMap = new WordHashMap();
					break;
				default:
					System.out.println("ERROR argc[1]");
					break;
			}
			
			while (inputFile.hasNextLine()) {
				String inLine, verse;
				String[] verseParsed;
				
				inLine = inputFile.nextLine();
				verse = getVerse(inLine);
				verseParsed = verse.split("[ :;,.'!?()-]+");
				// We're going to do a millisecond execution calc
				mSec = System.nanoTime()/1000000;
				for (String s: verseParsed) {
					switch (args[1].toUpperCase()) {
					case "A":
						wordArrayList.addWord(s.toLowerCase());
						break;
					case "L":
						wordLinkedList.addWord(s.toLowerCase());
						break;
					case "H":
						wordHashMap.addWord(s.toLowerCase());
						break;
					}
				}
				mSecSum += (System.nanoTime()/1000000 - mSec);
			}
			
			inputFile.close();
			switch (args[1].toUpperCase()) {
			case "A":
				wordArrayList.printWordList(Integer.parseInt(args[2]));
				break;
			case "L":
				wordLinkedList.printWordList(Integer.parseInt(args[2]));
				break;
			case "H":
				wordHashMap.printWordList(Integer.parseInt(args[2]));
				break;
			}
	        System.out.println("Elapsed Time: " + mSecSum + " ms");
		}
		catch (Exception e) {
			System.out.println("PsalmsReaderMain Error: " + e);
		}
	}
}