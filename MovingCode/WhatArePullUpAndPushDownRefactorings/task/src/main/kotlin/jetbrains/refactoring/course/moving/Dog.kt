package jetbrains.refactoring.course.moving

class Dog(override val name: String, override val age: Int) : Animal {

    override fun eat() {
        println("$name the dog is eating.")
    }

    override fun sleep() {
        println("$name the dog is sleeping.")
    }

    override fun bark() {
        println("$name the dog is barking.")
    }

    fun meow() {
        println("$name the animal is meowing.")
    }

    override fun play() {
        println("$name the dog is playing.")
    }
}
