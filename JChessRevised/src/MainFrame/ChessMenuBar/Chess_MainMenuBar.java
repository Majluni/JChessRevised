package MainFrame.ChessMenuBar;

import javax.swing.JMenuBar;

import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessMenuBar.ChessBar_Menus.Edit_Menu;
import MainFrame.ChessMenuBar.ChessBar_Menus.File_Menu;


public class Chess_MainMenuBar extends JMenuBar {

    private final File_Menu Fmenu;
    private final Edit_Menu Emenu = new Edit_Menu();



    /**
     * Creates a new instance of Chess_MainMenuBar
     */
    public Chess_MainMenuBar(MainFrame ff) {
        Fmenu = new File_Menu(ff);
        add(Fmenu);
        add(Emenu);


    }

    public String getIpAddress() {
        return Fmenu.getIPaddress();
    }

    public String getPortnumber() {
        return Fmenu.getportNumber();
    }

}
