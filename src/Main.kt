fun main() {
    var player1 = Player("Player 1")
    var player2 = Player("Player 2")
    var referee = Referee(player1, player2)
    referee.welcome()
    referee.play()
}