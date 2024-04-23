package basics2.StringsAndStringFormatting;

public class StringComparison {

    public static void main(String[] args) {

        String helloWorld = "Hello World";
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hellow World")){
            System.out.println("Values match exactly");
        }
    }
}
