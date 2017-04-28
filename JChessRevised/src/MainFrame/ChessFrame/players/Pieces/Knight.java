package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

public class Knight extends Piece {

    public Knight(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    public boolean Canmove(int x, int y) {

        if ((x + 1 == X) && (y + 2 == Y) || (x + 1 == X) && (y - 2 == Y) || (x - 1 == X) && (y + 2 == Y)
                || (x - 1 == X) && (y - 2 == Y) || (x + 2 == X) && (y + 1 == Y)
                || (x + 2 == X) && (y - 1 == Y) || (x - 2 == X) && (y + 1 == Y)
                || (x - 2 == X) && (y - 1 == Y)) {

            return true;
        } else {
            return false;
        }

    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public String toString() {
        return "Knight to (" + p.x + ',' + p.y + ")";
    }
}
