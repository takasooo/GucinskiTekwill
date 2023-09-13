package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {

        TemperatureConverter Converter = new TemperatureConverter();
        System.out.println(Converter.toCelsius(97.88f));
        System.out.println(Converter.toFahrenheit(36.6f));
    }

    public float toFahrenheit(float temperature){
        return temperature * ((float) 9/5) + 32;
    }

    public float toCelsius(float temperature){
        return (float) 5 / 9 * (temperature-32);
    }
}
