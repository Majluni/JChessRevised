package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

public abstract class Piece {

    protected int X, Y;
    protected Point pixelPoint;
    protected final PieceIcon icon;
    protected Point p;
    protected Point old;

    public Piece(String nameIcon, int startX, int startY) {
        icon = new PieceIcon(nameIcon);
        pixelPoint = new Point();
        old = new Point();
        p = new Point();
        X = startX;
        Y = startY;
        p.x = X;
        p.y = Y;
    }
 
    public PieceIcon returnPieceIcon()
    {
        return icon;
    }
    
    public Image getPieceImage()
    {
        return icon.image;
    }
    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Point returnPixelPoint() {
        return pixelPoint;
    }

    public void setPixelPoint(Point pixelPoint) {
        this.pixelPoint = pixelPoint;
    }

    public Point getP() {
        return p;
    }

    public Point getPixelPoint()
    {
        return pixelPoint;
    }
    
    public void setP(Point p) {
        this.p = p;
    }

    public Point getOld() {
        return old;
    }

    public void setOld(Point old) {
        this.old = old;
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

    public void toOld(Point Old) {
        p.x = Old.x;
        p.y = Old.y;
    }

    public boolean checkSamePosition(int x, int y) {
        return p.x == x && p.y == y;
    }
}
