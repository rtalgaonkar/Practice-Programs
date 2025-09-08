package lambdaPrograms;

interface FunctionalInterface {
    void printHello();
}

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        FunctionalInterface ifI = () -> System.out.println("Hello World!");
        ifI.printHello();
    }
}
