public class MainMethod {

    // Public method to add two numbers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an object of the class
        AddTwoNumbers obj = new AddTwoNumbers();
        
        // Declare and initialize two numbers
        int num1 = 10;
        int num2 = 20;
        
        // Call the public method to add the numbers
        int sum = obj.addNumbers(num1, num2);
        
        // Display the result
        System.out.println("The sum is: " + sum);
    }
}
