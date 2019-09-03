package com.eladcohen.capainstallref;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.content.SharedPreferences.Editor;
import android.app.Activity;

@NativePlugin()
public class Receiver extends BroadcastReceiver {
   
   private static final String PREFS_NAME = "CapacitorStorage";
   private static final String TAG = "InstallReceiver";

        public void onReceive(Context context, Intent intent)
        {
            Log.e(TAG, "Context: " + context);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String referrerString = extras.getString("referrer");
                if (referrerString != null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);;
                    Log.e(TAG, "Extras:");
                    for (String keys : extras.keySet())
                    {
                        Log.e(TAG, keys + " -> " + extras.get(keys));
                    }
                    Editor edit = sharedPreferences.edit();
                    edit.putString("referrer", referrerString);
                    edit.commit();
                }
            }


        }
}
