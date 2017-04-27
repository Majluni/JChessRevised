package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import MainFrame.ChessFrame.ThreadTimer.ThreadTimer;

public class Save_Item extends JMenuItem {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JFileChooser SaveFile = new JFileChooser();
	private JLabel mynewscreen;

    /**
     * Creates a new instance of Save_Item
     */
    public Save_Item() {
        setText("Save Game");
        
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	double mytime = 0;
            	
            	ThreadTimer t1 = new ThreadTimer(mynewscreen);
                int retrival = SaveFile.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                	try(FileWriter fw = new FileWriter(SaveFile.getSelectedFile()+".txt")) {
                	    fw.write((int) t1.getTime());
                	} catch (IOException e1) {
					System.out.println("Could not save...");
					}
                }

            }
        });
    }
}
