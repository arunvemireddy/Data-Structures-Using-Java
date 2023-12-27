package Strings;

public class GreatestCommonDivisor {

	public String gcdOfStrings(String str1, String str2) {
		String res="";
		int a = str1.length();
		int b = str2.length();
		
		if((str1+str2).equals(str2+str1)) {
			res = str1.substring(0, gcd(a,b));
		}
		return res;
	} 
	
	public int gcd(int a, int b) {
		return b==0?a:gcd(b,a%b);
	}

	public static void main(String[] args) {
		String str1 = "ABCABC";
		String str2 = "ABC";
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		String result = greatestCommonDivisor.gcdOfStrings(str1, str2);
		System.out.println(result);
	}
}
