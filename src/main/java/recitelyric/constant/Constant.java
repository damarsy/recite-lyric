package recitelyric.constant;

import recitelyric.entity.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constant {
    public static final String SPACE_DELIMITER = " ";
    public static final String COMMA_DELIMITER = ",";

    public static final String INPUT_PREFIX = "This is";
    public static final List<Pair> INPUT_VERSES_AND_SUBJECTS = new ArrayList<>(Arrays.asList(
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

    public static final List<Pair> INPUT_WITH_NULL_VERSES = new ArrayList<>(Arrays.asList(
            new Pair(null)
    ));

    public static final List<Pair> INPUT_WITH_INVALID_SUBJECT_VERSES = new ArrayList<>(Arrays.asList(
            new Pair("house that Jack built")
    ));

    public static final List<Pair> INPUT_VERSES_ONLY = new ArrayList<>(Arrays.asList(
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
