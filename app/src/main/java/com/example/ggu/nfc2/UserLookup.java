package com.example.ggu.nfc2;

import com.example.ggu.nfc2.record.ParsedNdefRecord;
import com.example.ggu.nfc2.record.TextRecord;

import java.util.Objects;

/**
 * Created by GGU on 3/6/2016.
 */
public final class UserLookup {

    public static String lookupUser(ParsedNdefRecord record) {
        String id = lookupUserID(record);
        String user = findUserInDB(id);
        return user;
    }

    private static String findUserInDB(String id) {
        if (id.equals("2736005937")) return"Mark Santolucito";
        else return "Unknown ID = ("+id+")";
    }

    public static String lookupUserID(ParsedNdefRecord record) {

        String allData = new String(record.getPayload());
        String[] a = allData.split("\n");
        String decID = a[1].split(": ")[1];
        return decID;
    }
}
