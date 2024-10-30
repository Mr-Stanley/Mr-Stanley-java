package ofofo.service;

public interface DiaryService {
    String register(String username, String password);
    String login(String username, String password);
    int count();
    boolean isLoggedIn();
    boolean isRegistered();
    String deleteDiary(String username, String password);

}
