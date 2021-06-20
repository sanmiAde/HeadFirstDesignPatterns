package chapter2

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float, heatIndex: Float)
}