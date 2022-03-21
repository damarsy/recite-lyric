package recitelyric.reciter;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;
import recitelyric.reciter.display.DisplayVerseSubjectOnly;
import recitelyric.reciter.generator.GenerateLyricBehaviour;
import recitelyric.reciter.generator.GenerateLyricDefault;
import recitelyric.reciter.recitesequence.ReciteSequenceBehaviour;
import recitelyric.reciter.recitesequence.ReciteSequenceNormal;

import java.util.ArrayList;
import java.util.List;

public class NormalSubjectOnlyDefaultReciter implements LyricReciter {
    private String prefix;
    private List<Pair> verses;
    private final DisplayVerseBehaviour subjectOnlyDisplay;
    private final GenerateLyricBehaviour defaultLyricGenerator;
    private final ReciteSequenceBehaviour normalSequenceReciter;

    public NormalSubjectOnlyDefaultReciter(String prefix, List<Pair> verses) {
        this.prefix = prefix;
        this.verses = new ArrayList<>(verses);
        this.subjectOnlyDisplay = new DisplayVerseSubjectOnly();
        this.defaultLyricGenerator = new GenerateLyricDefault(subjectOnlyDisplay);
        this.normalSequenceReciter = new ReciteSequenceNormal(defaultLyricGenerator);

    }

    @Override
    public void recite(int count) throws Exception {
        System.out.println(normalSequenceReciter.constructLyric(prefix, verses, count));;
    }
}
