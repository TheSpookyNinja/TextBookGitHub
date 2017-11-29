public class Palindrome
{
    public String word;
    private boolean isPalindrome;
    
    public Palindrome(String wd) {
        this.word = wd;
    }
    
    public boolean testPalindrome() {
        //Determine if the word is a palindrome
        for(int i=0; i < word.length(); i++) {
         System.out.println(word.substring(i,i+1));   
        }
        //Set isPalindrome
        return isPalindrome;
    }
    
    public void testShitlord() {
        for (int y=0; y < word.length(); y++){
            System.out.println(word.substring(y,y+1));
        }
    }
}

