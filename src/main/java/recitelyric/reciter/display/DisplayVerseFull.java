package recitelyric.reciter.display;

import recitelyric.entity.Pair;

import static recitelyric.constant.Constant.SPACE_DELIMITER;

public class DisplayVerseFull implements DisplayVerseBehaviour {
    public DisplayVerseFull() {}
    @Override
    public String getVerse(Pair verse, boolean firstVerse) {
        return (SPACE_DELIMITER + verse.getLeft());
    }
}
