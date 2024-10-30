package ofofo.data.repositories;

import ofofo.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries = new ArrayList<>();
    private long count = 0;

    public DiaryRepositoryImpl() {
        diaries = new ArrayList<>();
    }


    @Override
    public Diary save(Diary diary) {
        diaries.add(diary);
        count++;
        return null;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(int id) {
        for(int index =0; index < diaries.size(); index++){
            if(diaries.get(index).equals(id)){
                diaries.remove(index);
            }
        }
        count --;

    }

    @Override
    public void delete(Diary diary) {
        diaries.remove(diary);

    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public Diary findById(String userName) {
        List<Diary> foundDiaries = new ArrayList<>();
        for (Diary diary : diaries) {
            if(diary.getUserName().equalsIgnoreCase(userName)) {
                foundDiaries.add(diary);
                return foundDiaries.get(0);
            }

        }
        return null;
    }

    public int getSize() {
        return diaries.size();
    }
    public boolean isEmpty() {
        return diaries.isEmpty();
    }
    private List<Diary> getDiary(long id){
        return diaries;
    }
}
