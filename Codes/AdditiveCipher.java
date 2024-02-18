package Codes;
class Additive{
    String input;
    int key;
    String output;
    Additive(String input, int key){
        this.input = input.toUpperCase();
        this.key = key;
        output = "";
    }
    String encrypt(){
        for(int i = 0; i < input.length(); i++){
            output += (char)(((input.charAt(i) - 'A') + (key))%26 + 'A');
        }
        return output;
    }
}
public class AdditiveCipher {
    public static void main(String[] args){
        Additive obj = new Additive("Geeksforgeeks", 7);
        System.out.println("OUTPUT : " + obj.encrypt());
    }
}
