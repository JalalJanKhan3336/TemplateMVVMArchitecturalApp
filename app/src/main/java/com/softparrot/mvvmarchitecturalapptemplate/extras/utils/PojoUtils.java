package com.softparrot.mvvmarchitecturalapptemplate.extras.utils;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PojoUtils<T> {

    private final Gson gson;
    public PojoUtils(){
        gson = new Gson();
    }

    public T toPoJo(JSONObject response, Class<T> type) {
        return gson.fromJson(response.toString(), type);
    }

    public T toPoJo(String response, Class<T> type) {
        return gson.fromJson(response, type);
    }

    public String toJsonString(T value){
        return gson.toJson(value);
    }

    // Converts PoJo Object to Json Object
    public JSONObject toJson(T value){
        try {
            return new JSONObject(toJsonString(value));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public JSONArray toJsonArray(List<T> valueList){
        JSONArray array = new JSONArray();

        for(T value : valueList){
            String jsonStr = toJsonString(value);

            try {
                JSONObject json = new JSONObject(jsonStr);
                array.put(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return array;
    }

    public List<T> toPoJoList(JSONArray array, Class<T> type) {
        if(array != null && array.length() > 0){
            List<T> valueList = new ArrayList<>();

            for(int index = 0; index < array.length(); index++){
                try {
                    JSONObject object = array.getJSONObject(index);

                    if (object != null) {
                        T value = gson.fromJson(object.toString(), type);
                        valueList.add(value);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            return valueList;
        }

        return null;
    }

    public void logPoJo(T value, String TAG){
        Log.d(TAG, "_onLogPoJo_Ref: "+value);

        if(value != null)
            Log.d(TAG, "_onLogPoJo_Ref_Data:  = "+toJsonString(value));
    }

    // Just printing data to console for testing
    public void logPoJoList(List<T> list, String TAG) {
        Log.d(TAG, "_onLogPoJoList_Ref: "+list);

        if(list != null){
            Log.d(TAG, "_onLogPoJoList_Ref_Size: "+list.size());
            for(int i = 0; i < list.size(); i++){
                T value = list.get(i);
                Log.d(TAG, "_onLogPoJoList_Ref_Data_At: "+i+" = "+toJsonString(value));
            }
        }

    }

}
