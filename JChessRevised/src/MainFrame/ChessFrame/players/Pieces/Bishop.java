package MainFrame.ChessFrame.players.Pieces;

import java.awt.Point;

public class Bishop extends Piece {

    public Bishop(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    public boolean Canmove(int x, int y) {

        if ((x - y) == (X - Y)) {

            return true;

        } //////////////////////////////////////////////////////////////////////////////////////////
        else if ((x + y) == (X + Y)) {
            return true;

        } else {
            return false;
        }

    }

    public boolean checkKing(int x, int y, Point othersPostion) {

        int j = y;
        int i = x;

        if ((x - y) == (X - Y)) {
            if (x > X && y > Y) {
                while ((j != Y) && (i != X)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if (x < X && y < Y) {
                while ((j != Y) && (i != X)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        } else if (((x + y)) == ((X + Y))) {

            if ((X < i) && (Y > j)) {

                while (((j != Y)) && ((i != X))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

                        return true;
                    }

                }

            } else if ((X > i) && (Y < j)) {
                while ((j != X) && (i != X)) {
                    j--;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        }

        return false;
    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }
    
    public boolean PieceInMYway(int x, int y, Point othersPostion) {

        int j = y;
        int i = x;

        if ((x - y) == (X - Y)) {
            if (x > X && y > Y) {
                while ((j != Y + 1) && (i != X + 1)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if (x < X && y < Y) {
                while ((j != Y - 1) && (i != X - 1)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        } else if (((x + y)) == ((X + Y))) {

            if ((X < i) && (Y > j)) {

                while (((j != Y - 1)) && ((i != X + 1))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

                        return true;
                    }

                }

            } else if ((X > i) && (Y < j)) {
                while ((j != X + 1) && (i != X - 1)) {
                    j--;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        }

        return false;
    }
    
    public String toString() {
        return "Bishop to (" + p.x + ',' + p.y + ")";
    }
}
