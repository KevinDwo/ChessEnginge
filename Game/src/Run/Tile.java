package Run;

import Pieces.Piece;

public class Tile {
    private boolean isOccupied;
    /** A boolean showing if a tile is occupied **/

    private Piece piece;
    /** The current piece of this tile **/

    public Tile(){

    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }


    public boolean isOccupied() {
        return piece.isOccupied();
    }
}
