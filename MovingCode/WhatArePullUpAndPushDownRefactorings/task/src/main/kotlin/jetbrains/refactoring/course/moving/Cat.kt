package jetbrains.refactoring.course.moving

class Cat(override val name: String, override val age: Int) : Animal {

    override fun eat() {
        println("$name the cat is eating.")
    }

    override fun sleep() {
        println("$name the cat is sleeping.")
    }

    override fun bark() {
        println("$name the animal is barking.")
    }

    fun meow() {
        println("$name the animal is meowing.")
    }

    override fun play() {
        println("$name the cat is playing.")
    }
}
