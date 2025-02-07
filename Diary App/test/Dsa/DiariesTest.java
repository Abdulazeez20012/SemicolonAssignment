package Dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    @Test
    public void testThanCanAddAndFindDiary() {
        Diaries diaries = new Diaries();
        Diary diary1 = new Diary("Azeez", "24434");
        Diary diary2 = new Diary("Muhammad", "20001");

        diaries.addDiary(diary1);
        diaries.addDiary(diary2);

        Diary foundAzeezDiary = diaries.findDiaryByUserName("Azeez");
        Diary foundMuhammadDiary = diaries.findDiaryByUserName("Muhammad");
        assertNotNull(foundAzeezDiary, " Diary should have been found");
        assertNotNull(foundMuhammadDiary, " Diary should have been found");

        assertEquals("Azeez", foundAzeezDiary.getUserName());
        assertEquals("Muhammad", foundMuhammadDiary.getUserName());


    }

    @Test
    public void testFindingNonExistentDiaryReturnsNull() {
        Diaries diaries = new Diaries();
        Diary diary1 = new Diary("Azeez", "24434");
        diaries.addDiary(diary1);

        assertNull(diaries.findDiaryByUsername("bro"), "Should return null for a non-existent diary.");
    }

    @Test
    public void testCanDeleteDiary() {
        Diaries diaries = new Diaries();
        Diary diary1 = new Diary("Azeez", "24434");
        Diary diary2 = new Diary("Muhammad", "20001");
        diaries.addDiary(diary1);
        diaries.addDiary(diary2);

        diaries.deleteDiary("Azeez");

        assertNull(diaries.findDiaryByUsername("Azeez"), "Diary should have been deleted");
        assertNotNull(diaries.findDiaryByUsername("Muhammad"), "Diary should still be present");
    }
}
