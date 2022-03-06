abstract class Game() {
    abstract fun win(player: Player)
    abstract fun play()
    abstract fun verify(input: String): Boolean
    abstract fun ask(player: Player): String
    fun draw() {
        println("DRAW!")
    }
    fun welcome() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }
    fun ask1() {
        println("1. Masukkan pemain 1:")
    }
    fun ask2() {
        println("2. Masukkan pemain 2:")
    }
}
