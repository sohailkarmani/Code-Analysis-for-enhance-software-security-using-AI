// TemperatureConverterEnhanced.java

public class _97 {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        _97 converter = new _97();
        System.out.println("25°C = " + converter.celsiusToFahrenheit(25) + "°F");
        System.out.println("300K = " + converter.kelvinToCelsius(300) + "°C");
    }
}
