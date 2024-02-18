package Codes;
class Vernam{
    String input;
    String key;
    String output;
    int keySize;
    Vernam(String input, String key){
        this.input = input;
        this.key = key;
        keySize = key.length();
        output = "";
    }
    
    String encrypt(){
        if(keySize != input.length()){
            System.out.println("Key size not equal to input's size");
        }else{
            for(int i = 0; i < keySize; i++){
                output += (char)(((input.charAt(i) - 'A') ^ (key.charAt(i) - 'A'))%26 + 'A');
            }
        }
        return output;
    }
}
public class VernamCipher {
    public static void main(String[] args){
        Vernam obj = new Vernam("OAKS","SON");
        System.out.println("OUTPUT : " + obj.encrypt());
    }
}
