public class Main2 {
    public static void main(String[] args) {

        printDetails("John", 25, 75.5);


        printDetails("Jane", 30);
    }


    public static void printDetails (String name,int age, double weight){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    public static void printDetails (String name,int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    }

