package recitelyric.reciter;

import recitelyric.constant.DisplayVerseMethod;
import recitelyric.entity.Lyric;
import recitelyric.entity.LyricPrefix;
import recitelyric.entity.Pair;

import java.util.List;

public abstract class DecoratorLyricReciter implements LyricReciter {
    public abstract void recite(int count) throws Exception;

    String getFullLyric(DisplayVerseMethod displayVerseMethod, String prefix, List<Pair> verses, int count) throws Exception {
        if (verses == null || verses.isEmpty() || count < 1) throw new Exception("Invalid parameters");
        int verseSize = verses.size();
        if (count > verseSize) throw new Exception("Invalid parameters");

        Lyric lyric = new LyricPrefix(prefix);
        boolean firstVerse = true;
        for (int index = (verseSize - 1); index >= (verseSize - count); index--) {
            lyric = getVerse(displayVerseMethod, lyric, verses.get(index), firstVerse);
            if (firstVerse) firstVerse = false;
        }

        return lyric.getLyric();
    }

    static Lyric getVerse(DisplayVerseMethod displayVerseMethod, Lyric lyric, Pair verse, boolean firstVerse) {
        return DisplayVerseDecider.decide(displayVerseMethod, lyric, verse, firstVerse);
    }
}
