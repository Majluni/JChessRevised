package MainFrame.ChessFrame.players;

import MainFrame.ChessFrame.players.Pieces.Rook;
import MainFrame.ChessFrame.players.Pieces.Bishop;
import MainFrame.ChessFrame.players.Pieces.Knight;
import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.Pawn;
import MainFrame.ChessFrame.players.Pieces.King;
import java.awt.Image;
import java.awt.Point;

public class Player2 {

    private Rook BC1;
    private Rook BC2;
    private Knight BH1;
    private Knight BH2;
    private Bishop BE1;
    private Bishop BE2;
    private Queen BQ;
    private King BK;
    private Pawn[] BS = new Pawn[8];
    private int choosenOne;
    private int inHand = -1;
    private boolean kingischeck = false;
    private Point other;
    private int ate_to_protect;

    private String Color = "black";

    /**
     * Creates a new instance of player2
     */
    public Player2() {
        String fileSeparator = new String(System.getProperty("file.separator"));
        BC1 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "br.gif", 1, 1);
        BC2 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "br.gif", 8, 1);
        BH1 = new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bn.gif", 2, 1);
        BH2 = new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bn.gif", 7, 1);
        BE1 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bb.gif", 3, 1);
        BE2 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bb.gif", 6, 1);
        BQ = new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bq.gif", 4, 1);
        BK = new King("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bk.gif", 5, 1);
        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            BS[i] = new Pawn("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bp.gif", j, 2);
        }
    }

    public Point getPositionOfPiece(int i) {

        switch (i) {
            case 1:
                return BC1.getP();
            case 2:
                return BC2.getP();
            case 3:
                return BH1.getP();
            case 4:
                return BH2.getP();
            case 5:
                return BE1.getP();
            case 6:
                return BE2.getP();
            case 7:
                return BQ.getP();
            case 8:
                return BK.getP();
            case 9:
                return BS[0].getP();
            case 10:
                return BS[1].getP();
            case 11:
                return BS[2].getP();
            case 12:
                return BS[3].getP();
            case 13:
                return BS[4].getP();
            case 14:
                return BS[5].getP();
            case 15:
                return BS[6].getP();
            case 16:
                return BS[7].getP();

        }
        return new Point(-1, -1);

    }

    public Point getPieceOldPosition(int i) {

        switch (i) {
            case 1:
                return BC1.getOld();
            case 2:
                return BC2.getOld();
            case 3:
                return BH1.getOld();
            case 4:
                return BH2.getOld();
            case 5:
                return BE1.getOld();
            case 6:
                return BE2.getOld();
            case 7:
                return BQ.getOld();
            case 8:
                return BK.getOld();
            case 9:
                return BS[0].getOld();
            case 10:
                return BS[1].getOld();
            case 11:
                return BS[2].getOld();
            case 12:
                return BS[3].getOld();
            case 13:
                return BS[4].getOld();
            case 14:
                return BS[5].getOld();
            case 15:
                return BS[6].getOld();
            case 16:
                return BS[7].getOld();

        }
        return new Point(-1, -1);

    }

    public Image returnIconImage(int i) {
        switch (i) {
            case 1:
                return BC1.getPieceImage();
            case 2:
                return BC2.getPieceImage();
            case 3:
                return BH1.getPieceImage();
            case 4:
                return BH2.getPieceImage();
            case 5:
                return BE1.getPieceImage();
            case 6:
                return BE2.getPieceImage();
            case 7:
                return BQ.getPieceImage();
            case 8:
                return BK.getPieceImage();
            case 9:
                return BS[0].getPieceImage();
            case 10:
                return BS[1].getPieceImage();
            case 11:
                return BS[2].getPieceImage();
            case 12:
                return BS[3].getPieceImage();
            case 13:
                return BS[4].getPieceImage();
            case 14:
                return BS[5].getPieceImage();
            case 15:
                return BS[6].getPieceImage();
            case 16:
                return BS[7].getPieceImage();

        }
        return null;

    }

    public void changePostion(Point newPoint, int i) {
        switch (i) {
            case 1:
                BC1.setPoint(newPoint);
                break;
            case 2:
                BC2.setPoint(newPoint);
                break;
            case 3:
                BH1.setPoint(newPoint);
                break;
            case 4:
                BH2.setPoint(newPoint);
                break;
            case 5:
                BE1.setPoint(newPoint);
                break;
            case 6:
                BE2.setPoint(newPoint);
                break;
            case 7:
                BQ.setPoint(newPoint);
                break;
            case 8:
                BK.setPoint(newPoint);
                break;
            case 9:
                BS[0].setPoint(newPoint);
                break;
            case 10:
                BS[1].setPoint(newPoint);
                break;
            case 11:
                BS[2].setPoint(newPoint);
                break;
            case 12:
                BS[3].setPoint(newPoint);
                break;
            case 13:
                BS[4].setPoint(newPoint);
                break;
            case 14:
                BS[5].setPoint(newPoint);
                break;
            case 15:
                BS[6].setPoint(newPoint);
                break;
            case 16:
                BS[7].setPoint(newPoint);
                break;

        }

    }

    public void changePostionToOld(Point newPoint, int i) {
        switch (i) {
            case 1:
                BC1.toOld(newPoint);
                break;
            case 2:
                BC2.toOld(newPoint);
                break;
            case 3:
                BH1.toOld(newPoint);
                break;
            case 4:
                BH2.toOld(newPoint);
                break;
            case 5:
                BE1.toOld(newPoint);
                break;
            case 6:
                BE2.toOld(newPoint);
                break;
            case 7:
                BQ.toOld(newPoint);
                break;
            case 8:
                BK.toOld(newPoint);
                break;
            case 9:
                BS[0].toOld(newPoint);
                break;
            case 10:
                BS[1].toOld(newPoint);
                break;
            case 11:
                BS[2].toOld(newPoint);
                break;
            case 12:
                BS[3].toOld(newPoint);
                break;
            case 13:
                BS[4].toOld(newPoint);
                break;
            case 14:
                BS[5].toOld(newPoint);
                break;
            case 15:
                BS[6].toOld(newPoint);
                break;
            case 16:
                BS[7].toOld(newPoint);
                break;

        }

    }

    public void changePixel(int newPixelX, int newPixelY) {
        switch (choosenOne) {
            case 1:
                BC1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                BC2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                BH1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                BH2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                BE1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                BE2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                BQ.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                BK.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                BS[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                BS[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                BS[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                BS[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                BS[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                BS[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                BS[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                BS[7].setPixels(newPixelX, newPixelY);
                break;

        }
    }

    public Point getPixelPoint(int i) {
        choosenOne = i;
        switch (choosenOne) {
            case 1:
                return BC1.getPixelPoint();
            case 2:
                return BC2.getPixelPoint();
            case 3:
                return BH1.getPixelPoint();
            case 4:
                return BH2.getPixelPoint();
            case 5:
                return BE1.getPixelPoint();
            case 6:
                return BE2.getPixelPoint();
            case 7:
                return BQ.getPixelPoint();
            case 8:
                return BK.getPixelPoint();
            case 9:
                return BS[0].getPixelPoint();
            case 10:
                return BS[1].getPixelPoint();
            case 11:
                return BS[2].getPixelPoint();
            case 12:
                return BS[3].getPixelPoint();
            case 13:
                return BS[4].getPixelPoint();
            case 14:
                return BS[5].getPixelPoint();
            case 15:
                return BS[6].getPixelPoint();
            case 16:
                return BS[7].getPixelPoint();

        }
        return null;
    }

    public void changePixel(int newPixelX, int newPixelY, int i) {
        choosenOne = i;
        switch (choosenOne) {
            case 1:
                BC1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                BC2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                BH1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                BH2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                BE1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                BE2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                BQ.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                BK.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                BS[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                BS[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                BS[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                BS[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                BS[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                BS[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                BS[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                BS[7].setPixels(newPixelX, newPixelY);
                break;

        }
    }

    public boolean Killedpiec(int i) {
        Point out = new Point(20, 20);
        switch (i) {
            case 1:
                BC1.setPoint(out);
                return true;
            case 2:
                BC2.setPoint(out);
                return true;
            case 3:
                BH1.setPoint(out);
                return true;
            case 4:
                BH2.setPoint(out);
                return true;
            case 5:
                BE1.setPoint(out);
                return true;
            case 6:
                BE2.setPoint(out);
                return true;
            case 7:
                BQ.setPoint(out);
                return true;
            case 8:
                return true;// the King "Can't be moved out"
            case 9:
                BS[0].setPoint(out);
                return true;
            case 10:
                BS[1].setPoint(out);
                return true;
            case 11:
                BS[2].setPoint(out);
                return true;
            case 12:
                BS[3].setPoint(out);
                return true;
            case 13:
                BS[4].setPoint(out);
                return true;
            case 14:
                BS[5].setPoint(out);
                return true;
            case 15:
                BS[6].setPoint(out);
                return true;
            case 16:
                BS[7].setPoint(out);
                return true;
        }
        return false;
    }

    public boolean checkthemove(Point newP, int i) {
        choosenOne = i;
        switch (choosenOne) {

            case 1:
                return BC1.Canmove(newP.x, newP.y);
            case 2:
                return BC2.Canmove(newP.x, newP.y);
            case 3:
                return BH1.Canmove(newP.x, newP.y);
            case 4:
                return BH2.Canmove(newP.x, newP.y);
            case 5:
                return BE1.Canmove(newP.x, newP.y);
            case 6:
                return BE2.Canmove(newP.x, newP.y);
            case 7:
                return BQ.Canmove(newP.x, newP.y);
            case 8:
                return BK.Canmove(newP.x, newP.y);
            case 9:
                return BS[0].Canmove(newP.x, newP.y, Color);
            case 10:
                return BS[1].Canmove(newP.x, newP.y, Color);
            case 11:
                return BS[2].Canmove(newP.x, newP.y, Color);
            case 12:
                return BS[3].Canmove(newP.x, newP.y, Color);
            case 13:
                return BS[4].Canmove(newP.x, newP.y, Color);
            case 14:
                return BS[5].Canmove(newP.x, newP.y, Color);
            case 15:
                return BS[6].Canmove(newP.x, newP.y, Color);
            case 16:
                return BS[7].Canmove(newP.x, newP.y, Color);
        }
        return false;
    }

    public boolean setSeentoSiliders(int i, Point P) {

        switch (i) {
            case 9:
                return BS[0].setSeenbychecking(P, "black");
            case 10:
                return BS[1].setSeenbychecking(P, "black");
            case 11:
                return BS[2].setSeenbychecking(P, "black");
            case 12:
                return BS[3].setSeenbychecking(P, "black");
            case 13:
                return BS[4].setSeenbychecking(P, "black");
            case 14:
                return BS[5].setSeenbychecking(P, "black");
            case 15:
                return BS[6].setSeenbychecking(P, "black");
            case 16:
                return BS[7].setSeenbychecking(P, "black");
        }
        return false;

    }

    public boolean returnsoliderSeen(int i) {
        switch (i) {

            case 9:
                return BS[0].getSeen();
            case 10:
                return BS[1].getSeen();
            case 11:
                return BS[2].getSeen();
            case 12:
                return BS[3].getSeen();
            case 13:
                return BS[4].getSeen();
            case 14:
                return BS[5].getSeen();
            case 15:
                return BS[6].getSeen();
            case 16:
                return BS[7].getSeen();
        }
        return false;
    }

    public boolean checktheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {
            case 1:
                return BC1.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 2:
                return BC2.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 5:
                return BE1.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 6:
                return BE2.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 7:
                return BQ.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 9:
                return BS[0].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 10:
                return BS[1].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 11:
                return BS[2].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 12:
                return BS[3].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 13:
                return BS[4].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 14:
                return BS[5].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 15:
                return BS[6].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 16: {
                return BS[7].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            }

        }
        return false;
    }

    public boolean checKing(Point p1, Point p2, int i) {
        switch (i) {

            case 1:
                return BC1.checkKing(p1.x, p1.y, p2);
            case 2:
                return BC2.checkKing(p1.x, p1.y, p2);
            case 3:
                return BH1.Canmove(p1.x, p1.y);
            case 4:
                return BH2.Canmove(p1.x, p1.y);
            case 5:
                return BE1.checkKing(p1.x, p1.y, p2);
            case 6:
                return BE2.checkKing(p1.x, p1.y, p2);
            case 7:
                return BQ.checkKing(p1.x, p1.y, p2);

            case 9:
                return BS[0].Canmove(p1.x, p1.y, Color);
            case 10:
                return BS[1].Canmove(p1.x, p1.y, Color);
            case 11:
                return BS[2].Canmove(p1.x, p1.y, Color);
            case 12:
                return BS[3].Canmove(p1.x, p1.y, Color);
            case 13:
                return BS[4].Canmove(p1.x, p1.y, Color);
            case 14:
                return BS[5].Canmove(p1.x, p1.y, Color);
            case 15:
                return BS[6].Canmove(p1.x, p1.y, Color);
            case 16:
                return BS[7].Canmove(p1.x, p1.y, Color);
        }
        return false;
    }

    public int returnChosen() {
        return choosenOne;
    }

    public void SetInhand(int i) {
        inHand = i;
    }

    public int GetInhand() {
        return inHand;
    }

    public boolean CanMove(int x, int y) {
        return true;
    }

    public void checkKing(boolean newkingcheck) {
        kingischeck = newkingcheck;
    }

    public boolean returncheckKing() {
        return kingischeck;
    }

    public boolean seeIfChecked(Player1 White) {

        Point My_King_Postion = BK.getP();
        boolean flag = false;

        //////////    Start Checking the King ////////////
        for (int i = 17; i < 33; i++) {
            if (i < 25) {
                if (White.checkthemove(My_King_Postion, i)) {

                    flag = true;
                    for (int j = 1; j < 33; j++) {

                        if (j < 17) {

                            if (White.checktheWay(My_King_Postion, getPositionOfPiece(j), i)) {
                                //Means there is somting in the Way so can't move'

                                flag = false;

                            }
                        } else {

                            if (j != 8) {
                                if (White.checktheWay(My_King_Postion, White.getPiecePosition(j), i)) {

                                    flag = false;
                                    //Means there is somting in the Way so can't move'

                                }
                            }

                        }

                    }

                    if (flag) {

                        break;
                    }

                }
            } else {
                // For soliders
                if (White.setSeentoSiliders(i, My_King_Postion)) {

                    break;

                }
            }
            //   if(stillIn_Check){ return true;}//Here Means White King is in check !!!
            if (i == 32) {

                return false;
            }
        }

        return true;
    }

    public boolean Check_Mate_GameOver(Player1 Enemy) {

        if (!KingGenerate_moves(Enemy)) {

            inHand = -1;
            System.out.println("I Killed King  2");

            return false;
        } else if (!CastleGenerate_moves(Enemy, BC1)) {

            inHand = -1;
            System.out.println("I Killed Rook 2");

            return false;
        } else if (!CastleGenerate_moves(Enemy, BC2)) {

            inHand = -1;
            System.out.println("I Killed Rook 2");
            return false;
        } else if (!ElephentGenerate_moves(Enemy, BE1)) {

            inHand = -1;
            System.out.println("I Killed ELephent2");
            return false;
        } else if (!ElephentGenerate_moves(Enemy, BE2)) {

            inHand = -1;
            System.out.println("I Killed ELephent2");

            return false;
        } else if (!HosreGenerate_moves(Enemy, BH1)) {

            inHand = -1;
            System.out.println("I Killed Knight 2");
            return false;
        } else if (!HosreGenerate_moves(Enemy, BH2)) {

            inHand = -1;
            System.out.println("I Killed Knight 2");
            return false;
        } else if (!QueenGenerate_moves(Enemy)) {

            inHand = -1;
            System.out.println("I Killed Queen 2");
            return false;
        }

        for (int i = 0; i <= 7; i++) {
            inHand = 9 + i;
            if (!GeneratePawnMoves(Enemy, BS[i])) {

                inHand = -1;

                System.out.println("I Killed Pawn 2");

                return false;
            }
        }

        inHand = -1;
        return true;

    }

    public boolean Pice_already_there(Point newP) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            if (GetInhand() != i)// There is no need to check the inHand pice
            {

                //Check if there is White Pices in the new Point
                //If so we Can't move (Same Color)!!
                samePostion = getPositionOfPiece(i);
                if (newP.x == samePostion.x && newP.y == samePostion.y) {

                    return false;

                }
            }
        }

        return true;
    }

    public boolean Pice_already_there_from_enemy(Point newP, Player1 enemy) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {

            //Check if there is White Pices in the new Point
            //If so we Can't move (Same Color)!!
            samePostion = enemy.getPiecePosition(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {

                return false;

            }

        }

        return true;
    }

    public int Get_Pice_already_there_from_enemy(Point newP, Player1 enemy) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {
            samePostion = enemy.getPiecePosition(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {
                return i;
            }
        }
        return -1;
    }

    public boolean KingGenerate_moves(Player1 enemy) {
        boolean somthing_killed = false;
        Point Oldp = new Point();

        Point PlaceCheck = new Point();
        inHand = 8;

        int x = BK.getX();
        int y = BK.getY();

        Oldp.x = x;
        Oldp.y = y;

        if (x + 1 <= 8) {

            BK.setX(x + 1);
            BK.setY(y);
            PlaceCheck.x = x + 1;
            PlaceCheck.y = y;

            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    BK.setPoint(Oldp);
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    return false;
                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y + 1 <= 8) {

            BK.setX(x);
            BK.setY(y + 1);
            PlaceCheck.x = x;
            PlaceCheck.y = y + 1;
            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    BK.setPoint(Oldp);
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    return false;

                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        if (y - 1 > 0) {

            BK.setX(x);
            BK.setY(y - 1);

            PlaceCheck.x = x;
            PlaceCheck.y = y - 1;

            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }

            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    BK.setPoint(Oldp);
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }

                    return false;
                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (x - 1 > 0) {

            BK.setX(x - 1);
            BK.setY(y);

            PlaceCheck.x = x - 1;
            PlaceCheck.y = y;
            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    BK.setPoint(Oldp);
                    return false;
                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {

            BK.setX(x - 1);
            BK.setY(y - 1);

            PlaceCheck.x = x - 1;
            PlaceCheck.y = y - 1;

            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    BK.setPoint(Oldp);
                    return false;
                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {

            BK.setX(x + 1);
            BK.setY(y + 1);

            PlaceCheck.x = x + 1;
            PlaceCheck.y = y + 1;
            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    BK.setPoint(Oldp);
                    return false;
                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            BK.setX(x + 1);
            BK.setY(y - 1);

            PlaceCheck.x = x + 1;
            PlaceCheck.y = y - 1;
            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    BK.setPoint(Oldp);
                    return false;
                }
            }

        }
        BK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {

            BK.setX(x - 1);
            BK.setY(y + 1);

            PlaceCheck.x = x - 1;
            PlaceCheck.y = y + 1;
            if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    BK.setPoint(Oldp);
                    return false;
                }
            }

        }

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        BK.setPoint(Oldp);
        return true;

    }

    public boolean CastleGenerate_moves(Player1 enemy, Rook BC) {
        boolean somthing_killed = false;
        Point Oldp1 = new Point();

        Point PlaceCheck = new Point();
        int x1 = BC.getX();
        int y1 = BC.getY();

        if (BC == BC1) {
            inHand = 1;
        } else {
            inHand = 2;
        }
        /////////////////////

        Oldp1.x = x1;
        Oldp1.y = y1;

        PlaceCheck.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {

                BC.setX(i);
                PlaceCheck.x = i;

                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }

                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            BC.setX(Oldp1.x);
                            BC.setY(Oldp1.y);

                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            BC.setX(Oldp1.x);
            PlaceCheck.x = Oldp1.x;

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }
            for (int i = 1; i <= 8; i++) {
                BC.setY(i);
                PlaceCheck.y = i;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            BC.setX(Oldp1.x);
                            BC.setY(Oldp1.y);

                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            BC.setY(Oldp1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        BC.setX(Oldp1.x);
        BC.setY(Oldp1.y);
        return true;
    }

    public boolean ElephentGenerate_moves(Player1 enemy, Bishop BE) {
        boolean somthing_killed = false;
        Point Oldp1 = new Point();
        Point PlaceCheck = new Point();

        Oldp1 = BE.getP();

        if (BE == BE1) {
            inHand = 5;
        } else {
            inHand = 6;
        }

        if (Oldp1.x != 20) {
            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {

                BE.setX(x);
                BE.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {

                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            BE.setPoint(Oldp1);
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }
            for (int x = Oldp1.x, y = Oldp1.y; y >= 1 && x <= 8; x++, y--) {

                BE.setX(x);
                BE.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            BE.setPoint(Oldp1);
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            BE.setPoint(Oldp1);

        }

        BE.setPoint(Oldp1);

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        return true;
    }

    public boolean HosreGenerate_moves(Player1 enemy, Knight BH) {
        Point oldp1 = new Point();
        boolean somthing_killed = false;
        oldp1 = BH.getP();

        Point PlaceCheck = new Point();

        if (BH == BH1) {
            inHand = 3;
        } else {
            inHand = 4;
        }

        int x = oldp1.x;
        int y = oldp1.y;

        if (x != 20) {

            if (x + 1 <= 8 && y + 1 <= 8) {
                BH.setX(x + 1);
                BH.setY(y + 2);
                PlaceCheck.x = x + 1;
                PlaceCheck.y = y + 2;

                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        BH.setPoint(oldp1);

                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }

                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x + 1 <= 8 && y - 2 >= 1) {
                BH.setX(x + 1);
                BH.setY(y - 2);
                PlaceCheck.x = x + 1;
                PlaceCheck.y = y - 2;
                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                BH.setX(x + 2);
                BH.setY(y + 1);
                PlaceCheck.x = x + 2;
                PlaceCheck.y = y + 1;

                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                BH.setX(x + 2);
                BH.setY(y - 1);
                PlaceCheck.x = x + 2;
                PlaceCheck.y = y - 1;
                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                BH.setX(x - 1);
                BH.setY(y + 2);
                PlaceCheck.x = x - 1;
                PlaceCheck.y = y + 2;

                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                BH.setX(x - 1);
                BH.setY(y - 2);
                PlaceCheck.x = x - 1;
                PlaceCheck.y = y - 2;
                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                BH.setX(x - 2);
                BH.setY(y + 1);
                PlaceCheck.x = x - 2;
                PlaceCheck.y = y + 1;

                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }
                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                BH.setX(x - 2);
                BH.setY(y - 1);
                PlaceCheck.x = x - 2;
                PlaceCheck.y = y - 1;

                if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        BH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

        }
        BH.setPoint(oldp1);

        return true;
    }

    public boolean QueenGenerate_moves(Player1 enemy) {
        boolean somthing_killed = false;

        Point Oldp1 = new Point();

        Oldp1 = BQ.getP();

        Point PlaceCheck = new Point();

        inHand = 7;

        if (Oldp1.x != 20) {
            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {

                BQ.setX(x);
                BQ.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }

                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            BQ.setPoint(Oldp1);

                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }
            for (int x = Oldp1.x, y = Oldp1.y; y >= 1 && x <= 8; x++, y--) {

                BQ.setX(x);
                BQ.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            BQ.setPoint(Oldp1);
                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            BQ.setPoint(Oldp1);
            PlaceCheck.x = Oldp1.x;
            PlaceCheck.y = Oldp1.y;

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            for (int i = 1; i <= 8; i++) {
                BQ.setX(i);

                PlaceCheck.x = i;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            BQ.setX(Oldp1.x);
                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            BQ.setX(Oldp1.x);
            PlaceCheck.x = Oldp1.x;

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            for (int i = 1; i <= 8; i++) {
                BQ.setY(i);
                PlaceCheck.y = i;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPositionOfPiece(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            BQ.setY(Oldp1.y);
                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            BQ.setY(Oldp1.y);
        }

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        return true;

    }

    public boolean GeneratePawnMoves(Player1 enemy, Pawn Sold) {
        Point Oldp1 = new Point();
        Oldp1 = Sold.getP();
        Point PlaceCheck = new Point();
        PlaceCheck.x = Oldp1.x;
        PlaceCheck.y = Oldp1.y;

        if (Oldp1.x != 20) {
            if (Sold.Canmove(Oldp1.x, Oldp1.y + 2, Color) && Oldp1.y + 2 >= 1) {
                Sold.setY(Oldp1.y + 2);

                PlaceCheck.y = Oldp1.y + 2;

                if (Pice_already_there(PlaceCheck)) {
                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
                        if (!seeIfChecked(enemy)) {

                            Sold.setPoint(Oldp1);
                            return false;
                        }
                    }
                }

            }
            if (Sold.Canmove(Oldp1.x, Oldp1.y + 1, Color) && Oldp1.y + 1 >= 1) {
                Sold.setY(Oldp1.y + 1);
                PlaceCheck.y = Oldp1.y + 1;

                if (Pice_already_there(PlaceCheck)) {
                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
                        if (!seeIfChecked(enemy)) {
                            Sold.setPoint(Oldp1);

                            return false;
                        }
                    }
                }
            }

            if (Pice_already_there_from_enemy(new Point(Oldp1.x - 1, Oldp1.y + 1), enemy)) {
                if (kill_to_protect_king(enemy, new Point(Oldp1.x - 1, Oldp1.y + 1))) {

                    if (!seeIfChecked(enemy)) {
                        enemy.changePostion(other, ate_to_protect);
                        Sold.setPoint(Oldp1);

                        return false;
                    }
                    enemy.changePostion(other, ate_to_protect);
                }
            }

            if (!Pice_already_there_from_enemy(new Point(Oldp1.x + 1, Oldp1.y + 1), enemy)) {
                if (kill_to_protect_king(enemy, new Point(Oldp1.x + 1, Oldp1.y + 1))) {
                    if (!seeIfChecked(enemy)) {
                        enemy.changePostion(other, ate_to_protect);
                        Sold.setPoint(Oldp1);

                        return false;
                    }
                    enemy.changePostion(other, ate_to_protect);

                }
            }

        }

        Sold.setPoint(Oldp1);
        return true;
    }

    public boolean Check_The_Way_to_Postion(Player1 enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            if (inHand != i)// check if there is peices in the WAY
            {
                if (i < 17) {
                    flag = checktheWay(newP, enemy.getPiecePosition(i), inHand);//Means there is somting in the Way so can't move
                } else {
                    flag = checktheWay(newP, getPositionOfPiece(i), inHand);
                }

                if (flag == true) {
                    return false;
                }//Means  there is a Pice in the Way
            }
        }
        return true;

    }

    public boolean kill_to_protect_king(Player1 enemy, Point newP) {

        for (int i = 17; i <= 32; i++) {

            other = enemy.getPiecePosition(i);
            if (other.x == newP.x && other.y == newP.y) {
                ate_to_protect = i;

                enemy.Killedpiec(i);
                return true;
            }
        }

        return false;
    }

    public boolean hasMoreElements() {
        return false;
    }

    public Object nextElement() {

        return new Object();
    }

    public String AboutLastMove() {
        switch (inHand) {
            case 1:
                return BC1.toString();
            case 2:
                return BC2.toString();
            case 3:
                return BH1.toString();
            case 4:
                return BH2.toString();
            case 5:
                return BE1.toString();
            case 6:
                return BE2.toString();
            case 7:
                return BQ.toString();
            case 8:
                return BK.toString();
            case 9:
                return BS[0].toString();
            case 10:
                return BS[1].toString();
            case 11:
                return BS[2].toString();
            case 12:
                return BS[3].toString();
            case 13:
                return BS[4].toString();
            case 14:
                return BS[5].toString();
            case 15:
                return BS[6].toString();
            case 16:
                return BS[7].toString();
        }
        return null;
    }

}
