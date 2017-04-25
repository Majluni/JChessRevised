package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class Load_Item extends JMenuItem {

    private final JFileChooser LoadFile = new JFileChooser();

    /**
     * Creates a new instance of Load_Item
     */
    public Load_Item() {
        setText("Load Game");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoadFile.showOpenDialog(null);
            }
        });
    }
}
