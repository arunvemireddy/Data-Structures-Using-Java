package Strings;

public class MergeStrings {

	public String mergeAlternately(String word1, String word2) {

		String res = "";
		int len1 = word1.length();
		int len2 = word2.length();
		int k = 0;

		if (len1 == len2) {
			while (k < len1) {
				res = res.concat(String.valueOf(word1.charAt(k)));
				res = res.concat(String.valueOf(word2.charAt(k)));
				k++;
			}
			return res;
		} else if (len1 > len2) {
			while (k < len2) {
				res = res.concat(String.valueOf(word1.charAt(k)));
				res = res.concat(String.valueOf(word2.charAt(k)));
				k++;
			}
			res = res.concat(word1.substring(k, len1));
			return res;
		} else if (len2 > len1) {
			while (k < len1) {
				res = res.concat(String.valueOf(word1.charAt(k)));
				res = res.concat(String.valueOf(word2.charAt(k)));
				k++;
			}
			res = res.concat(word2.substring(k, len2));
			return res;
		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println("merge strings leet code program");
		String w1 = "abcd";
		String w2 = "pqrst";

		MergeStrings mergeStrings = new MergeStrings();
		String result = mergeStrings.mergeAlternately(w1, w2);
		System.out.println(result);
	}
}
