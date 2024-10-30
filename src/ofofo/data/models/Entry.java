package ofofo.data.models;

import java.time.LocalDateTime;

public class Entry {
   private int id;
   private String title;
   private String body;
   private LocalDateTime dateTime = LocalDateTime.now();


   public Entry(int id, String title, String body) {
      this.id = id;
      this.title = title;
      this.body = body;
      this.dateTime = LocalDateTime.now();
   }

   public String getBody() {
      return body;
   }

   public void setBody(String body) {
      this.body = body;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public LocalDateTime getDateTime() {
      return dateTime;
   }

   public void setDateTime(LocalDateTime dateTime) {
      this.dateTime = dateTime;
   }


}



