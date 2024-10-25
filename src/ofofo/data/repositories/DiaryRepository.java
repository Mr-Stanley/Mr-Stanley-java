package ofofo.data.repositories;

import ofofo.data.models.Diary;

import java.util.List;

public interface DiaryRepository {
    Diary save(Diary diary);
    List<Diary> findByTittle(String tittle);
    void delete(int id);
    void delete(Diary diary);
    long count();
    Diary findById(String id);


}
