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

    public Point getpixelPoint() {
        return pixelPoint;
    }

    public boolean Inthispostion(int x, int y) {
        if (p.x == x && p.y == y) {
            return true;
        }
        return false;
    }

    public Point returnOld() {
        return (Point) old.clone();

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

    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    public void setPoint(Point newPoint) {
        old.x = p.x;
        old.y = p.y;
        X = p.x = newPoint.x;
        Y = p.y = newPoint.y;
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
        return "Horse= (" + p.x + ',' + p.y + ")";
    }

    public void toOld(Point Old) {

        p.x = Old.x;
        p.y = Old.y;

    }
}
