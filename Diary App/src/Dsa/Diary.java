package Dsa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private final String userName;
    private final String password;
    private boolean isLocked;
    private final List<Entry> entries;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public boolean itExit() {
        return true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean unlockDiary(String inputPassword) {
        if (inputPassword.equals(password)) this.isLocked = false;
        return false;
    }

    public void createEntry(String title, String content) {
        if (isLocked) throw new IllegalStateException("Diary is locked! Unlock it to create an entry.");
        if (title.isBlank() || content.isBlank()) throw new IllegalArgumentException("Title and body cannot be empty.");
        int newId = entries.size() + 1;
        Entry entry = new Entry(newId, title, content);
        entries.add(entry);
    }

    public Entry findEntryById(int id) {
      for (Entry entry : entries) if (entry.getId() == id) return entry;
      return null;
    }

    public void updateEntry(int id, String newTitle, String newContent) {
        Entry entry = findEntryById(id);
        if (entry == null) throw new IllegalArgumentException("Entry with ID " + id + " not found.");
        entry.setTitle(newTitle);
        entry.setContent(newContent);
        entry.setDateCreated(LocalDateTime.now());
    }

    public void deleteEntry(int id) {
        entries.removeIf(entry -> entry.getId() == id);


    }
    public String getUserName() {
        return userName;
    }
}
