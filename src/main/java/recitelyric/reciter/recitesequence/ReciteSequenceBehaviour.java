package recitelyric.reciter.recitesequence;

import recitelyric.entity.Pair;
import recitelyric.reciter.generator.GenerateLyricBehaviour;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.List;

public interface ReciteSequenceBehaviour {
    String constructLyric(
            GenerateLyricBehaviour generateLyric, DisplayVerseBehaviour displayVerse, String prefix, List<Pair> verses, int count)
            throws Exception;
}
