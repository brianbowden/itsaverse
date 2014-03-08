package com.itsaverse.app.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class Utils {

    public static String getData(Context ctx, String field) {
        try {
            SharedPreferences prefs = ctx.getSharedPreferences("com.itsaverse.app", Context.MODE_PRIVATE);
            return prefs.getString("com.itsaverse.app." + field.toLowerCase(), null);
        } catch (Exception e) {
            return null;
        }
    }

    public static void setData(Context ctx, String field, String value) {
        try {
            SharedPreferences prefs = ctx.getSharedPreferences("com.itsaverse.app", Context.MODE_PRIVATE);
            prefs.edit().putString("com.itsaverse.app." + field.toLowerCase(), value).commit();
        } catch (Exception e) {
            Log.d("ITSAVERSE PREFS", "Error setting pref: " + e.getMessage());
        }
    }

}
