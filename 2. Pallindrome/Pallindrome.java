public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(pallindromeCheckForLoop(" a plan, a canal: Panama."));
        pallindromeStringBuilder("A man, a plan, a canal: Panama.");
        
       
    }
    public static Boolean pallindromeCheckForLoop(String string){
        // Removing the space
        String spaceRemoved=string.replace(" ", "");
        // This is a RegEx expresseion which is saying to remove everything except the alphabets and the numbers
        String removeSpecialCharacters= spaceRemoved.replaceAll("[^a-zA-Z0-9]", "");
        String reverse="";
        for(int i=removeSpecialCharacters.length()-1;i>=0;i--){
            reverse=reverse+removeSpecialCharacters.charAt(i);
        }
        
       if(removeSpecialCharacters.toLowerCase().equals(reverse.toLowerCase())){
        //  System.out.println("Omagooo sulto pani ustai ulto pani ustai");

           return true;
       }else{
        //    System.out.println("Sulto ulto ustai raina raixa");
           return false;
       }

    }

    public static void pallindromeStringBuilder(String str){
      
        String spaceRemoved=str.replace(" ", "");
        String removeSpecialCharacters= spaceRemoved.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder myString = new StringBuilder(removeSpecialCharacters);
        StringBuilder stringReversed = new StringBuilder(removeSpecialCharacters).reverse();
        if(myString.toString().toLowerCase().equals(stringReversed.toString().toLowerCase())){
            System.out.println("Pallindrome");
        }else{
            System.out.println("NOt a pallindrome");
        }

    }
 
}
