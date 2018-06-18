package network;

import com.fcibook.quick.http.QuickHttp;
import okhttp3.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class NetUtils {
    public static String post(String url, Map<String, String> params) throws IOException {
        OkHttpClient httpClient = new OkHttpClient();
        FormBody.Builder formBuilder = new FormBody.Builder();
        Iterator<Map.Entry<String, String>> entries = params.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            formBuilder.add(entry.getKey(),entry.getValue());
        }
        RequestBody formBody = formBuilder.build();
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        Response response = httpClient.newCall(request).execute();
        return response.body().string(); // 返回的是string 类型，json的mapper可以直接处理
    }

    public static String get(String url, Map<String, String> params) throws IOException {
     /*   return new QuickHttp().
                url(url).
                get().
                addParames(params).
                text();*/
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String param = "";
        Iterator<Map.Entry<String, String>> entries = params.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            param += entry.getKey() + "=" + entry.getValue() + "&";
        }
        if (param.length() == 1) {
            param.substring(0,param.length()-1);
        }


        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url+"/?"+param)
                .get()
                .build();
        Response response = httpClient.newCall(request).execute();
        return response.body().string(); // 返回的是string 类型，json的mapper可以直接处理
    }

}
