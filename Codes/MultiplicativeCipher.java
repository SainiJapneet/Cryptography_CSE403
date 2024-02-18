package Codes;
class Multiplicative{
    String input;
    int key;
    String output;
    Multiplicative(String input, int key){
        this.input = input.toUpperCase();
        this.key = key;
        this.output = "";
    }
    String encrypt(){
        for(int i = 0; i < input.length(); i++){
            output += (char)(((input.charAt(i) - 'A') * (key))%26 + 'A');
        }
        return output;
    }
}
public class MultiplicativeCipher {
    public static void main(String[] args){
        Multiplicative obj = new Multiplicative("Geeksforgeeks",7);
        System.out.println("OUTPUT : " + obj.encrypt());
    }
}
