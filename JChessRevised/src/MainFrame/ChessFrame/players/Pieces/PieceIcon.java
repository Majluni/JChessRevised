package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Toolkit;

public class PieceIcon {

    private Toolkit kit = Toolkit.getDefaultToolkit();
    protected Image image;

    public PieceIcon(String NameIcon) //throws IOException
    {

        image = kit.getImage(NameIcon);
    }

    public Image returnPieceIcon() {
        return image;
    }

}
