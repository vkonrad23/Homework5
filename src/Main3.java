public class Main3 {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {

        int sum = addNumbers(1, 2);


        String greeting = greet("Vlad");

        // Print the returned values
        System.out.println("The sum of 1 and 2 is: " + sum);
        System.out.println(greeting);
    }
}
