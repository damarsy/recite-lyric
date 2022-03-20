package recitelyric.reciter;

import recitelyric.constant.DisplayVerseMethod;
import recitelyric.entity.Pair;

import java.util.ArrayList;
import java.util.List;

public class NormalDecoratorReciter extends DecoratorLyricReciter {
    private DisplayVerseMethod displayVerseMethod;
    private String prefix;
    private List<Pair> verses;

    public NormalDecoratorReciter(DisplayVerseMethod displayVerseMethod, String prefix, List<Pair> verses) {
        this.displayVerseMethod = displayVerseMethod;
        this.prefix = prefix;
        this.verses = new ArrayList<>(verses);
    }

    @Override
    public void recite(int count) throws Exception {
        System.out.println(getFullLyric(displayVerseMethod, prefix, verses, count));
    }
}
