package com.guanweiming.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.istack.internal.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author chezhu.xin
 */
public class JsonUtil {

    private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    /**
     * 将JavaBean转换成json字符串
     *
     * @param src JavaBean对象
     * @return 转换的结果
     */
    public static String toJson(final Object src) {
        return GSON.toJson(src);
    }

    /**
     * 将json字符串转换成JavaBean
     *
     * @param json     json字符串
     * @param classOfT 想要转化成的结果类型
     * @param <T>      结果类型
     * @return 转换之后的JavaBean对象
     */
    public static <T> T fromJson(String json, Class<T> classOfT) {
        return new Gson().fromJson(json, classOfT);
    }

    public static JSONObject toJsonObject(String json) {
        try {
            return new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public static JSONArray toJsonArray(String json) {
        try {
            return new JSONArray(json);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }

    public static double getDouble(@NotNull JSONObject jsonObject, @NotNull String name) {
        try {
            return jsonObject.getDouble(name);
        } catch (JSONException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public static double getDouble(@NotNull String json, @NotNull String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getDouble(name);
        } catch (JSONException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public static JSONArray getJsonArray(String detail) throws JSONException {
        if (StringUtil.isBlank(detail)) {
            return new JSONArray("['']");
        }
        try {
            return new JSONArray(detail);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray("['']");
        }
    }
}
