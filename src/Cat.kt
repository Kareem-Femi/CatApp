class Cat (val name: String, var age: Int, var weight: Int) {

    fun eat() {
        weight++
    }
    fun walk() {
        weight--
    }

    override fun toString() : String {
        return "Name: $name Age: $age"
    }
}
