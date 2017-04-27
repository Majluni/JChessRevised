package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

public class Pawn extends Piece {

    private boolean movedbefore;
    private boolean myseen = false;

    public Pawn(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    public boolean Canmove(int x, int y, String typeColor) {

        if ((typeColor.equals("black"))) {
            if ((((y - 1 == Y) && (x == (X)))) /* &&!Check_Solider_Sees(x,y) */) {

                return true;

            } else if ((((y - 2 == Y) && (x == (X)))) && !movedbefore) {

                return true;
            } else return (y - 1 == Y && x + 1 == (X) || (y - 1 == Y && x - 1 == (X))) && myseen;
        } else if (typeColor.equals("white")) {
            if (((y + 1 == Y) && (x == (X))) /* &&!Check_Solider_Sees(x,y) */) {
                return true;
            } else if ((((y + 2 == Y) && (x == (X)))) && !movedbefore) {
                return true;
            } else return (y + 1 == Y && x + 1 == (X) || (y + 1 == Y && x - 1 == (X))) && myseen;
        }
        return false;

    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public Point getpixelPoint() {
        return pixelPoint;
    }

    public boolean Inthispostion(int x, int y) {
        return p.x == x && p.y == y;
    }

    public boolean PieceInMYway(int x, int y, Point othersPostion, String typeColor) {
        if (Y - y == 2 || Y - y == -2) {
            if ((typeColor.equals("black"))) {

                return (((y - 1 == othersPostion.y) && (x == (othersPostion.x)))) && !movedbefore;
            } else if (typeColor.equals("white")) {

                return (y + 1 == othersPostion.y) && (x == (othersPostion.x)) && !movedbefore;
            }
        }

        return false;
    }

    public boolean returnMyseen() {
        return myseen;
    }

    public Point returnOld() {
        return old;
    }

    public Image returnPieceImage() {
        return icon.returnPieceIcon();
    }

    public Point returnPostion() {
        return (Point) p.clone();
    }

    public int returnX() {
        return X;
    }

    public int returnY() {
        return Y;
    }

    public void setMYseen(boolean newBoolean) {
        myseen = newBoolean;
    }

    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    public void setPoint(Point newPoint) {
        old.x = p.x;
        old.y = p.y;
        X = p.x = newPoint.x;
        Y = p.y = newPoint.y;
        p.x = X;
        p.y = Y;
        movedbefore = true;
        myseen = false;
    }

    public boolean setSeenbychecking(Point newP, String Color) {
        myseen = false;
        if ((Color.equals("black"))) {
            if ((newP.y - 1 == Y && newP.x + 1 == (X) || (newP.y - 1 == Y && newP.x - 1 == (X)))) {

                myseen = true;
                return true;
            } else {
                return false;
            }
        } else if (Color.equals("white")) {
            if ((newP.y + 1 == Y && newP.x + 1 == (X) || (newP.y + 1 == Y && newP.x - 1 == (X)))) {
                myseen = true;

                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void setX(int newX) {
        X = newX;
        p.x = X;
    }

    public void setY(int newY) {
        Y = newY;
        p.y = Y;
    }

    public String Tell_me() {
        return "Soldier= (" + p.x + ',' + p.y + ")";
    }

    public void toOld(Point Old) {

        p.x = Old.x;
        p.y = Old.y;

    }

}
