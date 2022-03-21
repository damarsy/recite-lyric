package recitelyric.reciter.generator;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.List;

public abstract class GenerateLyricBehaviour {
    final DisplayVerseBehaviour displayBehaviour;

    public GenerateLyricBehaviour(DisplayVerseBehaviour displayBehaviour) {
        this.displayBehaviour = displayBehaviour;
    }

    public abstract String getFullLyric(String prefix, List<Pair> verses, int count) throws Exception;
}
