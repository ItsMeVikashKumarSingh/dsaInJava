public class power {
    public static void main(String[] args) {
        int output = pow(5, 3);
        System.out.println(output);
        
    }
    public static int pow(int val , int powVal)
    {
        if (powVal <2) {
            return val;
        }
        return val* pow( val , powVal-1);
    }
}
