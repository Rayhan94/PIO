package com.rayhan.android.nominate.interfacer;

import com.example.nominater.type.InfoFriends;
import com.example.nominater.type.InfoOfMessage;

public interface Updater {
	public void updateData(InfoOfMessage[] message, InfoFriends[] friends, InfoFriends[] unApprovedFriends, String userKey);

}
