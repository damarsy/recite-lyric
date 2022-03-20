package recitelyric.reciter.generator;

import recitelyric.entity.Pair;
import recitelyric.reciter.display.DisplayVerseBehaviour;

import java.util.List;

public interface GenerateLyricBehaviour {
    String getFullLyric(DisplayVerseBehaviour displayBehaviour, String prefix, List<Pair> verses, int count) throws Exception;
}
