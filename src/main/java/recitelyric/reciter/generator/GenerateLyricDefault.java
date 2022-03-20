package recitelyric.reciter.generator;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.List;

public class GenerateLyricDefault implements GenerateLyricBehaviour {
    public String getFullLyric(DisplayVerseBehaviour displayBehaviour, String prefix, List<Pair> verses, int count) throws Exception {
        if (verses == null || verses.isEmpty() || count < 1) throw new Exception("Invalid parameters");
        int verseSize = verses.size();
        if (count > verseSize) throw new Exception("Invalid parameters");

        String lyric = prefix;
        boolean firstVerse = true;
        for (int index = (verseSize - 1); index >= (verseSize - count); index--) {
            lyric += displayBehaviour.getVerse(verses.get(index), firstVerse);
            if (firstVerse) firstVerse = false;
        }

        return lyric;
    }
}
