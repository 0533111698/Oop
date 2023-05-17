package oop.exs3;

public class Note {
    private String title;
    private String bodyOfNote;
    private int date;
    private Status status;

    private int numOfNotes;

    public Note(String title, String bodyOfNote, int date, Status status) {
        this.title = title;
        this.bodyOfNote = bodyOfNote;
        this.date = date;
        this.status = status;
        numOfNotes++;
    }

    public String getTitle() {
        return title;
    }

    public String getBodyOfNote() {
        return bodyOfNote;
    }

    public int getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBodyOfNote(String bodyOfNote) {
        this.bodyOfNote = bodyOfNote;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
