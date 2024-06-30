import java.util.Scanner;

public class temperature{
    

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to choose conversion
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        double temperature;
        double convertedTemperature;
        
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
                break;
                
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
                break;
                
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
        
        scanner.close();
    }
}
