package recitelyric.reciter.display;

import recitelyric.entity.Pair;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static recitelyric.constant.Constant.COMMA_DELIMITER;
import static recitelyric.constant.Constant.SPACE_DELIMITER;

public class DisplayVerseSubjectOnly implements DisplayVerseBehaviour {
    public DisplayVerseSubjectOnly() {}

    @Override
    public String getVerse(Pair verse, boolean firstVerse) {
        String subjectVerse = extractSubject(verse);
        String prefixVerse = "";
        if (!firstVerse) {
            prefixVerse += COMMA_DELIMITER;
        }

        return (prefixVerse + SPACE_DELIMITER + subjectVerse);
    }

    private String extractSubject(Pair verse) {
        if (verse.getRight() != null) {
            return verse.getRight();
        } else if (verse.getLeft() == null) {
            return null;
        }

        // find last occurrences of subject word if subjects more than 1
        Pattern pattern = Pattern.compile("(and the)\\s*(\\w+)");
        Matcher matcher = pattern.matcher(verse.getLeft());
        String lastSubjectWord = null;
        while (matcher.find()) {
            lastSubjectWord = matcher.group();
        }
        if (lastSubjectWord == null) {
            // if subject only 1 then find first subject word
            pattern = Pattern.compile("(the)\\s*(\\w+)");
            matcher = pattern.matcher(verse.getLeft());
            if (matcher.find()) {
                lastSubjectWord = matcher.group();
            }
        }
        // substring verse into subject only
        if (lastSubjectWord != null) {
            int lastIndexOfLastSubjectWord = verse.getLeft().lastIndexOf(lastSubjectWord) + lastSubjectWord.length();
            return verse.getLeft().substring(0, lastIndexOfLastSubjectWord);
        }
        return null;
    }
}
