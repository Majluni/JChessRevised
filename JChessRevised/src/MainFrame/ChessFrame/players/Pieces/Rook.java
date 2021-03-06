package MainFrame.ChessFrame.players.Pieces;

import java.awt.Point;

public class Rook extends Piece {

    public Rook(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    public boolean Canmove(int x, int y) {
        if (((y == Y) && (x > (X) || (x < (X))))) {
            return true;
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            return true;
        } else {

            return false;
        }

    }

    public boolean checkKing(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (((y == Y) && (x > (X) || (x < (X))))) {

            if ((X < i)) {
                while ((i != X)) {
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i)))// there Same Color piece
                    {
                        return true;
                    }
                }
            } else if ((X > i)) {
                while ((i != X)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            if ((Y < j)) {
                while ((j != Y)) {
                    j--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((Y > j)) {
                while ((j != Y)) {
                    j++;

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
        if (((y == Y) && (x > (X) || (x < (X))))) {

            if ((X < i)) {
                while ((i != X + 1)) {
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i)))// there Same Color piece
                    {
                        return true;
                    }
                }
            } else if ((X > i)) {
                while ((i != X - 1)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            if ((Y < j)) {
                while ((j != Y + 1)) {
                    j--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((Y > j)) {
                while ((j != Y - 1)) {
                    j++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public String toString() {
        return "Rook to (" + p.x + ',' + p.y + ")";
    }
}
