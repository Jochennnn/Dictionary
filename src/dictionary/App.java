package dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static int IndexOfBF(String target, String pattern) {
		char[] a = target.toCharArray();
		char[] b = pattern.toCharArray();
		int i = 0;
		int j = 0;
		while (i < target.length() && j < pattern.length()) {
			if (a[i] == b[j]) {
				i++;
				j++;
			} else {
				i = i - j + 1;
				j = 0;
			}
		}
		if (j >= pattern.length())
			return i - pattern.length() + 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		DictionaryArray da = new DictionaryArray(); 
		ArrayList<String> dic = da.getMyDictionary();
		
		System.out.println("Please input dictionary and separate with comma and hit Enter(eg.i, like, sam, sung, samsung, mobile, ice, cream, man go):");
		Scanner scanD = new Scanner(System.in);
		String dictionary = scanD.next();
		da.setDictionaryArray(dictionary);
		
		System.out.println("Please input sentence and hit Enter(eg. ilikesamsungphone)：");
		Scanner scanS = new Scanner(System.in);
		String sentence = scanS.next();
		
		for (int i = 0; i < dic.size(); i++) {
			int j = IndexOfBF(sentence, dic.get(i)); // ilikesamsungphone
			if (j > 0)
				System.out.print(dic.get(i) + " ");
		}

	}
}
