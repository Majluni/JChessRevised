package ChessGame;

import static org.junit.Assert.*;

import org.junit.Test;

import MainFrame.ChessFrame.players.Player1;
import MainFrame.ChessFrame.players.Player2;
import MainFrame.ChessFrame.players.Pieces.Bishop;
import MainFrame.ChessFrame.players.Pieces.King;
import MainFrame.ChessFrame.players.Pieces.Knight;
import MainFrame.ChessFrame.players.Pieces.Pawn;

import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.Rook;

public class JUnitTesting {

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
		assertNotNull(b1.getPixelPoint());
		assertFalse(b1.Canmove(3, 5));
		assertNotNull(k1.getPixelPoint());
		assertFalse(k1.Canmove(1, 0));
		assertNotNull(kn1.getPixelPoint());
		assertFalse(kn1.Canmove(5, 9));
		assertNotNull(p1.getPixelPoint());
		assertFalse(p1.Canmove(1, 0, "white"));
		assertNotNull(q1.getPixelPoint());
		assertFalse(q1.Canmove(4, 9));
		assertNotNull(r1.getPixelPoint());
		assertTrue(r1.Canmove(1, 7));
	}

		
}


