public class Vaccum{
    public static void main(String[] args){
        System.out.println("hello");
       
        System.out.println(returnOrNot("LL"));
    }
    public static boolean returnOrNot(String str){
        String lowerCase = str.toLowerCase();
        int right=0;
        int left=0;
        int up=0;
        int down=0; 
        for(int i=0; i<lowerCase.length();i++){
            if(lowerCase.charAt(i)=='r'){
                right++;
            }else if(lowerCase.charAt(i)=='l'){
                left++;
            }else if(lowerCase.charAt(i)=='u'){
                up++;
            }else if(lowerCase.charAt(i)=='d'){
                down++;
            }
        }
       
        if(right==left && up==down){
            return true;
        }else{
            return false;
        }

    }
}