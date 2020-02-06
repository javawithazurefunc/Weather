package weather.function.Data;
import java.util.HashMap;
import java.util.Map;

public class WeatherData
{
    private Map<Integer, Integer> WeatherList = new HashMap<Integer, Integer>();

    private void Load()
    {
        WeatherList.put(1, 24);
        WeatherList.put(2, 12);
        WeatherList.put(3, 3);
    }

    public WeatherData() {
        super();
        Load();
    }

    public Integer GetWeatherByCountry(Integer countryId)
    {
        return WeatherList.get(countryId);
    }
}