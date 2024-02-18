package Codes;
class RailFence{
    String input;
    int key;
    String output;
    RailFence(String input, int key){
        this.input = input.toUpperCase();
        this.key = key;
        this.output = "";
    }
    String encrypt(){
        int n = 0;
        int d = 1;
        String[] arr = new String[key];
        for(int i = 0; i < key; i++){
            arr[i] = "";
        }
        for(int i = 0; i < input.length(); i++){
            arr[n] += input.charAt(i);
            if(n == key - 1){
                d = -1;
            }else if(n == 0){
                d = 1;
            }
            n += d*1;
        }
        for(String i : arr){
            output += i;
        }
        return output;
    }
}
public class RailFenceCipher {
    public static void main(String[] args){
        RailFence obj = new RailFence("GeeksforGeeks", 3);
        System.out.println("OUTPUT : " + obj.encrypt());
    }
}
