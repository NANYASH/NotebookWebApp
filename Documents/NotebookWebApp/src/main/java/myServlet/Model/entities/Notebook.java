package myServlet.Model.entities;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nanya on 7/28/17.
 */
public class Notebook {

    private  List<Note> noteList;

    public Notebook() {
        this.noteList =new LinkedList<Note>();
    }

    public void addNote(Note note){

        noteList.add(note);
    };

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "noteList=" + noteList +
                '}';
    }
}
