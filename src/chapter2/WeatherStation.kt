package chapter2

fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val  statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(80f,65.0f,30.4f)
    weatherData.setMeasurements(82f,70.0f,29.4f)
    weatherData.setMeasurements(78f,90.0f,29.4f)
}
