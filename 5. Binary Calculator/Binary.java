public class Binary {
  //  I dont understand this solution maybe will later; 
  public static void main(String[] args) {
    System.out.println(addBinary("1", "1"));
        
}
 public static String addBinary(String a, String b) {
   
    int carry=0;
    String result="";
    int i=0;
    int alen=a.length();
    int blen=b.length();
    while(i<alen||i<blen||carry!=0){
      // X bhaneko String a ma k xa aile
        int x = 0;
        if(i<alen && a.charAt(alen-1-i) =='1') x  = 1;
        // y bhaneko String b ma k xa aile
        int y = 0;
        if(i<blen && b.charAt(blen-1-i) =='1') y = 1;
     
        result=(x+y+carry)%2+result;
        carry=(x+y+carry)/2;
        i++;
    }
    return result;
 }

}

