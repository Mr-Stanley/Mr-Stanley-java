package RepositoryTest;

import ofofo.data.models.Diary;
import ofofo.data.repositories.DiaryRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiaryRepositoryImplTest {
    private final DiaryRepositoryImpl diaryRepository = new DiaryRepositoryImpl();

    @Test
    public void testIfDiaryISEmpty() {
        assertEquals( true, diaryRepository.isEmpty());
        assertEquals( 0, diaryRepository.count());
    }

    @Test
    public void testThatIcanAddAnEntryAndDiaryIsNotEmpty() {
        assertEquals(0, diaryRepository.count());
        Diary newDiary = new Diary("userName", "password");
        diaryRepository.save(newDiary);
        assertEquals(1, diaryRepository.count());
        assertEquals(1, diaryRepository.getSize());
    }
    @Test
    public void testThatICanSaveNewEntry_InDiary() {
        assertEquals( 0, diaryRepository.count());
        Diary newDiary = new Diary("userName", "password");
        diaryRepository.save(newDiary);
        Diary newDiary1 = new Diary("Stan", "password1");
        diaryRepository.save(newDiary1);
        Diary newDiary2 = new Diary("Stanley", "password2");
        diaryRepository.save(newDiary2);
        assertEquals( 3, diaryRepository.count());

    }

    @Test
    public void testThatICanAddThreeDiariesAndDelete_oneDiary() {

        Diary newDiary = new Diary("userName", "password");
        diaryRepository.save(newDiary);
        Diary newDiary1 = new Diary("Stan", "password1");
        diaryRepository.save(newDiary1);
        Diary newDiary2 = new Diary("Stanley", "password2");
        diaryRepository.save(newDiary2);
        diaryRepository.delete(newDiary1);
        assertEquals(diaryRepository.count(), 2);

    }
    @Test
    public void testThatICanFindAnEntryById_InDiary() {
        Diary newDiary = new Diary("userName", "password");
        diaryRepository.save(newDiary);
        Diary newDiary1 = new Diary("Stan", "password1");
        diaryRepository.save(newDiary1);
        Diary newDiary2 = new Diary("Stanley", "password2");
        diaryRepository.save(newDiary2);
        Diary expectedUsername = diaryRepository.findById("Stanley");

        assertEquals("Stanley", expectedUsername.getUserName());




    }
}
