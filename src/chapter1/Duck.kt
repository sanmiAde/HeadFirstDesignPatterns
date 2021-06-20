package chapter1


abstract class Duck {
    abstract val flyBehavior: FlyBehaviour
    abstract val quackBehavior : QuackBehaviour

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("All ducks float, even decoys")
    }
}

class MallardDuck : Duck() {
    override val flyBehavior: FlyBehaviour
        get() = FlyWithWings()
    override val quackBehavior: QuackBehaviour
        get() = Quack()
}