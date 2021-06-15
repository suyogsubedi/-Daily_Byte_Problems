public class CapitalLetter {
    public static void main(String[] args){  
        System.out.println(correctCapital("smalL"));
    }
    public static boolean correctCapital(String word){
        int counter = 0;
        boolean current = false;
        for(int i =0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                counter++;
            }
          }
          
          if((counter==word.length()) || (counter==0) || (counter==1 && Character.isUpperCase(word.charAt(0))) ){
              current=true;
          }
          return current;
    }
}

   