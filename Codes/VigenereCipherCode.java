package Codes;
class Parent{
    String input;
    String output;
    String key;
    int keySize;
    Parent(String input, String key){
        this.input = input.toUpperCase() ;
        this.key = key.toUpperCase();
        this.keySize = key.length();
        output = "";
    }
    void constructKey(){
        int k = 0;
        char[] arr = key.toCharArray();
        for(int i = keySize-1; i < input.length(); i++){
            key += arr[k];
            if(k == keySize-1){
                k = 0;
            }else{
                k++;
            }
        }
        System.out.println("New key : " + key);
    }
    String encrypt(){
        for(int i = 0; i < input.length(); i++){
            output += (char)(((input.charAt(i) - 'A') + (key.charAt(i) - 'A'))%26 + 65);
        }
        return output;
    }
}
public class VigenereCipherCode {
    public static void main(String[] args){
        Parent obj = new Parent("StillReading","god");
        obj.constructKey();
        System.out.println(obj.encrypt());
    }
}