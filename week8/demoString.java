package week8;

class demoString
{
	public static void main(String args[])
	{
		String str = "    RVR & JC College of Engineering";
		System.out.println("Original string: " + str);
		System.out.println("trim(): " + str.trim());
		str = str.trim();
		System.out.println("toLowerCase(): " + str.toLowerCase());
		System.out.println("toUpperCase(): " + str.toUpperCase());
		System.out.println("length(): " + str.length());
		System.out.println("charAt(4): " + str.charAt(4));
		System.out.println("indexOf('o'): " + str.indexOf('o'));
		System.out.println("substring(3, 10): " + str.substring(3, 10));
		System.out.println("replace(\"RVR & JC\", \"R.V.R & J.C\"): " + str.replace("RVR & JC", "R.V.R & J.C"));
		System.out.println("equalsIgnoreCase(\"rvr & jc cOLLEGE OF eNGINEERING\"): " + str.equalsIgnoreCase("rvr & jc cOLLEGE OF eNGINEERING"));
		System.out.println("contains(\"of\"): " + str.contains("of"));
	}
}