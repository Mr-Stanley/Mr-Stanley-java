package ofofo.service;

import ofofo.data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryServiceImplTest {

    private final DiaryServiceImpl diaryService = new DiaryServiceImpl();

    @Test
    public void testThatI_CanRegisterUser_andUserCountIsOne() {
        diaryService.register("Mrstan", "Stanley");
        assertEquals(1, diaryService.count());
    }

    @Test
    public void testThatI_CanRegisterMultioleUsers_andUserCountAdds() {
        diaryService.register("Mrstan", "Stanley");
        diaryService.register("stan", "Stanley081");
        diaryService.register("odumodu", "ugochukwu");
        assertEquals(3, diaryService.count());
    }

//    @Test
//    public void testThatUserCanloginOnlyWhenTheyAreRegistered() {
//        diaryService.login("Mrstan", "Stanley");
//        if("Mrstan")
//        assertThrows(IllegalArgumentException.class, () -> DiaryServiceImpl.register());
//
//    }


    @Test
    public void  testThatWhenI_registerThatI_canLogIn() {
        diaryService.register("Mrstan", "Stanley");
        diaryService.login("Mrstan", "Stanley");
        assertEquals(1, diaryService.count());
        assertEquals(true, diaryService.isLoggedIn());
    }

    @Test
    public void testThatI_canDeleteDiary() {
        diaryService.register("Mrstan", "Stanley");
        diaryService.register("stan", "Stanley081");
        diaryService.register("odumodu", "ugochukwu");
        assertEquals(3, diaryService.count());
        diaryService.deleteDiary("Mrstan", "Stanley");
        assertEquals(2, diaryService.count());
    }
}