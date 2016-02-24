package com.rayhan.nominate.toolbox;

import com.example.nominater.type.InfoFriends;

public class ControllerOfFriend {
	public static InfoFriends[] friendsInfo = null;
	public static InfoFriends[] unapprovedFriends = null;
	public String activeFriends;
	
	public static void setFriendsInfo(InfoFriends[] friends)
	{
		ControllerOfFriend.friendsInfo = friends;
	}
	
	public static InfoFriends checkFriends(String username, String userKey)
	{
		InfoFriends result = null;
		if(friendsInfo)
	}

}
