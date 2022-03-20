package recitelyric.entity;

import static recitelyric.constant.Constant.COMMA_DELIMITER;
import static recitelyric.constant.Constant.EMPTY_STRING;
import static recitelyric.constant.Constant.SPACE_DELIMITER;

public class SubjectVerse extends Verse {
    private boolean firstVerse;

    public SubjectVerse(Lyric lyric, Pair verse, boolean firstVerse) {
        super(lyric, verse);
        this.firstVerse = firstVerse;
    }

    @Override
    public String getChosenVerse() {
        String chosenVerse = EMPTY_STRING;
        if (!firstVerse) {
            chosenVerse += COMMA_DELIMITER;
        }
        chosenVerse += (SPACE_DELIMITER + super.getSubject());
        return chosenVerse;
    }
}
