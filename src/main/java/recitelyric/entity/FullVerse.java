package recitelyric.entity;

import static recitelyric.constant.Constant.SPACE_DELIMITER;

public class FullVerse extends Verse {
    public FullVerse(Lyric lyric, Pair verse) {
        super(lyric, verse);
    }

    @Override
    public String getChosenVerse() {
        return (SPACE_DELIMITER + super.getVerse());
    }
}
