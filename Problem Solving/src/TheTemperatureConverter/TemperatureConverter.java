package TheTemperatureConverter;

public class TemperatureConverter {
	public double convertFahrenheitToCelsius(double F)
	{
		double C = (F - 32) * 5/9 ;
		
		return C;
	}

}
