package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class Load_Item extends JMenuItem {

    private final JFileChooser LoadFile = new JFileChooser();
    private File file;
    private double time1 = -1;
    private double time2 = -1;

    /**
     * Creates a new instance of Load_Item
     */
    public Load_Item() {
        setText("Load Game");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoadFile.showOpenDialog(null);
                file = LoadFile.getSelectedFile();
            }
        });
    }
    
    public void readFile() {
        try {
            Scanner scanLine = new Scanner(file);
            while(scanLine.hasNext()) {
                String line = scanLine.nextLine();
                Scanner scan = new Scanner(line);
                
                while(scan.hasNext()) {
                    String token = scan.next();
                    try {
                        double time = Double.parseDouble(token);

                        if(time1 == -1)
                            time1 = time;
                        else
                            time2 = time;
                    }
                    catch(NumberFormatException e) {
                        System.out.println("File read error: expecting double, found String.");
                    }
                    
                    
                }
            }
        }
        catch(IOException e) {
            
        }
    }
    
    public void setTimes() {
        
    }
    
    public void setPositions() {
        
    }
}
