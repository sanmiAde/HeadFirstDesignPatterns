package chapter2

class CurrentConditionsDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var heatIndex: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and humidity $humidity. Heat index: $heatIndex")
    }

    override fun update(temp: Float, humidity: Float, pressure: Float,  heatIndex: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
}