package byow.input;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Based on @author Josh Hug's code.
 */
public class KeyboardInputSource implements InputSource{

    @Override
    public char getNextKey() {
        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                return StdDraw.nextKeyTyped();
            }
        }
    }

    @Override
    public boolean possibleNextKey() {
        return true;
    }
}
