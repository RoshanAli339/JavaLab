package week8;

class demoStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("RVR & JC COLLEGE");
        StringBuffer str2 = new StringBuffer();
		System.out.println("Original string buffer: " + str);
        System.out.println("str.capacity(): " + str.capacity());
        System.out.println("str.length(): " + str.length());
        System.out.println("Second string buffer: " + str2);
        System.out.println("str2.capacity(): " + str2.capacity());
		System.out.println("str.append9(5.34): " + str.append(5.34));
		System.out.println("str.reverse(): " + str.reverse());
		System.out.println("str.charAt(5): " + str.charAt(5));
		System.out.println("str.codePointAt(5): " + str.codePointAt(5));
		System.out.println("str.codePointBefore(5): " + str.codePointBefore(5));
		System.out.println("str.delete(3, 6): " + str.delete(3, 6));
		System.out.println("str.delteCharAt(11): " + str.deleteCharAt(11));
		System.out.println("str.indexOf(\"J\"): " + str.indexOf("J"));
	}	
}
