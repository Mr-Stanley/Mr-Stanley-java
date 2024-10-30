package ofofo.service;


import ofofo.data.models.Diary;
import ofofo.data.repositories.DiaryRepository;
import ofofo.data.repositories.DiaryRepositoryImpl;

public class DiaryServiceImpl implements DiaryService{
    private final DiaryRepository diaryRepository = new DiaryRepositoryImpl();
    private int count = 0;
    private boolean isRegistered = false;
    private boolean isLoggedIn = false;


    @Override
    public String register(String username, String password) {
        Diary checkedUsername = diaryRepository.findById(username.toLowerCase());
        if(checkedUsername != null) {
            isRegistered = false;
            throw new IllegalArgumentException("Please register a user first");
        }
        else{
            Diary diary = new Diary();
            diary.setUserName(username.toLowerCase());
            diary.setPassword(password);
            diaryRepository.save(diary);
            count++;
            isRegistered = true;
            isLoggedIn = true;
            return "Registration successful";

        }


    }

    @Override
    public String login(String username, String password) {
        Diary checkedUsername = diaryRepository.findById(username.toLowerCase());
        if(checkedUsername != null) {
            Diary diary = diaryRepository.findById(username.toLowerCase());
            if(diary.getUserName().equals(username) && diary.getPassword().equals(password)) {
                isLoggedIn = true;
                isRegistered = true;
                return "Login successful";
            }
            else{
                isLoggedIn = false;
                return "Login failed";
            }


        }
        return "Login Successful";
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean isLoggedIn() {
        if(isRegistered == true);
        isLoggedIn = true;
        return isLoggedIn;
    }

    @Override
    public boolean isRegistered() {
        return isRegistered;
    }

    @Override
    public String deleteDiary(String username, String password) {
        Diary checkedUsername = diaryRepository.findById(username.toLowerCase());
        if(checkedUsername != null) {
            if (checkedUsername.getPassword().equals(password)) {
                diaryRepository.delete(checkedUsername);
                count--;
                return "Diary entry deleted successfully.";
            } else {
                return "Deletion failed: Incorrect password.";
            }
        }
        return "Deletion failed: User does not exist.";

    }
}
