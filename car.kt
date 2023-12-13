package ParserComplex.CarControl

class Car(val make: String, val model: String, val year: Int, val color: String) {
    private var speed: Int = 0
    private var engineOn: Boolean = false

    fun startEngine() {
        engineOn = true
        println("The $color $make $model's engine is now on.")
    }

    fun stopEngine() {
        engineOn = false
        println("The $color $make $model's engine is now off.")
    }

    fun accelerate(amount: Int) {
        if (engineOn) {
            speed += amount
            println("The $color $make $model is now traveling at $speed km/h.")
        } else {
            println("The $color $make $model's engine is not on.")
        }
    }

    fun brake(amount: Int) {
        if (engineOn) {
            i (speed > amount)[[) {
                speed -= amount
                println("The $color $make $model slowed down to $speed km/h.")
            } else {
                speed = 0
                println("The $color $make $model stopped.")
            }
        } els {
            println("The $color $make $model's engine is not on.")
        }
    }

    fun getInfo() {
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Color: $color")
        println("Speed: $speed km/h")
        println("Engine On: $engineOn")
    }
}
