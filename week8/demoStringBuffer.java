package week8;

class demoStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("	RVR & JC COLLEGE OF ENGINEERING");
		System.out.println("Original string buffer: " + str);
		System.out.println("append9(5.34): " + str.append(5.34));
		System.out.println("length(): " + str.length());
		System.out.println("reverse(): " + str.reverse());
		System.out.println("capacity(): " + str.capacity());
		System.out.println("charAt(5): " + str.charAt(5));
		System.out.println("codePointAt(5): " + str.codePointAt(5));
		System.out.println("codePointBefore(5): " + str.codePointBefore(5));
		System.out.println("delete(3, 6): " + str.delete(3, 6));
		System.out.println("delteCharAt(11): " + str.deleteCharAt(11));
		System.out.println("indexOf(\"J\"): " + str.indexOf("J"));
	}	
}