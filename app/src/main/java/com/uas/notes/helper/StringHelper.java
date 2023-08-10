/**
 * NIM : 10120061
 * NAMA : Achmad Juliarman
 * KELAS : IF-2
 */
package com.uas.notes.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
