package recitelyric.reciter;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;
import recitelyric.reciter.display.DisplayVerseSubjectOnly;
import recitelyric.reciter.generator.GenerateLyricBehaviour;
import recitelyric.reciter.generator.GenerateLyricDefault;
import recitelyric.reciter.recitesequence.ReciteSequenceBehaviour;
import recitelyric.reciter.recitesequence.ReciteSequenceRandom;

import java.util.ArrayList;
import java.util.List;

public class RandomSubjectOnlyDefaultReciter implements LyricReciter {
    private String prefix;
    private List<Pair> verses;
    private DisplayVerseBehaviour subjectOnlyDisplay;
    private GenerateLyricBehaviour defaultLyricGenerator;
    private ReciteSequenceBehaviour randomSequenceReciter;

    public RandomSubjectOnlyDefaultReciter(String prefix, List<Pair> verses) {
        this.prefix = prefix;
        this.verses = new ArrayList<>(verses);
        this.subjectOnlyDisplay = new DisplayVerseSubjectOnly();
        this.defaultLyricGenerator = new GenerateLyricDefault();
        this.randomSequenceReciter = new ReciteSequenceRandom();

    }

    @Override
    public void recite(int count) throws Exception {
        System.out.println(randomSequenceReciter.constructLyric(defaultLyricGenerator, subjectOnlyDisplay, prefix, verses, count));;
    }
}
