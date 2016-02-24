package com.rayhan.android.nominate.interfacer;

public interface Socket {
   public String sendHTTPRequest(String params);
   public int startListeningPort(int port);
   public void stopListening();
   public void exit();
}
