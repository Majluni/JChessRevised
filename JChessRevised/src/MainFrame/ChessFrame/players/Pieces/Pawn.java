package MainFrame.ChessFrame.players.Pieces;

import java.awt.Point;

public class Pawn extends Piece {

    private boolean movedBefore;
    private boolean isSeen;

    public Pawn(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
        movedBefore = false;
        isSeen = false;
    }

    public boolean Canmove(int x, int y, String typeColor) {

        if ((typeColor.equals("black"))) {
            if ((((y - 1 == Y) && (x == (X)))) /* &&!Check_Solider_Sees(x,y) */) {

                return true;

            } else if ((((y - 2 == Y) && (x == (X)))) && !movedBefore) {

                return true;
            } else if ((y - 1 == Y && x + 1 == (X) || (y - 1 == Y && x - 1 == (X))) && isSeen) {
                return true;
            } else {
                return false;
            }
        } else if (typeColor.equals("white")) {
            if (((y + 1 == Y) && (x == (X))) /* &&!Check_Solider_Sees(x,y) */) {
                return true;
            } else if ((((y + 2 == Y) && (x == (X)))) && !movedBefore) {
                return true;
            } else if ((y + 1 == Y && x + 1 == (X) || (y + 1 == Y && x - 1 == (X))) && isSeen) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public boolean PieceInMYway(int x, int y, Point othersPostion, String typeColor) {
        if (Y - y == 2 || Y - y == -2) {
            if ((typeColor.equals("black"))) {

                if ((((y - 1 == othersPostion.y) && (x == (othersPostion.x)))) && !movedBefore) {
                    return true;
                } else {
                    return false;
                }
            } else if (typeColor.equals("white")) {

                if (((y + 1 == othersPostion.y) && (x == (othersPostion.x)) && !movedBefore)) {

                    return true;

                } else {
                    return false;
                }
            }
        }

        return false;
    }

    public void setSeen(boolean newBoolean) {
        isSeen = newBoolean;
    }
    
    public boolean getSeen()
    {
        return isSeen;
    }

    @Override
    public void setPoint(Point newPoint) {
        super.setPoint(newPoint);
        movedBefore = true;
        isSeen = false;
    }

    public boolean setSeenbychecking(Point newP, String Color) {
        isSeen = false;
        if ((Color.equals("black"))) {
            if ((newP.y - 1 == Y && newP.x + 1 == (X) || (newP.y - 1 == Y && newP.x - 1 == (X)))) {

                isSeen = true;
                return true;
            } else {
                return false;
            }
        } else if (Color.equals("white")) {
            if ((newP.y + 1 == Y && newP.x + 1 == (X) || (newP.y + 1 == Y && newP.x - 1 == (X)))) {
                isSeen = true;

                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String toString() {
        return "Pawn to (" + p.x + ',' + p.y + ")";
    }
}
