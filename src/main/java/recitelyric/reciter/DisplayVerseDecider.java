package recitelyric.reciter;

import recitelyric.constant.DisplayVerseMethod;
import recitelyric.entity.FullVerse;
import recitelyric.entity.Lyric;
import recitelyric.entity.Pair;
import recitelyric.entity.SubjectVerse;
import recitelyric.entity.Verse;

public class DisplayVerseDecider {
    public static Verse decide(DisplayVerseMethod displayVerseMethod, Lyric lyric, Pair verse, boolean firstVerse) {
        switch (displayVerseMethod) {
            case FULL_VERSE:
                return new FullVerse(lyric, verse);
            case SUBJECT_VERSE:
                return new SubjectVerse(lyric, verse, firstVerse);
            default:
                throw new UnsupportedOperationException("Invalid display verse method");
        }
    }
}
