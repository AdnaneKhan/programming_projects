public class StringReverse {
	public static void main(String[] args) {
		String test1 = "racecar";
		String test2 = "zombie";
		String test3 = "おはよございます";
		String test4 = "もっと早くたべてください.";
		
		System.out.println(test1 + ": " + reversedString(test1));
		System.out.println(test2 + ": " + reversedString(test2));
		System.out.println(test3 + ": " + reversedString(test3));
		System.out.println(test4 + ": " + reversedString(test4));
		}

	public static String reversedString( String toReverse ) {
		char[] reversing = toReverse.toCharArray();

		for( int i = reversing.length -1; i >= reversing.length/2; i--){
			char temp = reversing[reversing.length-1-i];
			reversing[reversing.length-1-i] = reversing[i];
			reversing[i] = temp;

		}
		return new String(reversing);
	}
}
