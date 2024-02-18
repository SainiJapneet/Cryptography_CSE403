package Codes;
class GCD{
    int n1;
    int n2;
    int output;
    GCD(int n1 , int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    int getGCD(){
        while(n1%n2 != 0){
            int r = n1%n2;
            n1 = n2;
            n2 = r;
        }
        output = n2;
        return output;
    }
}
public class EuclidiandGCD {
    public static void main(String[] args){
        GCD obj = new GCD(2740, 1760);
        GCD obj1 = new GCD(25,60);
        System.out.println("OUTPUT : " + obj.getGCD());
        System.out.println("Output : " + obj1.getGCD());
    }
}
