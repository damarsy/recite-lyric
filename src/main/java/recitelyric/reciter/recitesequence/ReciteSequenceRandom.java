package recitelyric.reciter.recitesequence;

import recitelyric.entity.Pair;
import recitelyric.reciter.generator.GenerateLyricBehaviour;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.Collections;
import java.util.List;

public class ReciteSequenceRandom extends ReciteSequenceBehaviour {
    public ReciteSequenceRandom(GenerateLyricBehaviour generateLyric) {
        super(generateLyric);
    }

    @Override
    public String constructLyric(String prefix, List<Pair> verses, int count) throws Exception
    {
        Collections.shuffle(verses);
        return generateLyric.getFullLyric(prefix, verses, count);
    }
}
