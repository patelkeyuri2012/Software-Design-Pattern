public class Main {
    public static void main(String[] args) {
        IO upperCaseIO = new UpperCaseDecorator(new ConsoleIO());
        System.out.print("\nEnter something in lower case: ");
        String upperInput = upperCaseIO.read();
        System.out.println("Uppercase input: " + upperInput);

        IO lowerCaseIO = new LowerCaseDecorator(new ConsoleIO());
        System.out.print("\nEnter something in upper case: ");
        String lowerInput = lowerCaseIO.read();
        System.out.println("Lowercase input: " + lowerInput);

        IO reverseIO = new ReverseDecorator(new ConsoleIO());
        System.out.print("\nEnter something: ");
        String input = reverseIO.read();
        System.out.println("Reversed input: " + input);
    }
}
