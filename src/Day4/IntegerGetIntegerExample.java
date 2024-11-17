package Day4;

public class IntegerGetIntegerExample {
    public static void main(String[] args) {
        // Setting a system property for demonstration
        System.setProperty("exampleProperty", "123");

        // Using getInteger(String nm)
        Integer propertyValue = Integer.getInteger("exampleProperty");
        System.out.println("Property value using getInteger(String nm): " + propertyValue); // Output: 123

        // Using getInteger(String nm) with a non-existent property
        Integer nonExistentProperty = Integer.getInteger("nonExistentProperty");
        System.out.println("Non-existent property value: " + nonExistentProperty); // Output: null

        // Using getInteger(String nm, int val)
        int defaultValue = Integer.getInteger("exampleProperty", 42);
        System.out.println("Non-existent property with default value: " + defaultValue); // Output: 42

        // Using getInteger(String nm, Integer val)
        Integer defaultIntegerValue = Integer.getInteger("exampleProperty", 100);
        System.out.println("Non-existent property with Integer default: " + defaultIntegerValue); // Output: 100
    }
}
