package MainFrame.ChessFrame.players.Pieces;

import java.awt.Point;

public class King extends Piece {

    public King(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    public boolean Canmove(int x, int y) {

        if (((y == Y) && (x == (X - 1))) || ((y == Y - 1) && (x == (X + 1)))
                || ((y == Y - 1) && (x == (X - 1))) || ((y == Y + 1) && (x == (X + 1)))
                || (((y == Y + 1) && x == (X - 1))) || ((y == Y) && (x == (X + 1)))
                || ((y == Y - 1) && x == ((X))) || ((y == Y + 1) && (x == (X)))) {

            return true;
        }

        return false;

    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public String toString() {
        return "King to (" + p.x + ',' + p.y + ")";
    }

}
