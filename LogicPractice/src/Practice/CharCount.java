package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharCount {

	public static void main(String[] args) {

		String s = "aabbbbcccc";

		char[] alpha = s.toCharArray();

		HashMap<Character, Integer> count = new HashMap<Character, Integer>();

		for (int i = 0; i < alpha.length; i++) {

			if (count.containsKey(alpha[i])) {

				count.put(alpha[i], count.get(alpha[i]) + 1);

			} else {

				count.put(alpha[i], 1);

			}

		}

		for (Entry<Character, Integer> e : count.entrySet()) {

			System.out.print(e.getKey().toString() + e.getValue());

		}

	}

}
