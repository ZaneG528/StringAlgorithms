public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
            String Chara = "";
            for (int i = 1;i<=word.length();i++){
               Chara += (word.substring(i-1,i)+"\n");
            }
        
        return Chara;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String drow = "";
     for (int length = word.length(); length>0; length--){
          drow += word.substring(length-1, length);
          }
     return drow;
 }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String ABC = sentence;
        String Sentance = sentence;
        String capLetter = sentence.substring(0,1);
        capLetter = capLetter.toUpperCase();
        ABC=capLetter+sentence.substring(1);
        int x;
        while(Sentance.indexOf(" ")!=-1){
             capLetter = Sentance.substring(Sentance.indexOf(" ")+1,Sentance.indexOf(" ")+2);
             capLetter = capLetter.toUpperCase();
             x = Sentance.indexOf(" ");
              Sentance= Sentance.substring(0,Sentance.indexOf(" "))+"_"+Sentance.substring(Sentance.indexOf(" ")+1);
              ABC = ABC.substring(0,x+1)+capLetter+ABC.substring(x+2);
            //ABC = ABC.substring(0,ABC.indexOf(" "))+capLetter+ABC.substring(Sentance.indexOf(" ")+2);
           // Sentance = Sentance.substring(0,Sentance.indexOf(" "))+"*"+Sentance.substring(Sentance.indexOf(" ")+1);
        }
        return ABC;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        boolean pali = false;
        if (word.equals(reverseWord(word))){
        pali = true;
        }
        return pali;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static String firstUniqueChar(String word) {
        // TODO: Implement this method
        boolean unique = false;
        String word1 = word;
        String uniqueChar = "";
        String testingChar = "";
        for (int z = 0;unique == false; z++){
           testingChar= word.substring(z,z+1);
           word1=word.substring(z+1);
           //System.out.println(word1);
           if (word1.indexOf(testingChar)==-1){
              unique = true;
              //System.out.println("If test");
             uniqueChar = testingChar;
             //System.out.println(uniqueChar);
           }
           else{
            word1=word;
           }
        }
        return uniqueChar;
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("abc"));
    }
}
