
package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

public class Rook {

  private int X, Y;
  private int pixelX, pixelY;
  private Point pixelPoint = new Point();
  private boolean havelife = true;
  private PieceIcon PieceIcon;
  private Point p = new Point();
  private Point old = new Point();

  public Rook(String NameIcon, int startX, int startY) {

    PieceIcon = new PieceIcon(NameIcon);

    X = startX;
    Y = startY;
    p.x = X;
    p.y = Y;
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
    X = p.x;
    return X;
  }

  public int returnY() {
    Y = p.y;
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
    p.x = newX;
  }

  public void setY(int newY) {
    Y = newY;
    p.y = newY;
  }

  public String Tell_me() {
    return "Castle= (" + p.x + ',' + p.y + ")";
  }

  public void toOld(Point Old) {

    p.x = Old.x;
    p.y = Old.y;

  }
}
