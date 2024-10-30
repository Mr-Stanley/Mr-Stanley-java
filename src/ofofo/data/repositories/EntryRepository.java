package ofofo.data.repositories;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;

import java.time.LocalDateTime;
import java.util.List;


public interface EntryRepository {
    List<Entry> getEntries();
    Entry getEntryById(int id);
    Diary id(String id);
    Entry title(String title);
    Entry Body(String body);
    LocalDateTime dateCreated(LocalDateTime dateCreated);
    void delete();
    Entry save();
    int  count();



}
