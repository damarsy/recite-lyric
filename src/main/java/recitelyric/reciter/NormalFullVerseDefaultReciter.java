package recitelyric.reciter;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;
import recitelyric.reciter.display.DisplayVerseFull;
import recitelyric.reciter.generator.GenerateLyricBehaviour;
import recitelyric.reciter.generator.GenerateLyricDefault;
import recitelyric.reciter.recitesequence.ReciteSequenceBehaviour;
import recitelyric.reciter.recitesequence.ReciteSequenceNormal;

import java.util.ArrayList;
import java.util.List;

public class NormalFullVerseDefaultReciter implements LyricReciter {
    private String prefix;
    private List<Pair> verses;
    private DisplayVerseBehaviour fullVerseDisplay;
    private GenerateLyricBehaviour defaultLyricGenerator;
    private ReciteSequenceBehaviour normalSequenceReciter;

    public NormalFullVerseDefaultReciter(String prefix, List<Pair> verses) {
        this.prefix = prefix;
        this.verses = new ArrayList<>(verses);
        this.fullVerseDisplay = new DisplayVerseFull();
        this.defaultLyricGenerator = new GenerateLyricDefault();
        this.normalSequenceReciter = new ReciteSequenceNormal();

    }

    @Override
    public void recite(int count) throws Exception {
        System.out.println(normalSequenceReciter.constructLyric(defaultLyricGenerator, fullVerseDisplay, prefix, verses, count));;
    }
}
