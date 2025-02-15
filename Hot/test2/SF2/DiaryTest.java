package SF2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void TestThatDiaryIsCreated(){
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        assertTrue(diary.Exist());
    }
    @Test
    public void TestThatDiaryIsLocked(){
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName,password);
        assertTrue(diary.Exist());
        assertTrue(diary.isLocked);
    }
    @Test
    public void TestThatDiaryIsNotLocked(){
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName,password);
        assertTrue(diary.Exist());
        diary.unLockDiary("Password");
    }
    @Test
    public void TestThatDiaryCanBeUnlockWithOnlyCorrectPassword(){
            String userName = "UserName";
            String password = "Password";
            Diary diary = new Diary(userName,password);
            assertTrue(diary.Exist());
            diary.unLockDiary("Password");
            assertFalse(diary.isLocked);
    }
    @Test
    public void TestThatDiaryCannotBeUnlockWithAnIncorrectPassword(){
            String userName = "UserName";
            String password = "Password";
            Diary diary = new Diary(userName,password);
            assertTrue(diary.Exist());
            diary.unLockDiary("      ");
            assertTrue(diary.isLocked);
    }
    @Test
    public void testThat_Cannot_Create_Entry_when_Unlock() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        assertThrows(IllegalStateException.class, () -> diary.createEntry("title Name", "content in title"));
    }

    @Test
    public void testThat_Diary_CantCreateEntry_with_Empty_TitleAndBody () {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        assertThrows(IllegalArgumentException.class, () -> diary.createEntry("", "Content in title"));
        assertThrows(IllegalArgumentException.class, () -> diary.createEntry("Title Name", ""));
    }

    @Test
    public void testThat_We_Can_Find_Entry_by_Id() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        diary.createEntry("Title Name", "Content in the title");
        diary.createEntry("semiColon", "Everything thing is not all about coding....what matters the most is the right solution");

        Entry foundEntry = diary.findEntryById(1);
        assertNotNull(foundEntry);
        assertEquals("Title Name", foundEntry.getTitle());

    }
    @Test
    public void testWhen_Find_Entry_That_Is_NotIn_Diary_To_Return_Null() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        assertNull(diary.findEntryById(37));
    }

    @Test
    public void testThat_Can_Update_Entry_Available_In_Diary() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");

        diary.createEntry("Title Name", "Content in the title");
        diary.updateEntry(1, "New Title Name", "New Content");

        Entry updatedEntry = diary.findEntryById(1);
        assertEquals("New Title Name", updatedEntry.getTitle());
        assertEquals("New Content", updatedEntry.getContent());


    }
    @Test
    public void testThat_Can_Delete_Entry_Available_In_Diary() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        diary.deleteEntry(1);
        assertNull(diary.findEntryById(1));
    }
    @Test
    public void testThat_updating_NonExistentEntry_ThrowsException() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        assertThrows(IllegalArgumentException.class, () -> diary.updateEntry(99, "NonExisting Title", "NonExisting Content"));

    }
    @Test
    public void testThatCan_Delete_Entry_In_Diary() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        diary.createEntry("Title", "This a test");
        diary.deleteEntry(1);
        assertNull(diary.findEntryById(1));


    }

    @Test
    public void test_Deleting_NonExistent_EntryDoes_Nothing() {
        String userName = "UserName";
        String password = "Password";
        Diary diary = new Diary(userName, password);
        diary.unLockDiary("Password");
        assertDoesNotThrow(() -> diary.deleteEntry(81));
    }
}




