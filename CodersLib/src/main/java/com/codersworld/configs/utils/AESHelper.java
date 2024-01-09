package com.codersworld.configs.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class AESHelper {

    public String safeEncryption(Context context, String strParam,String token,String userid) {
         try {
            strParam = DhanukaMain.SafeOBuddyEncryptUtils(strParam, token, userid);
            return strParam;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String safeDecryption(String response, final Activity context) {
        String responses = "";
        try {
            responses = DhanukaMain.SafeOBuddyDecryptUtils(response);
           // Log.e("responses12",responses);
            JSONObject jsonObject = new JSONObject(responses);
            int success = jsonObject.getInt("success");
            if (success == 9999) {
                return "";
            } else {
                return responses;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responses;
    }

}
