public class MathOperators {
    static int x;
    static int y;
    static int z;
    
    public static void main(String[] args) {
        x = 2;    
        y = x * 3;
        int z = y / 2;

        x = (2 + z) % 2;
        
        System.out.println("x = " + x);
    }
}