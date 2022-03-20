package recitelyric.reciter.recitesequence;

import recitelyric.entity.Pair;
import recitelyric.reciter.generator.GenerateLyricBehaviour;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.List;

public class ReciteSequenceNormal implements ReciteSequenceBehaviour {
    @Override
    public String constructLyric(
            GenerateLyricBehaviour generateLyric, DisplayVerseBehaviour displayVerse, String prefix, List<Pair> verses, int count)
            throws Exception
    {
        return generateLyric.getFullLyric(displayVerse, prefix, verses, count);
    }
}
