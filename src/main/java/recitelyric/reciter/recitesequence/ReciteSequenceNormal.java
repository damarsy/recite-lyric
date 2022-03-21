package recitelyric.reciter.recitesequence;

import recitelyric.entity.Pair;
import recitelyric.reciter.generator.GenerateLyricBehaviour;

import java.util.List;

public class ReciteSequenceNormal extends ReciteSequenceBehaviour {
    public ReciteSequenceNormal(GenerateLyricBehaviour generateLyric) {
        super(generateLyric);
    }

    @Override
    public String constructLyric(String prefix, List<Pair> verses, int count) throws Exception
    {
        return generateLyric.getFullLyric(prefix, verses, count);
    }
}
