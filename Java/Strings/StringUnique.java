public class StringUnique {
	public static void main(String[] args) {
		String test1 = "abcdefg";
		String test2 = "racecar";

		System.out.println(uniqueChar(test1));
		System.out.println(uniqueChar(test2));		
	}

	public static boolean uniqueChar(String toCheck) {
		if (toCheck.length() > 128) {
			return false; // by pigeonhole principle	
		}
		
		boolean[] checks = new boolean[128];
		for(int i = 0; i < toCheck.length(); i++) {
			char currentCheck = toCheck.charAt(i);
			if ( checks[(int)currentCheck] == true) {
				return false;	
			} else {
				checks[ (int) currentCheck] = true;
			}
		}
		
		return true;
	}
}

