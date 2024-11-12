package at.nedzhetin.OO_Programming.miniGame;

public class PlayerWrapper {

        public Character currentPlayer;
        public Character opponentPlayer;

        public PlayerWrapper(Character currentPlayer, Character opponentPlayer) {
            this.currentPlayer = currentPlayer;
            this.opponentPlayer = opponentPlayer;
        }

        public Character getCurrentPlayer() {
            return currentPlayer;
        }
        public Character getOpponentPlayer() {
            return opponentPlayer;
        }
}
