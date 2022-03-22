package recitelyric.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import recitelyric.reciter.NormalFullVerseDefaultReciter;
import recitelyric.reciter.NormalSubjectOnlyDefaultReciter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static recitelyric.constant.Constant.INPUT_WITH_NULL_VERSES;
import static recitelyric.constant.Constant.INPUT_PREFIX;
import static recitelyric.constant.Constant.INPUT_VERSES_AND_SUBJECTS;
import static recitelyric.constant.Constant.INPUT_WITH_INVALID_SUBJECT_VERSES;

public class JackHouseLyricTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void afterEach() {
        System.setOut(null);
    }

    @Test
    void  givenZeroCount_whenReciteJackHouseLyric_shouldThrowException() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        Assertions.assertThrows(Exception.class, () -> lyricReciter.recite(0), "Invalid parameters");
    }

    @Test
    void givenInvalidCount_whenReciteJackHouseLyric_shouldThrowException() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        Assertions.assertThrows(Exception.class, () -> lyricReciter.recite(100), "Invalid parameters");
    }

    @Test
    void givenEmptyVerses_whenReciteJackHouseLyric_shouldThrowException() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, new ArrayList<>()));
        Assertions.assertThrows(Exception.class, () -> lyricReciter.recite(100), "Invalid parameters");
    }

    @Test
    void givenNullStringVerses_whenReciteJackHouseLyricFullVerse_shouldPrintNullLyric() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, INPUT_WITH_NULL_VERSES));
        Assertions.assertDoesNotThrow(() -> lyricReciter.recite(1));
        Assertions.assertTrue(outContent.toString().contains("null"));
    }

    @Test
    void givenInvalidSubjectVerses_whenReciteJackHouseLyricSubjectOnly_shouldPrintNullLyric() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalSubjectOnlyDefaultReciter(INPUT_PREFIX, INPUT_WITH_INVALID_SUBJECT_VERSES));
        Assertions.assertDoesNotThrow(() -> lyricReciter.recite(1));
        Assertions.assertTrue(outContent.toString().contains("null"));
    }

    @Test
    void givenValidInput_whenReciteJackHouseLyricFullVerse_shouldReturnCorrectFullVerseLyric() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalFullVerseDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        Assertions.assertDoesNotThrow(() -> lyricReciter.recite(12));
        Assertions.assertEquals("This is the horse and the hound and the horn that belonged to the farmer " +
                "sowing his corn that kept the rooster that crowed in the morn that woke " +
                "the priest all shaven and shorn that married the man all tattered and " +
                "torn that kissed the maiden all forlorn that milked the cow with the " +
                "crumpled horn that tossed the dog that worried the cat that killed the " +
                "rat that ate the malt that lay in the house that Jack built\n", outContent.toString());
    }

    @Test
    void givenValidInput_whenReciteJackHouseLyricSubjectOnly_shouldReturnCorrectSubjectOnlyLyric() {
        JackHouseLyric lyricReciter = new JackHouseLyric(new NormalSubjectOnlyDefaultReciter(INPUT_PREFIX, INPUT_VERSES_AND_SUBJECTS));
        Assertions.assertDoesNotThrow(() -> lyricReciter.recite(2));
        Assertions.assertEquals("This is the malt, the house\n", outContent.toString());
    }
}
