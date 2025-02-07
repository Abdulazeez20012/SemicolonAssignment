package Dsa;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Test
    public void testThatDiaryIsCreated() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        assertTrue(diary.itExit());
    }

    @Test
    public void testThat_Diary_IsLock() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        assertTrue(diary.itExit());
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThat_Diary_Is_NotLock() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        assertTrue(diary.itExit());
        diary.unlockDiary("test123");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeUnlockedWithCorrectPassword() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCannotBeUnlockedWithIncorrectPassword() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test1234");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThat_Cannot_Create_Entry_when_Unlock() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        assertThrows(IllegalStateException.class, () -> diary.createEntry("My title", "i am good"));
    }

    @Test
    public void testThat_Diary_CantCreateEntry_with_Empty_TitleAndBody () {
        String userName = "test";
        String password = "test123";
         Diary diary = new Diary(userName, password);
         diary.unlockDiary("test123");
        assertThrows(IllegalArgumentException.class, () -> diary.createEntry("", "This is a test"));
        assertThrows(IllegalArgumentException.class, () -> diary.createEntry("Title", ""));
    }

    @Test
    public void testThat_We_Can_Find_Entry_by_Id() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        diary.createEntry("Title", "This is a test");
        diary.createEntry("semiColon", "Everything thing is not all about coding....what matters the most is the right solution");

        Entry foundEntry = diary.findEntryById(1);
        assertNotNull(foundEntry);
        assertEquals("Title", foundEntry.getTitle());


    }

    @Test
    public void testWhen_Find_Entry_That_Is_NotIn_Diary_To_Return_Null() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        assertNull(diary.findEntryById(37));
    }

    @Test
    public void testThat_Can_Update_Entry_Avaialable_In_Diary() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");

        diary.createEntry("Old Title", "Old Content");
        diary.updateEntry(1, "New Title", "New Content");

        Entry updatedEntry = diary.findEntryById(1);
        assertEquals("New Title", updatedEntry.getTitle());
        assertEquals("New Content", updatedEntry.getContent());


    }
    @Test
    public void testThat_Can_Delete_Entry_Avaialable_In_Diary() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        diary.deleteEntry(1);
        assertEquals(null, diary.findEntryById(1));
    }
    @Test
    public void testThat_updating_NonExistentEntry_ThrowsException() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        assertThrows(IllegalArgumentException.class, () -> diary.updateEntry(99, "NonExisting Title", "NonExisting Content"));

    }
    @Test
    public void testThatCan_Delete_Entry_In_Diary() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        diary.createEntry("Title", "This a test");
        diary.deleteEntry(1);
        assertNull(diary.findEntryById(1));


    }

    @Test
    public void test_Deleting_NonExistent_EntryDoes_Nothing() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        assertDoesNotThrow(() -> diary.deleteEntry(81));
    }
}

    /*
    @Test
    public void testThat_WhenUpdating_Entry_It_Changes_Timestamp() {
        String userName = "test";
        String password = "test123";
        Diary diary = new Diary(userName, password);
        diary.unlockDiary("test123");
        diary.createEntry("Title", "This is a test");
        Entry entry = diary.findEntryById(1);
        LocalDateTime oldTimestamp = entry.getDateCreated();
        try { Thread.sleep(1000); } catch (InterruptedException ignored) { entry.printStackTrace(); }
        diary.updateEntry(1, "New Title", "New Content");
        LocalDateTime newTimestamp = entry.getDateCreated();

        assertTrue(newTimestamp.isAfter(oldTimestamp));
    }
*/