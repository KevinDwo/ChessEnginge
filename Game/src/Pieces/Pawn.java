package Pieces;
import Util.Players;

import java.awt.*;

public class Pawn extends Piece {
    public Pawn(Players player) {
        super(player);
    }

    @Override
    public boolean isOccupied() {
        return true;
    }

    @Override
    public Point[] getMoves(Point point) {


        return new Point[0];
    }
}
