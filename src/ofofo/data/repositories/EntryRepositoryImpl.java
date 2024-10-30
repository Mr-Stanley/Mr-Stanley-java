package ofofo.data.repositories;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;

import java.time.LocalDateTime;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {

    @Override
    public List<Entry> getEntries() {
        return List.of();
    }

    @Override
    public Entry getEntryById(int id) {
        return null;
    }

    @Override
    public Diary id(String id) {
        return null;
    }

    @Override
    public Entry title(String title) {
        return null;
    }

    @Override
    public Entry Body(String body) {
        return null;
    }

    @Override
    public LocalDateTime dateCreated(LocalDateTime dateCreated) {
        return dateCreated;
    }

    @Override
    public void delete() {

    }

    @Override
    public Entry save() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
