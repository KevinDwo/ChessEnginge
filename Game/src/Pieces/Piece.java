package Pieces;

import java.awt.Point;
import Util.Players;

public abstract class Piece {
    private final Players player;

    public Piece(Players player) {
        this.player = player;
    }

    public abstract boolean isOccupied();
    public abstract Point[] getMoves(Point point);
}
