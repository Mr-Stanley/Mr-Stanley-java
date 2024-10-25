package RepositoryTest;

import ofofo.data.models.Diary;
import ofofo.data.repositories.DiaryRepository;
import ofofo.data.repositories.DiaryRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiaryRepositoryTest {
    private final DiaryRepositoryImpl diaryRepository = new DiaryRepositoryImpl();

    @Test
    public void testIfDiaryISEmpty() {
        long value = diaryRepository.count();
        assertEquals(value, 0);
    }
    @Test
    public void testThatICanSaveNewEntry_InDiary() {
        long value = diaryRepository.count();
        assertEquals(value, 0);
        diaryRepository.save(new Diary());
        diaryRepository.save(new Diary());
        Assertions.assertEquals(diaryRepository.count(), 2);
    }

    @Test
    public void testThatICanDeleteAnEntry_InDiary() {
        diaryRepository.save(new Diary());
        diaryRepository.save(new Diary());
        diaryRepository.delete(new Diary());
        Assertions.assertEquals(diaryRepository.count(), 1);

    }
    @Test
    public void testThatICanFindAnEntry_InDiary() {
        diaryRepository.save(new Diary());

    }
}
