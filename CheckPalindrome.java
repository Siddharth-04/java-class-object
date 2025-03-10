public class CheckPalindrome {
    String text;

    CheckPalindrome(String text){
        this.text = text;
    }

    public boolean isPalindrome(){
        String text = this.text;
        int n = text.length()-1;
        int i=0;

        while(i<n){
            if(text.charAt(i) != text.charAt(n)) return false;
            else{
                i++;
                n--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome text1 = new CheckPalindrome("racecar");
        System.out.println(text1.isPalindrome());
    }
}
//true
