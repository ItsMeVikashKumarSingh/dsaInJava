public class decimalToBinary {
    public static void main(String[] args)
    {
        int data = binary(11);
        System.out.println(data);
    }
    public static int binary(int val)
    {
        if (val==0) {
            return val;
        }
        return val%2 + 10*binary(val/2);
    }
}
