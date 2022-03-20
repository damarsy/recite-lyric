package recitelyric.entity;

public class LyricPrefix implements Lyric {
    private String prefix;

    public LyricPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String getLyric() {
        return prefix;
    }
}
