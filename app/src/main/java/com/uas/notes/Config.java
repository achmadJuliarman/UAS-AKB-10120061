/**
 * NIM : 10120061
 * NAMA : Achmad Juliarman
 * KELAS : IF-2
 */
package com.uas.notes;

public class Config {

    public static String DB_URL = "https://uas-10120061-if2-default-rtdb.asia-southeast1.firebasedatabase.app/";
    public static String FCM_SERVER_KEY = "AAAATStni9I:APA91bFVhr9swXdhE7QhGTGARiSonL1T9pqyHz1hHMA28dYpBg21LEW0zZGD7VJfAFmmR9uhGJhuneRBK1SZsJ9WEX_7Y0QS_gtUVoIWGsEOEmVu4NK94vBLP6r2Mj3_H4Wavx3XMhTs";

    public static String getDB_URL() {
        return DB_URL;
    }

    public static String getFCM_SERVER_KEY() {
        return FCM_SERVER_KEY;
    }
}
