package Strings;

public class reverse{
    public static void main(String[] args) {
        String str = new String ("akihsnav");
        String result = new StringBuilder (str).reverse().toString();
        System.out.println("Reversed String: " + result );
    }
    }

///////////////////////////////////////
/// using char array : 
/// public class reverse {
/// public static void main (String args[]){
/// String str = "Java";
/// char[] charArray = str.toCharArray();
/// int left = 0 ; int right = charArray.length-1;
/// while (left < right){
/// char temp = charArray[left];
/// charArray[left]= charArray[right];
/// charArray[right]= temp ; 
/// left++;
/// right-- ;}
/// System.out.println(new String(charArray));
/// }
/// }
/// 
/// /////////////////////////////////////////////////////////
/// using recursion 
/// public class reverse {
/// public static void main (String args[]){
/// if (str.isempty()){
/// return str;}
/// return recursively(str.substring(1)+str.charAt(0);)}
/// public static void main(String[] args) {
// String str = "Recursion";
// System.out.println("Reversed String: " + reverseRecursively(str));
// }}

//////////////////////////////////////////////
/// Using a stack :
/// import java.util.Stack;
/// 
/// public class ReverseString {
/// public static void main (String[]args){
/// String str = "Stack";
/// Stack<Charachter> stack = new Stack<Charachter>();
/// for(char ch : str.toCharArray()){
/// stack.push(ch);
/// }
///   StringBuilder reversed = new StringBuilder();
// while (!stack.isEmpty()) {
//     reversed.append(stack.pop());
// }

// System.out.println("Reversed String: " + reversed);
// }
/// }}