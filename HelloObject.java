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
