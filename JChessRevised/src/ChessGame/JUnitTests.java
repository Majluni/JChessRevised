package ChessGame;

import static org.junit.Assert.*;

import javax.swing.JLabel;

import org.junit.Test;

import MainFrame.ChessFrame.ThreadTimer.ThreadTimer;
import MainFrame.ChessFrame.players.Player1;
import MainFrame.ChessFrame.players.Player2;
import MainFrame.ChessFrame.players.Pieces.Bishop;
import MainFrame.ChessFrame.players.Pieces.King;
import MainFrame.ChessFrame.players.Pieces.Knight;
import MainFrame.ChessFrame.players.Pieces.Pawn;
import MainFrame.ChessFrame.players.Pieces.Piece;
import MainFrame.ChessFrame.players.Pieces.PieceIcon;
import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.Rook;

public class JUnitTests {

	@Test
	public void testPlayers() {
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		assertNotNull(p1);
		assertNotNull(p2);
		
	}
	
	@Test
	public void testPieces() {
		String piece = "black";
		Bishop b1 = new Bishop(piece, 5, 0);
		King k1 = new King(piece, 5, 1);
		Knight kn1 = new Knight(piece, 4, 1);
		Pawn p1 = new Pawn(piece, 3, 1);
		Queen q1 = new Queen(piece, 2, 1);
		Rook r1 = new Rook(piece, 1, 1);
		assertNotNull(b1.getpixelPoint());
		assertEquals(b1.returnX(), 5);
		assertEquals(b1.returnY(), 0);
		assertNotNull(k1.getpixelPoint());
		assertEquals(k1.returnX(), 5);
		assertEquals(k1.returnY(), 1);
		assertNotNull(kn1.getpixelPoint());
		assertEquals(kn1.returnX(), 4);
		assertEquals(kn1.returnY(), 1);
		assertNotNull(p1.getpixelPoint());
		assertEquals(p1.returnX(), 3);
		assertEquals(p1.returnY(), 1);
		assertNotNull(q1.getpixelPoint());
		assertEquals(q1.returnX(), 2);
		assertEquals(q1.returnY(), 1);
		assertNotNull(r1.getpixelPoint());
		assertEquals(r1.returnX(), 1);
		assertEquals(r1.returnY(), 1);
		
	}



		
}


