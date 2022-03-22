package recitelyric.main;

import recitelyric.entity.Pair;
import recitelyric.reciter.NormalFullVerseDefaultReciter;
import recitelyric.reciter.NormalSubjectOnlyDefaultReciter;
import recitelyric.reciter.RandomFullVerseDefaultReciter;
import recitelyric.reciter.RandomSubjectOnlyDefaultReciter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static recitelyric.constant.Constant.INPUT_PREFIX;
import static recitelyric.constant.Constant.INPUT_VERSES_AND_SUBJECTS;
import static recitelyric.constant.Constant.INPUT_VERSES_ONLY;

public class ReciteLyricMain {
    public static void main(String[] args) throws Exception {
        reciteLyrics();
    }

    private static void reciteLyrics() throws Exception {
        // full verse normal reciter with verse and subject param
        System.out.println("Full verse normal reciter");
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        lyricReciter.recite(12);

        // full verse normal reciter with verse only param
        JackHouseLyric lyricReciter2 = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_ONLY));
        lyricReciter2.recite(12);

        System.out.println();
        System.out.println("Full verse random reciter");
        // full verse random reciter with verse and subject param
        JackHouseLyric lyricReciter3 = new JackHouseLyric(new RandomFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        lyricReciter3.recite(12);

        // full verse random reciter with verse only param
        JackHouseLyric lyricReciter4 = new JackHouseLyric(new RandomFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_ONLY));
        lyricReciter4.recite(12);

        System.out.println();
        System.out.println("Subject only normal reciter");
        // subject only normal reciter with verse and subject param
        JackHouseLyric lyricReciter5 = new JackHouseLyric(new NormalSubjectOnlyDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        lyricReciter5.recite(12);

        // subject only normal reciter with verse only param
        JackHouseLyric lyricReciter6 = new JackHouseLyric(new NormalSubjectOnlyDefaultReciter(INPUT_PREFIX, INPUT_VERSES_ONLY));
        lyricReciter6.recite(12);

        System.out.println();
        System.out.println("Subject only random reciter");
        // subject only random reciter with verse and subject param
        JackHouseLyric lyricReciter7 = new JackHouseLyric(new RandomSubjectOnlyDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        lyricReciter7.recite(12);

        // subject only random reciter with verse only param
        JackHouseLyric lyricReciter8 = new JackHouseLyric(new RandomSubjectOnlyDefaultReciter(INPUT_PREFIX, INPUT_VERSES_ONLY));
        lyricReciter8.recite(12);
    }

    private static List<Pair> prepareDataVerseAndSubject() {
        return new ArrayList<>(Arrays.asList(
                new Pair("the horse and the hound and the horn that belonged to", "the horse and the hound and the horn"),
                new Pair("the farmer sowing his corn that kept", "the farmer"),
                new Pair("the rooster that crowed in the morn that woke", "the rooster"),
                new Pair("the priest all shaven and shorn that married", "the priest"),
                new Pair("the man all tattered and torn that kissed", "the man"),
                new Pair("the maiden all forlorn that milked", "the maiden"),
                new Pair("the cow with the crumpled horn that tossed", "the cow"),
                new Pair("the dog that worried", "the dog"),
                new Pair("the cat that killed", "the cat"),
                new Pair("the rat that ate", "the rat"),
                new Pair("the malt that lay in", "the malt"),
                new Pair("the house that Jack built", "the house")
        ));
    }

    private static List<Pair> prepareDataVerseOnly() {
        return new ArrayList<>(Arrays.asList(
                new Pair("the horse and the hound and the horn that belonged to"),
                new Pair("the farmer sowing his corn that kept"),
                new Pair("the rooster that crowed in the morn that woke"),
                new Pair("the priest all shaven and shorn that married"),
                new Pair("the man all tattered and torn that kissed"),
                new Pair("the maiden all forlorn that milked"),
                new Pair("the cow with the crumpled horn that tossed"),
                new Pair("the dog that worried"),
                new Pair("the cat that killed"),
                new Pair("the rat that ate"),
                new Pair("the malt that lay in"),
                new Pair("the house that Jack built")
        ));
    }
}
