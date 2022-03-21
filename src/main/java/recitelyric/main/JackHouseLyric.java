package recitelyric.main;

import recitelyric.reciter.LyricReciter;

public class JackHouseLyric {
    private final LyricReciter lyricReciter;

    public JackHouseLyric(LyricReciter lyricReciter) {
        this.lyricReciter = lyricReciter;
    }

    public void recite(int count) throws Exception {
        lyricReciter.recite(count);
    }
}
