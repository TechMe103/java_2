public class stringPalindrome {
    public static void main(String[] args) {
        String str= "mam";
        // StringBuilder gtr= new StringBuilder(str);
        // gtr.reverse();
        // String s= gtr + " ";
        // if(str.equals(s)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not palindrome");
        // }
        int i=0; 
        int j=str.length()-1;
        boolean flag= true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("palindrome");
                break;
            }
            i++;
            j--;

        }
        if(flag == true)  System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
