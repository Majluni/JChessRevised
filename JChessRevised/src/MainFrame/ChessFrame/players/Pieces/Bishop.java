
package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

public class Bishop {

  /** Creates a new instance of Elephent */
  private int X, Y;
  private Point pixelPoint = new Point();
  private int pixelX, pixelY;
  private boolean havelife = true;
  private PieceIcon PieceIcon;
  private Point p = new Point();
  private Point old = new Point();

  public Bishop(String NameIcon, int startX, int startY) {

    PieceIcon = new PieceIcon(NameIcon);

    X = startX;
    Y = startY;
    p.x = X;
    p.y = Y;
  }

  public boolean Canmove(int x, int y) {

    if ((x - y) == (X - Y)) {

      return true;

    }

    //////////////////////////////////////////////////////////////////////////////////////////
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
      }

      else if (x < X && y < Y) {
        while ((j != Y) && (i != X)) {
          j++;
          i++;

          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }

        }
      }
    }

    else if (((x + y)) == ((X + Y))) {

      if ((X < i) && (Y > j)) {

        while (((j != Y)) && ((i != X))) {
          j++;
          i--;

          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

            return true;
          }

        }

      }

      else if ((X > i) && (Y < j)) {
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

  public Point getpixelPoint() {
    return pixelPoint;
  }

  public int getPixelX() {
    return pixelX;
  }

  public int getPixelY() {
    return pixelY;
  }

  public boolean Inthispostion(int x, int y) {
    if (p.x == x && p.y == y) {
      return true;
    }
    return false;
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
      }

      else if (x < X && y < Y) {
        while ((j != Y - 1) && (i != X - 1)) {
          j++;
          i++;

          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }

        }
      }
    }

    else if (((x + y)) == ((X + Y))) {

      if ((X < i) && (Y > j)) {

        while (((j != Y - 1)) && ((i != X + 1))) {
          j++;
          i--;

          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

            return true;
          }

        }

      }

      else if ((X > i) && (Y < j)) {
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

  public boolean returnLife() {
    return havelife;
  }

  public Point returnOld() {
    return old;
  }

  public Image returnPieceImage() {
    return PieceIcon.returnPieceIcon();
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

    p.x = newPoint.x;

    p.y = newPoint.y;
    X = p.x;
    Y = p.y;

  }

  public void setX(int newX) {
    X = newX;
    p.x = newX;

  }

  public void setY(int newY) {
    Y = newY;
    p.y = Y;
  }

  public String Tell_me() {
    return "Elephent= (" + p.x + ',' + p.y + ")";
  }

  public void toOld(Point Old) {

    p.x = Old.x;
    p.y = Old.y;

  }

}
