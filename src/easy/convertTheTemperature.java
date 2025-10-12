package easy;

import java.util.stream.DoubleStream;

public class convertTheTemperature {
    public double[] convertTemperature(double celsius) {

        return DoubleStream.of(celsius)
                .flatMap(d-> DoubleStream.of(
                        d + 273.15,
                        d * 1.80 + 32.00
                ))
                .toArray();
    }
}

/*Basic answer

double kelvin= celsius + 273.15;
        double fahrenheit = celsius * 1.80 +32.00;
        double[] ans= {kelvin,fahrenheit};

        return ans;
 */