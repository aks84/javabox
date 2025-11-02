import java.lang.*;


public class CMDInput{

	public static void main(String arg[]){
		// String Methods 
		// 1. Basic Information
		String text = "Hello World";

        System.out.println(text.length());       // 11
        System.out.println(text.isEmpty());      // false
        System.out.println("   ".isBlank());     // true (Java 11+)

        // 2. Character Access
        String s = "Java";

        System.out.println(s.charAt(2));           // v
        System.out.println(s.codePointAt(0));      // 74 (Unicode for 'J')
        System.out.println(s.codePointCount(0, 4)); // 4

        // 3. Comparison Methods
        String a = "Hello";
        String b = "hello";

        System.out.println(a.equals(b));             // false
        System.out.println(a.equalsIgnoreCase(b));   // true
        System.out.println(a.compareTo(b));          // -32 (because 'H' < 'h')
        System.out.println(a.matches("H.*o"));       // true (regex)


        


	}
}


