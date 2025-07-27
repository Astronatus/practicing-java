class StringMethods {
    public static void main (String[] args) {
        String yes = "Yes";

        System.out.println(yes.toLowerCase());


        String hi = "Hi";
        System.out.println(hi.toUpperCase());


        String message = "Hello, mi name is";
        String name = "John";
        System.out.println(message + " " + name);


        // Concatenation with numbers
        String ageMessage = "My age is ";
        int age = 30;

        System.out.println(ageMessage + age);
    }
}