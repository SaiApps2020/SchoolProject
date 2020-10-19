package com.example.schoolproject.Model;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.example.schoolproject.Intractor.LoginIntractor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LoginApiCall implements LoginIntractor.model {
    private String TAG = getClass().getName();
    private LoginModel modelLogin;

    @Override
    public void getLoginDetails(Context context, onFinishedListener listener) {
        try {
            JSONObject jsonObject = new JSONObject(getJsonDataFromLocalFile(context));
            /*JSONArray array = jsonObject.getJSONArray("array");*/
            String status = jsonObject.getString("status");
            Log.e(TAG, status);
            listener.onFinish(status);
            modelLogin = new LoginModel();
            modelLogin.setStatus(status);
            /*for (int i = 0; i < array.length(); i++) {
                JSONObject object = array.getJSONObject(i);
                String city = object.getString("city");
                cityList.add(city);
            }*/
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String getJsonDataFromLocalFile(Context context) {
        String jsonString = null;
        try {
            InputStream inputStream = context.getAssets().open("login.json");
            int fileSize = inputStream.available();
            byte[] buffer = new byte[fileSize];
            inputStream.read(buffer);
            inputStream.close();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                jsonString = new String(buffer, StandardCharsets.UTF_8);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return jsonString;
    }
}
