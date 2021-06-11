package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Hello World";
        System.out.println("Reversing using string builder");
        System.out.println(reverseWithStringBuilder(str));
        System.out.println("Reversing with for loop and a string builder");
        System.out.println(reverseManually(str));
        System.out.println("Reversing using for loop only");
        reverseString(str);


}
private static String reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
}
private static String reverseManually(String str){
        StringBuilder reversedString  = new StringBuilder();
        for(int i = str.length()-1; i>=0;i--){
            reversedString.append(str.charAt(i));

        }
        return reversedString.toString();
}
//Without using a String builder
    private static void reverseString(String str){
        int strLength = str.length();
        String reversed="";
        for(int i = strLength-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println("Reverse of " + str + " is " + reversed);


    }

}
