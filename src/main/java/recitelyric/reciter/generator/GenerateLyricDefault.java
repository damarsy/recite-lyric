package recitelyric.reciter.generator;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.List;

public class GenerateLyricDefault extends GenerateLyricBehaviour {
    public GenerateLyricDefault(DisplayVerseBehaviour displayBehaviour) {
        super(displayBehaviour);
    }

    public String getFullLyric(String prefix, List<Pair> verses, int count) throws Exception {
        if (verses == null || verses.isEmpty() || count < 1) throw new Exception("Invalid parameters");
        int verseSize = verses.size();
        if (count > verseSize) throw new Exception("Invalid parameters");

        String lyric = prefix;
        String tempLyric = "";
        boolean firstVerse = false;
        for (int index = (verseSize - 1); index >= (verseSize - count); index--) {
            if (!(index - 1 >= (verseSize - count))) {
                firstVerse = true;
            }
            tempLyric = displayBehaviour.getVerse(verses.get(index), firstVerse) + tempLyric;

        }
        return lyric + tempLyric;
    }
}
