package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public static void main(String[] args) {

		String sentence = "Java is coding language same is java script";
		String[] words = sentence.split(" ");
		
//		for(int i=0; i<words.length; i++) {
//			
//			System.out.println(words[i]);
//			
//		}
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(int i=0; i<words.length; i++) {
			if (wordCount.containsKey(words[i])) {
				
				wordCount.put(words[i], wordCount.get(words[i])+1);
				
			} else {
				
				wordCount.put(words[i].toLowerCase(), 1);

			}
			
			
		}
		
		for(Entry<String, Integer> word : wordCount.entrySet()) {
			if(word.getValue()>1)
			System.out.println(word.getKey() + " : " + word.getValue());
			
		}
		
	}

}
