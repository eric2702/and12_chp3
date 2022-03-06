class Referee(val player1: Player, val player2: Player) : Game() {
    val rpsArray = arrayOf("gunting", "batu", "kertas")
    override fun win(player: Player) {
        println("${player.name} MENANG!")
    }

    override fun play() {
        var input1 = ask(player1)
        var input2 = ask(player2)
        if (input1 == input2) {
            draw()
        } else {
            if (input1 == "gunting") {
                if (input2 == "batu") {
                    win(this.player2)
                } else {
                    win(this.player1)
                }
            } else if (input1 == "batu") {
                if (input2 == "kertas") {
                    win(this.player2)
                } else {
                    win(this.player1)
                }
            } else {
                if (input2 == "gunting") {
                    win(this.player2)
                } else {
                    win(this.player1)
                }
            }
        }
    }

    override fun verify(input: String): Boolean {
        if (rpsArray.indexOf(input) != -1) {
            return true
        }
        println("Tolong beri input yang sesuai!")
        return false
    }

    override fun ask(player: Player) : String {
        var input : String
        while (true) {
            if (player == player1) {
                ask1()
            } else {
                ask2()
            }
            input = readLine().toString().toLowerCase()
            if (verify(input)) {
                break
            }
        }
        return input
    }

}