class string  {
	public static boolean isPalindrome(String str)
	{
		// Initializing an empty string to store the reverse
		// of the original str
		String rev = "";
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
	
		String str = "sanskruti";

		// Convert the string to lowercase
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
}
