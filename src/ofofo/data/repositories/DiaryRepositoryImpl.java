package ofofo.data.repositories;

import ofofo.data.models.Diary;

import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private int users ;


    @Override
    public Diary save(Diary diary) {
        users++ ;
        return users == 1 ? diary : null ;
    }

    @Override
    public List<Diary> findByTittle(String tittle) {
       return null;
    }

    @Override
    public void delete(int id) {
        users--;

    }

    @Override
    public void delete(Diary diary) {
        users--;

    }

    @Override
    public long count() {
        return users;

    }

    @Override
    public Diary findById(String id) {
        return null;
    }

}
