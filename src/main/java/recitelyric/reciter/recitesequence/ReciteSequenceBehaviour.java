package recitelyric.reciter.recitesequence;

import recitelyric.entity.Pair;
import recitelyric.reciter.generator.GenerateLyricBehaviour;

import java.util.List;

public abstract class ReciteSequenceBehaviour {
    final GenerateLyricBehaviour generateLyric;

    public ReciteSequenceBehaviour(GenerateLyricBehaviour generateLyric) {
        this.generateLyric = generateLyric;
    }

    public abstract String constructLyric(String prefix, List<Pair> verses, int count) throws Exception;
}
