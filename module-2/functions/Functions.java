
public class Functions {
    public static void main (String[] args) {
        int result = MyFunction(3, 2);
        System.out.println(result);
    }

    static int MyFunction (int x, int y) {
        int z = 2 * x - y;
        return z;
    }
}
