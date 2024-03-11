/**
 * sumOfDigit
 */
public class sumOfDigit {
    
public static void main(String[] args) {
int output =sum(0);
System.out.println(output);
}
        static int sum(int val){
            if (val<0) {
                return 0;
            }else
            if (val<10) {
                return val;
            }
        return val%10 + val/10;
    }
}