package ofofo.data.models;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked;
    private String userName;
    private String password;
    List<Entry> entries;



    public Diary(String userName, String password) {
        isLocked = false;
        this.userName = userName;
        this.password = password;
        entries = new ArrayList<>();
    }

    public Diary() {

    }


    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        this.isLocked = isLocked;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }





}
