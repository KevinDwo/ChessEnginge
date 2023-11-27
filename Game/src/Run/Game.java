package Run;// The game will run in this class till one player has won/draw

import Util.Endstates;

public class Game {
    private boolean state = true;
    private final Endstates endstate = Endstates.BLACK_WINS;

    /*
    Returns an int.
    0 = white wins
    1 = black wins
    2 = draw
     */
    public Endstates run(){
        while (state){
            //game...
            state = false;
        }

        return endstate;
    }
}
