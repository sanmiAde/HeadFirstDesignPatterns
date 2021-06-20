package chapter1


interface FlyBehaviour {
    fun fly() : Unit
}

class FlyWithWings : FlyBehaviour {
    override fun fly() {
        println("I'm flying.")
    }
}

class FlyNoWay : FlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}