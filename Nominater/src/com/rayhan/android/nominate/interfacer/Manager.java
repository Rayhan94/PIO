package com.rayhan.android.nominate.interfacer;

import java.io.UnsupportedEncodingException;

public interface Manager {
	public String getUsername();
	public String sendMessage(String username, String toUsername, String message)throws UnsupportedEncodingException;
    public String authenticateUser(String username, String toUsername, String message)throws UnsupportedEncodingException;
    public void messageRecieved(String username, String message);
    
    public boolean isNetworkConnected();
    public boolean isUserAuthenticated();
    public String getLastRawFriendList();
    public void exit();
    public String signUpUser(String usernameText, String PasswordText, String email);
    public String addNewFriendRequest(String friendUsername);
    public String sendFriendsReqsResponse(String approvedFriendsName, String discaredFriendsName);
}
