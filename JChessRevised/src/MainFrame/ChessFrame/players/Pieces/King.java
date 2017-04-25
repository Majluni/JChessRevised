package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

public class King extends Piece {

    public King(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    public Image returnPieceImage() {
        return icon.returnPieceIcon();
    }

    public Point returnPostion() {
        return (Point) p.clone();
    }

    public int returnX() {
        X = p.x;
        return X;
    }

    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    public Point getpixelPoint() {
        return pixelPoint;
    }

    public int returnY() {
        Y = p.y;
        return Y;
    }

    public void setPoint(Point newPoint) {
        old.x = p.x;
        old.y = p.y;

        p.x = newPoint.x;

        p.y = newPoint.y;

        X = p.x;
        Y = p.y;
    }

    public void toOld(Point Old) {

        p.x = Old.x;
        p.y = Old.y;

    }

    public Point returnOld() {
        return old;
    }

    public void setX(int newX) {
        X = newX;
        p.x = X;
    }

    public void setY(int newY) {
        Y = newY;
        p.y = Y;
    }

    public boolean Inthispostion(int x, int y) {
        if (p.x == x && p.y == y) {
            return true;//cant kill the king anymore;
        }
        return false;
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

    public String Tell_me() {
        return "King= (" + p.x + ',' + p.y + ")";
    }

}
