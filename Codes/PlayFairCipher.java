package Codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PlayFair{
    String input;
    String key;
    String output;
    char[][] arr = new char[5][5];
    PlayFair(String input, String key){
        this.input = input.toUpperCase();
        this.key = key.toUpperCase();
        this.output = "";
    }
    String sanitizeKey(){
        String sanitizedKey = "";
        Map<Character, Integer> exists = new HashMap();
        for(int i = 0; i < key.length(); i++){
            if(!exists.containsKey(key.charAt(i))){
                exists.put(key.charAt(i), null);
                sanitizedKey += key.charAt(i);
            }
        }
        return sanitizedKey;
    }
    void getMatrix(){
        int i = 0;
        int j = 0;
        String sainitizedKey = sanitizeKey();
        Map<Character,Integer> exists = new HashMap();
        for(int a = 0; a < sainitizedKey.length(); a++){
            exists.put(sainitizedKey.charAt(a), 1);
            arr[i][j] = sainitizedKey.charAt(a);
            if(j == 4 && i == 4){
                j = 0;
            }else if(j == 4 && i != 4){
                j = 0;
                i++;
            }
            else{
                j++;
            }
        }
        for(char ch = 'A'; ch <= 'Z'; ch++){
            if(!exists.containsKey(ch)){
                if(ch == 'J'){
                    continue;
                }else{
                    arr[i][j] = ch;
                }
                if(j == 4 && i == 4){
                    j = 0;
                }else if(j == 4 && i != 4){
                    j = 0;
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        System.out.println("MATRIX : ");
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < 5; b++){
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }
    ArrayList<String> getPairs(){
        int a = 0;
        ArrayList<String> arr = new ArrayList<>();
        while(a+2 <= input.length()){
            String str;
            if(a + 2 >= input.length()){
                str = input.substring(a,a+1);
            }else{
                str = input.substring(a,a+2);
            }
            
            if(str.length() == 1){
                str += 'X';
            }else if(str.charAt(0) == str.charAt(1)){
                str = ""+str.charAt(0)+'X';
                a += 1;
            }else if(str.charAt(0) == ' '){
                str = "X" + str.charAt(1);
                a += 2;
                System.out.println("In left space part");
            }else if(str.charAt(1) == ' '){
                str = "" + str.charAt(0) + "X";
                a += 2;
                System.out.println("In right space part");
            }else{
                a += 2;
            }

            arr.add(str);
        }

        return arr;
    }
    
}
public class PlayFairCipher {
    public static void main(String[] args){
        PlayFair obj = new PlayFair( "Tall Tree", "occurrence");
        obj.getMatrix();
        System.out.println(obj.getPairs());
    }
}
