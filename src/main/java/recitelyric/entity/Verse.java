package recitelyric.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Verse extends LyricDecorator {
    private Lyric lyric;
    private Pair verse;

    Verse(Lyric lyric, Pair verse) {
        this.lyric = lyric;
        this.verse = verse;
    }

    public String getLyric() {
        return lyric.getLyric() + getChosenVerse();
    }

    String getVerse() {
        return verse.getLeft();
    }

    String getSubject() {
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

    abstract String getChosenVerse();
}
