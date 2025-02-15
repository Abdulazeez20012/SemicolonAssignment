package SF2;

import java.time.LocalDateTime;


public class Entry {
    private String title;
    private String content;
    private final int id;
    private LocalDateTime dateCreated;

    public Entry(String title, String content, int id) {
        this.title = title;
        this.content = content;
        this.id = id;
}
    public Entry(int Id, String title, String content) {
        this.title = title;
        this.content = content;
        this.id = Id;
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}

