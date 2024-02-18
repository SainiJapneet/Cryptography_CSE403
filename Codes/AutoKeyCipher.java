package Codes;

class AutoKey{
    String input;
    String key;
    int keySize;
    String output;
    AutoKey(String input, String key){
        this.input = input.toUpperCase();
        this.key = key.toUpperCase();
        this.keySize = key.length();
        this.output = "";
    }
    void keyFormation(){
        if(keySize < input.length()){
            for(int i = keySize; i < input.length(); i++){
                key += input.charAt(i);
            }
            System.out.println("New key : " + key);
            System.out.println("Input length : "+ input.length());
            System.out.println("Key length : " + key.length());
        }else if(keySize > input.length()){
            System.out.println("Key size can't be greater than input size");
        }else{
            System.out.println("Key size already equal to input size");
        }
    }

    String encrypt(){
        for(int i = 0; i < key.length(); i++){
            output += (char)(((input.charAt(i) - 'A') + (key.charAt(i) - 'A'))%26 + 'A');
        }
        return output;
    }
}
public class AutoKeyCipher {
    public static void main(String[] args){
        AutoKey obj = new AutoKey("StillRollin", "GOD");
        obj.keyFormation();
        System.out.println("Output : " + obj.encrypt());
    }
}
