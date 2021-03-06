package halmaSquareSkeleton;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ch.aplu.jgamegrid.*;

public class HalmaPlayerTest {
	private Halma halmaBoard;
	
	@Test
	public void playerShouldWin() {
		this.halmaBoard = new Halma();
		HalmaPlayer radi = halmaBoard.getPlayers()[0];
		ArrayList<Location> endLocs = radi.getEndLocations();
		assertFalse(radi.isWinner());
		halmaBoard.removeAllActors();
		for (Location endLoc : endLocs) {
			halmaBoard.addActor(new HalmaStone(radi), endLoc);
		}
		assertTrue(radi.isWinner());
	}

}
