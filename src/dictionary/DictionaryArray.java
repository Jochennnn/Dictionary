package dictionary;

import java.util.ArrayList;

public class DictionaryArray {
	private ArrayList<String> myDictionary = new ArrayList<String>();

	public ArrayList<String> getMyDictionary() {
		return myDictionary;
	}

	public void setMyDictionary(ArrayList<String> myDictionary) {
		this.myDictionary = myDictionary;
	}

	public void setDictionaryArray(String dictionary) {
		String[] array = dictionary.split(",");
		for (int i = 0; i < array.length; i++) {
			myDictionary.add(array[i]);
		}
	}
}
