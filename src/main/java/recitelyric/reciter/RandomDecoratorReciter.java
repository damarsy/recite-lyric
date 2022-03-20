package recitelyric.reciter;

import recitelyric.constant.DisplayVerseMethod;
import recitelyric.entity.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomDecoratorReciter extends DecoratorLyricReciter {
    private DisplayVerseMethod displayVerseMethod;
    private String prefix;
    private List<Pair> verses;

    public RandomDecoratorReciter(DisplayVerseMethod displayVerseMethod, String prefix, List<Pair> verses) {
        this.displayVerseMethod = displayVerseMethod;
        this.prefix = prefix;
        this.verses = new ArrayList<>(verses);
    }

    @Override
    public void recite(int count) throws Exception {
        Collections.shuffle(verses);
        System.out.println(getFullLyric(displayVerseMethod, prefix, verses, count));
    }
}
