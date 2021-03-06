
import java.util.Scanner;

public class HelloWorld {

    private final String string;

    public HelloWorld(String string) {
        this.string = string;
    }

    public String getName() {
        return this.string;
    }

    public String sayHello(){
        return "Hello, " + getName().substring(0,1).toUpperCase()
                + getName().substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Replace the word 'World' in [Hello World] with any word of your choice: ");
        String word = scanner.nextLine();

        HelloWorld helloWorld = new HelloWorld(word);
        System.out.println(helloWorld.sayHello());

    }


}
