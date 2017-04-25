package MainFrame.ChessFrame.players;

import MainFrame.ChessFrame.players.Pieces.Rook;
import MainFrame.ChessFrame.players.Pieces.Bishop;
import MainFrame.ChessFrame.players.Pieces.Knight;
import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.Pawn;
import MainFrame.ChessFrame.players.Pieces.King;
import java.awt.Image;
import java.awt.Point;

public class Player1 {

    /**
     * Creates a new instance of Player1
     */
    public Rook WC1;
    public Rook WC2;
    public Knight WH1;
    public Knight WH2;
    public Queen WQ;
    public Bishop WE1;
    public Bishop WE2;
    public Pawn[] WS = new Pawn[8];
    public King WK;
    private int inHand = -1;
    private boolean kingischeck = false;
    private int choosenOne;
    String Color = "white";
    private Point other;
    int ate_to_protect;

    public Player1() {
        String fileSeparator = new String(System.getProperty("file.separator"));
        WC1 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wr.gif", 8, 8);
        WC2 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wr.gif", 1, 8);
        WH1 = new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wn.gif", 2, 8);
        WH2 = new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wn.gif", 7, 8);
        WE1 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wb.gif", 3, 8);
        WE2 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wb.gif", 6, 8);
        WQ = new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wq.gif", 4, 8);
        WK = new King("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wk.gif", 5, 8);
        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            WS[i] = new Pawn("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wp.gif", j, 7);
        }
    }

    public Point getPiecePosition(int i) {
        switch (i) {

            case 17:
                return WC1.getP();
            case 18:
                return WC2.getP();
            case 19:
                return WH1.getP();
            case 20:
                return WH2.getP();
            case 21:
                return WE1.getP();
            case 22:
                return WE2.getP();
            case 23:
                return WQ.getP();
            case 24:
                return WK.getP();
            case 25:
                return WS[0].getP();
            case 26:
                return WS[1].getP();
            case 27:
                return WS[2].getP();
            case 28:
                return WS[3].getP();
            case 29:
                return WS[4].getP();
            case 30:
                return WS[5].getP();
            case 31:
                return WS[6].getP();
            case 32:
                return WS[7].getP();
        }
        return new Point(-1, -1);
    }

    public Point getPieceOldPosition(int i) {

        switch (i) {

            case 17:
                return WC1.getOld();
            case 18:
                return WC2.getOld();
            case 19:
                return WH1.getOld();
            case 20:
                return WH2.getOld();
            case 21:
                return WE1.getOld();
            case 22:
                return WE2.getOld();
            case 23:
                return WQ.getOld();
            case 24:
                return WK.getOld();
            case 25:
                return WS[0].getOld();
            case 26:
                return WS[1].getOld();
            case 27:
                return WS[2].getOld();
            case 28:
                return WS[3].getOld();
            case 29:
                return WS[4].getOld();
            case 30:
                return WS[5].getOld();
            case 31:
                return WS[6].getOld();
            case 32:
                return WS[7].getOld();
        }
        return new Point(-1, -1);
    }

    public Image returnIconImage(int i) {

        switch (i) {

            case 17: {
                return WC1.getPieceImage();
            }
            case 18: {
                return WC2.getPieceImage();
            }
            case 19: {
                return WH1.getPieceImage();
            }
            case 20: {
                return WH2.getPieceImage();
            }
            case 21:
                return WE1.getPieceImage();
            case 22:
                return WE2.getPieceImage();
            case 23:
                return WQ.getPieceImage();
            case 24:
                return WK.getPieceImage();
            case 25:
                return WS[0].getPieceImage();
            case 26:
                return WS[1].getPieceImage();
            case 27:
                return WS[2].getPieceImage();
            case 28:
                return WS[3].getPieceImage();
            case 29:
                return WS[4].getPieceImage();
            case 30:
                return WS[5].getPieceImage();
            case 31:
                return WS[6].getPieceImage();
            case 32:
                return WS[7].getPieceImage();
        }
        return null;
    }

    public void changePostion(Point newPoint, int i) {
        switch (i) {

            case 17:
                WC1.setPoint(newPoint);
                break;
            case 18:
                WC2.setPoint(newPoint);
                break;
            case 19:
                WH1.setPoint(newPoint);
                break;
            case 20:
                WH2.setPoint(newPoint);
                break;
            case 21:
                WE1.setPoint(newPoint);
                break;
            case 22:
                WE2.setPoint(newPoint);
                break;
            case 23:
                WQ.setPoint(newPoint);
                break;
            case 24:
                WK.setPoint(newPoint);
                break;
            case 25:
                WS[0].setPoint(newPoint);
                break;
            case 26:
                WS[1].setPoint(newPoint);
                break;
            case 27:
                WS[2].setPoint(newPoint);
                break;
            case 28:
                WS[3].setPoint(newPoint);
                break;
            case 29:
                WS[4].setPoint(newPoint);
                break;
            case 30:
                WS[5].setPoint(newPoint);
                break;
            case 31:
                WS[6].setPoint(newPoint);
                break;
            case 32:
                WS[7].setPoint(newPoint);
                break;
        }

    }

    public void changePostionToOld(Point newPoint, int i) {
        switch (i) {

            case 17:
                WC1.toOld(newPoint);
                break;
            case 18:
                WC2.toOld(newPoint);
                break;
            case 19:
                WH1.toOld(newPoint);
                break;
            case 20:
                WH2.toOld(newPoint);
                break;
            case 21:
                WE1.toOld(newPoint);
                break;
            case 22:
                WE2.toOld(newPoint);
                break;
            case 23:
                WQ.toOld(newPoint);
                break;
            case 24:
                WK.toOld(newPoint);
                break;
            case 25:
                WS[0].toOld(newPoint);
                break;
            case 26:
                WS[1].toOld(newPoint);
                break;
            case 27:
                WS[2].toOld(newPoint);
                break;
            case 28:
                WS[3].toOld(newPoint);
                break;
            case 29:
                WS[4].toOld(newPoint);
                break;
            case 30:
                WS[5].toOld(newPoint);
                break;
            case 31:
                WS[6].toOld(newPoint);
                break;
            case 32:
                WS[7].toOld(newPoint);
                break;
        }
    }

    public void changePixel(int newPixelX, int newPixelY, int i) {
        choosenOne = i;
        switch (choosenOne) {

            case 17:
                WC1.setPixels(newPixelX, newPixelY);
                break;
            case 18:
                WC2.setPixels(newPixelX, newPixelY);
                break;
            case 19:
                WH1.setPixels(newPixelX, newPixelY);
                break;
            case 20:
                WH2.setPixels(newPixelX, newPixelY);
                break;
            case 21:
                WE1.setPixels(newPixelX, newPixelY);
                break;
            case 22:
                WE2.setPixels(newPixelX, newPixelY);
                break;
            case 23:
                WQ.setPixels(newPixelX, newPixelY);
                break;
            case 24:
                WK.setPixels(newPixelX, newPixelY);
                break;
            case 25:
                WS[0].setPixels(newPixelX, newPixelY);
                break;
            case 26:
                WS[1].setPixels(newPixelX, newPixelY);
                break;
            case 27:
                WS[2].setPixels(newPixelX, newPixelY);
                break;
            case 28:
                WS[3].setPixels(newPixelX, newPixelY);
                break;
            case 29:
                WS[4].setPixels(newPixelX, newPixelY);
                break;
            case 30:
                WS[5].setPixels(newPixelX, newPixelY);
                break;
            case 31:
                WS[6].setPixels(newPixelX, newPixelY);
                break;
            case 32:
                WS[7].setPixels(newPixelX, newPixelY);
                break;
        }
    }

    public Point getPixelPoint(int i) {
        choosenOne = i;
        switch (choosenOne) {

            case 17:
                return WC1.getPixelPoint();
            case 18:
                return WC2.getPixelPoint();
            case 19:
                return WH1.getPixelPoint();
            case 20:
                return WH2.getPixelPoint();
            case 21:
                return WE1.getPixelPoint();
            case 22:
                return WE2.getPixelPoint();
            case 23:
                return WQ.getPixelPoint();
            case 24:
                return WK.getPixelPoint();
            case 25:
                return WS[0].getPixelPoint();
            case 26:
                return WS[1].getPixelPoint();
            case 27:
                return WS[2].getPixelPoint();
            case 28:
                return WS[3].getPixelPoint();
            case 29:
                return WS[4].getPixelPoint();
            case 30:
                return WS[5].getPixelPoint();
            case 31:
                return WS[6].getPixelPoint();
            case 32:
                return WS[7].getPixelPoint();
        }
        return null;
    }

    public boolean checkthemove(Point newP, int i) {
        choosenOne = i;
        switch (choosenOne) {

            case 17:
                return WC1.Canmove(newP.x, newP.y);
            case 18:
                return WC2.Canmove(newP.x, newP.y);
            case 19:
                return WH1.Canmove(newP.x, newP.y);
            case 20:
                return WH2.Canmove(newP.x, newP.y);
            case 21:
                return WE1.Canmove(newP.x, newP.y);
            case 22:
                return WE2.Canmove(newP.x, newP.y);
            case 23:
                return WQ.Canmove(newP.x, newP.y);
            case 24:
                return WK.Canmove(newP.x, newP.y);
            case 25:
                return WS[0].Canmove(newP.x, newP.y, Color);
            case 26:
                return WS[1].Canmove(newP.x, newP.y, Color);
            case 27:
                return WS[2].Canmove(newP.x, newP.y, Color);
            case 28:
                return WS[3].Canmove(newP.x, newP.y, Color);
            case 29:
                return WS[4].Canmove(newP.x, newP.y, Color);
            case 30:
                return WS[5].Canmove(newP.x, newP.y, Color);
            case 31:
                return WS[6].Canmove(newP.x, newP.y, Color);
            case 32:
                return WS[7].Canmove(newP.x, newP.y, Color);
        }
        return false;
    }

    public boolean setSeentoSiliders(int i, Point P) {
        switch (i) {
            case 25:
                return WS[0].setSeenbychecking(P, "white");
            case 26:
                return WS[1].setSeenbychecking(P, "white");
            case 27:
                return WS[2].setSeenbychecking(P, "white");
            case 28:
                return WS[3].setSeenbychecking(P, "white");
            case 29:
                return WS[4].setSeenbychecking(P, "white");
            case 30:
                return WS[5].setSeenbychecking(P, "white");
            case 31:
                return WS[6].setSeenbychecking(P, "white");
            case 32:
                return WS[7].setSeenbychecking(P, "white");
        }
        return false;
    }

    public boolean returnPawnSeen(int i) {
        switch (i) {
            case 25:
                return WS[0].getSeen();
            case 26:
                return WS[1].getSeen();
            case 27:
                return WS[2].getSeen();
            case 28:
                return WS[3].getSeen();
            case 29:
                return WS[4].getSeen();
            case 30:
                return WS[5].getSeen();
            case 31:
                return WS[6].getSeen();
            case 32:
                return WS[7].getSeen();
        }
        return false;
    }

    public boolean checktheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {

            case 17:
                return WC1.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 18:
                return WC2.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 21:
                return WE1.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 22:
                return WE2.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 23:
                return WQ.PieceInMYway(newP.x, newP.y, postionFromOthers);
            case 25:
                return WS[0].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 26:
                return WS[1].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 27:
                return WS[2].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 28:
                return WS[3].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 29:
                return WS[4].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 30:
                return WS[5].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 31:
                return WS[6].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);
            case 32:
                return WS[7].PieceInMYway(newP.x, newP.y, postionFromOthers, Color);

        }
        return false;
    }

    public boolean Killedpiec(int i) {
        Point out = new Point(13, 13);
        switch (i) {

            case 17:
                WC1.setPoint(out);
                return true;
            case 18:
                WC2.setPoint(out);
                return true;
            case 19:
                WH1.setPoint(out);
                return true;
            case 20:
                WH2.setPoint(out);
                return true;
            case 21:
                WE1.setPoint(out);
                return true;
            case 22:
                WE2.setPoint(out);
                return true;
            case 23:
                WQ.setPoint(out);
                return true;
            case 24:
                return false;
            case 25:
                WS[0].setPoint(out);
                return true;
            case 26:
                WS[1].setPoint(out);
                return true;
            case 27:
                WS[2].setPoint(out);
                return true;
            case 28:
                WS[3].setPoint(out);
                return true;
            case 29:
                WS[4].setPoint(out);
                return true;
            case 30:
                WS[5].setPoint(out);
                return true;
            case 31:
                WS[6].setPoint(out);
                return true;
            case 32:
                WS[7].setPoint(out);
                return true;
        }

        return false;
    }

    public boolean checKing(Point p1, Point p2, int i) {
        switch (i) {

            case 17:
                return WC1.checkKing(p1.x, p1.y, p2);
            case 18:
                return WC2.checkKing(p1.x, p1.y, p2);
            case 19:
                return WH1.Canmove(p1.x, p1.y);
            case 20:
                return WH2.Canmove(p1.x, p1.y);
            case 21:
                return WE1.checkKing(p1.x, p1.y, p2);
            case 22:
                return WE2.checkKing(p1.x, p1.y, p2);
            case 23:
                return WQ.checkKing(p1.x, p1.y, p2);

            case 25:
                return WS[0].Canmove(p1.x, p1.y, Color);
            case 26:
                return WS[1].Canmove(p1.x, p1.y, Color);
            case 27:
                return WS[2].Canmove(p1.x, p1.y, Color);
            case 28:
                return WS[3].Canmove(p1.x, p1.y, Color);
            case 29:
                return WS[4].Canmove(p1.x, p1.y, Color);
            case 30:
                return WS[5].Canmove(p1.x, p1.y, Color);
            case 31:
                return WS[6].Canmove(p1.x, p1.y, Color);
            case 32:
                return WS[7].Canmove(p1.x, p1.y, Color);
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

    public boolean if_MyKing_In_check(Player2 Black) {
        boolean isCheckmate = false;
        boolean flag = false;

        return false;
    }

    public boolean Check_Mate_GameOver(Player2 Enemy) {

        if (!KingGenerate_moves(Enemy)) {

            inHand = -1;
            return false;
        } else if (!RookGenerate_moves(Enemy, WC1)) {

            inHand = -1;
            return false;
        } else if (!RookGenerate_moves(Enemy, WC2)) {

            inHand = -1;
            return false;
        } else if (!ElephentGenerate_moves(Enemy, WE1)) {

            inHand = -1;
            return false;
        } else if (!ElephentGenerate_moves(Enemy, WE2)) {

            inHand = -1;
            return false;
        } else if (!HosreGenerate_moves(Enemy, WH1)) {

            inHand = -1;
            return false;
        } else if (!HosreGenerate_moves(Enemy, WH2)) {

            inHand = -1;
            return false;
        } else if (!QueenGenerate_moves(Enemy)) {

            inHand = -1;
            return false;
        }

        for (int i = 0; i <= 7; i++) {
            inHand = 25 + i;
            if (!SoliderGenerate_moves(Enemy, WS[i])) {

                inHand = -1;
                System.out.println("I Killed Pawn 1");
                return false;
            }
        }

        inHand = -1;
        return true;

    }

    public boolean seeIfChecked(Player2 Black) {

        Point My_King_Postion = WK.getP();
        boolean flag = false;

        //////////    Start Checking the King ////////////
        for (int i = 1; i < 17; i++) {
            if (i < 9) {
                if (Black.checkthemove(My_King_Postion, i)) {

                    flag = true;
                    for (int j = 1; j < 33; j++) {

                        if (j < 17) {

                            if (Black.checktheWay(My_King_Postion, Black.getPositionOfPiece(j), i)) {
                                //Means there is something in the Way so can't move'

                                flag = false;

                            }
                        } else {

                            if (j != 24) {
                                if (Black.checktheWay(My_King_Postion, getPiecePosition(j), i)) {

                                    flag = false;
                                    //Means there is something in the Way so can't move'

                                }
                            }

                        }

                    }

                    if (flag) {

                        break;
                    }

                }
            } else {
                // For Pawns
                if (Black.setSeentoSiliders(i, My_King_Postion)) {

                    break;

                }
            }
            //   if(stillIn_Check){ return true;}//Here Means White King is in check !!!
            if (i == 16) {

                return false;
            }
        }

        return true;
    }

    public boolean Pice_already_there(Point newP) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {
            if (GetInhand() != i)// There is no need to check the inHand pice
            {

                //Check if there is White Pices in the new Point
                //If so we Can't move (Same Color)!!
                samePostion = getPiecePosition(i);
                if (newP.x == samePostion.x && newP.y == samePostion.y) {

                    return false;

                }
            }
        }

        return true;
    }

    public boolean Pice_already_there_from_enemy(Point newP, Player2 enemy) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            samePostion = enemy.getPositionOfPiece(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {

                return false;

            }
        }

        return true;
    }

    public int Get_Pice_already_there_from_enemy(Point newP, Player2 enemy) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            samePostion = enemy.getPositionOfPiece(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {

                return i;

            }
        }

        return -1;
    }

    public boolean KingGenerate_moves(Player2 enemy) {
        boolean somthing_killed = false;
        Point Oldp = new Point();

        Point PlaceCheck = new Point();
        inHand = 24;

        int x = WK.getX();
        int y = WK.getY();
        Oldp.x = x;
        Oldp.y = y;

        if (x + 1 <= 8) {

            WK.setX(x + 1);
            WK.setY(y);
            PlaceCheck.x = x + 1;
            PlaceCheck.y = y;

            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    WK.setPoint(Oldp);
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    return false;
                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y + 1 <= 8) {

            WK.setX(x);
            WK.setY(y + 1);
            PlaceCheck.x = x;
            PlaceCheck.y = y + 1;
            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    WK.setPoint(Oldp);
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    return false;

                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        if (y - 1 > 0) {

            WK.setX(x);
            WK.setY(y - 1);

            PlaceCheck.x = x;
            PlaceCheck.y = y - 1;

            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }

            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    WK.setPoint(Oldp);
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }

                    return false;
                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (x - 1 > 0) {

            WK.setX(x - 1);
            WK.setY(y);

            PlaceCheck.x = x - 1;
            PlaceCheck.y = y;
            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    WK.setPoint(Oldp);
                    return false;
                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {

            WK.setX(x - 1);
            WK.setY(y - 1);

            PlaceCheck.x = x - 1;
            PlaceCheck.y = y - 1;

            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    WK.setPoint(Oldp);
                    return false;
                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {

            WK.setX(x + 1);
            WK.setY(y + 1);

            PlaceCheck.x = x + 1;
            PlaceCheck.y = y + 1;
            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {

                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    WK.setPoint(Oldp);
                    return false;
                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            WK.setX(x + 1);
            WK.setY(y - 1);

            PlaceCheck.x = x + 1;
            PlaceCheck.y = y - 1;
            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    WK.setPoint(Oldp);
                    return false;
                }
            }

        }
        WK.setPoint(Oldp);
        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {

            WK.setX(x - 1);
            WK.setY(y + 1);

            PlaceCheck.x = x - 1;
            PlaceCheck.y = y + 1;
            if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                somthing_killed = true;
            }
            if (Pice_already_there(PlaceCheck)) {
                if (!seeIfChecked(enemy)) {
                    if (somthing_killed) {
                        enemy.changePostion(other, ate_to_protect);
                        somthing_killed = false;
                    }
                    WK.setPoint(Oldp);
                    return false;
                }
            }

        }

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        WK.setPoint(Oldp);
        return true;

    }

    public boolean RookGenerate_moves(Player2 enemy, Rook WC) {
        boolean somthing_killed = false;
        Point Oldp1 = new Point();

        Point PlaceCheck = new Point();
        int x1 = WC.getX();
        int y1 = WC.getY();

        if (WC == WC1) {
            inHand = 17;
        } else {
            inHand = 18;
        }
        /////////////////////

        Oldp1.x = x1;
        Oldp1.y = y1;

        PlaceCheck.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {
                WC.setX(i);
                PlaceCheck.x = i;

                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            WC.setX(Oldp1.x);
                            WC.setY(Oldp1.y);

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
            WC.setX(Oldp1.x);
            PlaceCheck.x = Oldp1.x;

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }
            for (int i = 1; i <= 8; i++) {
                WC.setY(i);
                PlaceCheck.y = i;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            WC.setX(Oldp1.x);
                            WC.setY(Oldp1.y);

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
            WC.setY(Oldp1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }
        WC.setX(Oldp1.x);
        WC.setY(Oldp1.y);
        return true;
    }

    public boolean ElephentGenerate_moves(Player2 enemy, Bishop WE) {
        boolean somthing_killed = false;
        Point Oldp1 = new Point();
        Point PlaceCheck = new Point();

        Oldp1 = WE.getP();

        if (WE == WE1) {
            inHand = 21;
        } else {
            inHand = 22;
        }

        if (Oldp1.x != 20) {
            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {

                WE.setX(x);
                WE.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {

                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            WE.setPoint(Oldp1);
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

                WE.setX(x);
                WE.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            if (somthing_killed) {
                                enemy.changePostion(other, ate_to_protect);
                                somthing_killed = false;
                            }
                            WE.setPoint(Oldp1);
                            return false;
                        }
                    }
                }

                if (somthing_killed) {
                    enemy.changePostion(other, ate_to_protect);
                    somthing_killed = false;
                }

            }
            WE.setPoint(Oldp1);

        }

        WE.setPoint(Oldp1);

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        return true;
    }

    public boolean HosreGenerate_moves(Player2 enemy, Knight WH) {
        Point oldp1 = new Point();
        boolean somthing_killed = false;
        oldp1 = WH.getP();

        Point PlaceCheck = new Point();

        if (WH == WH1) {
            inHand = 19;
        } else {
            inHand = 20;
        }

        int x = oldp1.x;
        int y = oldp1.y;

        if (x != 20) {

            if (x + 1 <= 8 && y + 1 <= 8) {
                WH.setX(x + 1);
                WH.setY(y + 2);
                PlaceCheck.x = x + 1;
                PlaceCheck.y = y + 2;

                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        WH.setPoint(oldp1);

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
                WH.setX(x + 1);
                WH.setY(y - 2);
                PlaceCheck.x = x + 1;
                PlaceCheck.y = y - 2;
                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                WH.setX(x + 2);
                WH.setY(y + 1);
                PlaceCheck.x = x + 2;
                PlaceCheck.y = y + 1;

                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                WH.setX(x + 2);
                WH.setY(y - 1);
                PlaceCheck.x = x + 2;
                PlaceCheck.y = y - 1;
                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                WH.setX(x - 1);
                WH.setY(y + 2);
                PlaceCheck.x = x - 1;
                PlaceCheck.y = y + 2;

                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                WH.setX(x - 1);
                WH.setY(y - 2);
                PlaceCheck.x = x - 1;
                PlaceCheck.y = y - 2;
                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                WH.setX(x - 2);
                WH.setY(y + 1);
                PlaceCheck.x = x - 2;
                PlaceCheck.y = y + 1;

                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }
                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                WH.setX(x - 2);
                WH.setY(y - 1);
                PlaceCheck.x = x - 2;
                PlaceCheck.y = y - 1;

                if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                    somthing_killed = true;
                }

                if (Pice_already_there(PlaceCheck)) {
                    if (!seeIfChecked(enemy)) {
                        if (somthing_killed) {
                            enemy.changePostion(other, ate_to_protect);
                            somthing_killed = false;
                        }
                        WH.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

        }
        WH.setPoint(oldp1);

        return true;
    }

    public boolean QueenGenerate_moves(Player2 enemy) {
        boolean somthing_killed = false;

        Point Oldp1 = new Point();

        Oldp1 = WQ.getP();

        Point PlaceCheck = new Point();

        inHand = 23;

        if (Oldp1.x != 20) {
            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {

                WQ.setX(x);
                WQ.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }

                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            WQ.setPoint(Oldp1);

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

                WQ.setX(x);
                WQ.setY(y);
                PlaceCheck.x = x;
                PlaceCheck.y = y;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            WQ.setPoint(Oldp1);
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
            WQ.setPoint(Oldp1);
            PlaceCheck.x = Oldp1.x;
            PlaceCheck.y = Oldp1.y;

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            for (int i = 1; i <= 8; i++) {
                WQ.setX(i);

                PlaceCheck.x = i;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            WQ.setX(Oldp1.x);
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
            WQ.setX(Oldp1.x);
            PlaceCheck.x = Oldp1.x;

            if (somthing_killed) {
                enemy.changePostion(other, ate_to_protect);
                somthing_killed = false;
            }

            for (int i = 1; i <= 8; i++) {
                WQ.setY(i);
                PlaceCheck.y = i;
                if (Check_The_Way_to_Postion(enemy, Oldp1)) {
                    if (kill_to_protect_king(enemy, getPiecePosition(inHand))) {
                        somthing_killed = true;
                    }
                    if (Pice_already_there(PlaceCheck)) {
                        if (!seeIfChecked(enemy)) {
                            WQ.setY(Oldp1.y);
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
            WQ.setY(Oldp1.y);
        }

        if (somthing_killed) {
            enemy.changePostion(other, ate_to_protect);
            somthing_killed = false;
        }

        return true;

    }

    public boolean SoliderGenerate_moves(Player2 enemy, Pawn Sold) {
        Point Oldp1 = new Point();
        Oldp1 = Sold.getP();
        Point PlaceCheck = new Point();
        PlaceCheck.x = Oldp1.x;
        PlaceCheck.y = Oldp1.y;

        if (Oldp1.x != 20) {
            if (Sold.Canmove(Oldp1.x, Oldp1.y - 2, Color) && Oldp1.y - 2 >= 1) {
                Sold.setY(Oldp1.y - 2);

                PlaceCheck.y = Oldp1.y - 1;

                if (Pice_already_there(PlaceCheck)) {
                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
                        if (!seeIfChecked(enemy)) {

                            Sold.setPoint(Oldp1);
                            return false;
                        }
                    }
                }

            }
            if (Sold.Canmove(Oldp1.x, Oldp1.y - 1, Color) && Oldp1.y - 1 >= 1) {
                Sold.setY(Oldp1.y - 1);
                PlaceCheck.y = Oldp1.y - 1;

                if (Pice_already_there(PlaceCheck)) {
                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {

                        if (!seeIfChecked(enemy)) {
                            Sold.setPoint(Oldp1);
                            System.out.println("dff");
                            System.out.println("dff");
                            System.out.println("dff");
                            return false;
                        }
                    }
                }
            }

            if (!Pice_already_there_from_enemy(new Point(Oldp1.x - 1, Oldp1.y - 1), enemy)) {
                if (kill_to_protect_king(enemy, new Point(Oldp1.x - 1, Oldp1.y - 1))) {

                    if (!seeIfChecked(enemy)) {
                        enemy.changePostion(other, ate_to_protect);
                        Sold.setPoint(Oldp1);

                        return false;
                    }
                    enemy.changePostion(other, ate_to_protect);
                }
            }

            if (!Pice_already_there_from_enemy(new Point(Oldp1.x + 1, Oldp1.y - 1), enemy)) {
                if (kill_to_protect_king(enemy, new Point(Oldp1.x + 1, Oldp1.y - 1))) {
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

    public boolean Check_The_Way_to_Postion(Player2 enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            if (inHand != i)// check if there is peices in the WAY
            {
                if (i < 17) {
                    flag = checktheWay(newP, enemy.getPositionOfPiece(i), inHand);//Means there is somting in the Way so can't move
                } else {
                    flag = checktheWay(newP, getPiecePosition(i), inHand);
                }

                if (flag == true) {
                    return false;
                }//Means  there is a Pice in the Way
            }
        }
        return true;

    }

    public boolean kill_to_protect_king(Player2 enemy, Point newP) {

        for (int i = 1; i < 17; i++) {

            other = enemy.getPositionOfPiece(i);
            if (other.x == newP.x && other.y == newP.y) {
                ate_to_protect = i;

                enemy.Killedpiec(i);
                return true;
            }
        }

        return false;
    }

    public String AboutLastMove() {
        switch (inHand) {

            case 17:
                return WC1.toString();
            case 18:
                return WC2.toString();
            case 19:
                return WH1.toString();
            case 20:
                return WH2.toString();
            case 21:
                return WE1.toString();
            case 22:
                return WE2.toString();
            case 23:
                return WQ.toString();
            case 24:
                return WK.toString();
            case 25:
                return WS[0].toString();
            case 26:
                return WS[1].toString();
            case 27:
                return WS[2].toString();
            case 28:
                return WS[3].toString();
            case 29:
                return WS[4].toString();
            case 30:
                return WS[5].toString();
            case 31:
                return WS[6].toString();
            case 32:
                return WS[7].toString();
        }
        return null;
    }
}
