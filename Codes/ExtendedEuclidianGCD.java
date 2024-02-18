package Codes;
class ExtendedGCD{
    int n1;
    int n2;
    int s1;
    int s2;
    int t1;
    int t2;
    ExtendedGCD(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        this.s1 = 1;
        this.s2 = 0;
        this.t1 = 0;
        this.t2 = 1;
    }
    void getExtendedGCD(){
        int r1 = n1;
        int r2 = n2;
        int r = 0;
        int q = 0;
        int s = 0;
        int t = 0;
        while(n1%n2 != 0){
            r = n1%n2;
            q = n1/n2;
            s = s1 - q*s2;
            t = t1 - q*t2;

            n1 = n2;
            n2 = r;
            s1 = s2;
            s2 = s;
            t1 = t2;
            t2 = t;
        }
        System.out.println(n2 + " = " + s + " x "+ r1 + " + " + t + " x " + r2);
    }
}

public class ExtendedEuclidianGCD {
    public static void main(String[] args){
        ExtendedGCD obj = new ExtendedGCD(161, 28);
        obj.getExtendedGCD();
    }
}
