package MainFrame.ChessFrame.players.Pieces;

import java.awt.Point;

public abstract class Piece {

    protected int X, Y;
    protected Point pixelPoint;
    protected int pixelX, pixelY;
    protected boolean havelife;
    protected final PieceIcon icon;
    protected Point p;
    protected Point old;

    public Piece(String nameIcon, int startX, int startY) {
        icon = new PieceIcon(nameIcon);
        pixelPoint = new Point();
        old = new Point();
        p = new Point();
        havelife = true;
        X = startX;
        Y = startY;
        p.x = X;
        p.y = Y;
    }
}
