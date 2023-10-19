package TheTemperatureConverter;

import java.util.Scanner;

public class TheTemperatureConverterApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Celsius Degree : ");
		double Cel = scan.nextDouble();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double cell = temperatureConverter.convertFahrenheitToCelsius(Cel);
		System.out.println(cell);
		
		scan.close();
		
		
	}

}
