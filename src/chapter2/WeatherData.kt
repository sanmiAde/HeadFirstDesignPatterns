package chapter2

class WeatherData : Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f
    private var heatIndex: Float = 0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { observer: Observer ->
            observer.update(temperature, humidity, pressure, heatIndex)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        this.heatIndex = computeHeatIndex(temperature, humidity)
        measurementsChanged()
    }

   private fun computeHeatIndex(t: Float, rh: Float): Float {
        return (16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t * rh +
                0.00941695 * (t * t) + 0.00728898 * (rh * rh) +
                0.000345372 * (t * t * rh) - 0.000814971 * (t * rh * rh) +
                0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) + 0.0000291583 *
                (rh * rh * rh) + 0.00000142721 * (t * t * t * rh) +
                0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) +
                0.000000000843296 * (t * t * rh * rh * rh) -
                0.0000000000481975 * (t * t * t * rh * rh * rh)).toFloat()
    }
}
