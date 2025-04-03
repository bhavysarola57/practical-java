public class prac13 {
    public static void main(String[] args) {
       
        String str = "Hello, welcome to Java programming!";

        char ch = str.charAt(7);  
        System.out.println("Character at index 7: " + ch);

      
        boolean containsWord = str.contains("Hello"); 
        System.out.println("Does the string contain 'hello'? " + containsWord);

      
        String newstr = String.format("The length of the string is: %d", str.length());
        System.out.println(newstr );

        
        int length = str.length();  
        System.out.println("Length of the string: " + length);

     
        String[] words = str.split(" ");  
        System.out.println("Words which stored into the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
