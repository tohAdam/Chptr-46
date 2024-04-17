// Exercise 1
class HelloObject {
    private String greeting;

    public HelloObject(String greeting) {
        this.greeting = greeting;
    }

    public void greet() {
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println(greeting);
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        HelloObject obj = new HelloObject("Hello");
        obj.greet();
    }
}

// Exercise 2
class HelloObject {
    private String morningGreeting;
    private String eveningGreeting;

    public HelloObject(String morningGreeting, String eveningGreeting) {
        this.morningGreeting = morningGreeting;
        this.eveningGreeting = eveningGreeting;
    }

    public void greetMorning() {
        System.out.println(morningGreeting);
    }

    public void greetEvening() {
        System.out.println(eveningGreeting);
    }
}

public class Hello {
    public static void main(String[] args) {
        HelloObject obj = new HelloObject("Good morning World!", "Good evening World!");
        obj.greetMorning();
        obj.greetEvening();
    }
}

// Exercise 3

import java.util.Scanner;

class HelloObject {
    private String greeting;

    public HelloObject(String greeting) {
        this.greeting = greeting;
    }

    public void greet() {
        System.out.println(greeting);
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Greeting:");
        String userGreeting = scanner.nextLine();

        HelloObject obj = new HelloObject(userGreeting);
        obj.greet();
    }
}

//  Exercise4

class HelloObject {
    private String greeting;

    // Default constructor
    public HelloObject() {
        greeting = "Hello World!";
    }

    // Constructor with a greeting parameter
    public HelloObject(String greeting) {
        this.greeting = greeting; 
    }

    // Constructor that copies the greeting from another HelloObject
    public HelloObject(HelloObject init) {
        this.greeting = new String(init.greeting);
    }

    public void greet() {
        System.out.println(greeting);
    }
}

public class Hello {
    public static void main(String[] args) {
        HelloObject obj1 = new HelloObject("Hello Mars!");
        HelloObject obj2 = new HelloObject(obj1); // Using the additional constructor

        obj1.greet(); // Output: Hello Mars!
        obj2.greet(); // Output: Hello Mars!

        // Modify the greeting of obj2 to demonstrate that it's a separate object
        obj2.greet(); // Output: Hello Mars!
        obj2.greet(); // Output: Hello Mars!

        obj1.greet(); // Output: Hello Mars!
    }
}
