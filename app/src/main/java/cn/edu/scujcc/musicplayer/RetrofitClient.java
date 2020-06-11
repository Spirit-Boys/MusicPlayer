package cn.edu.scujcc.musicplayer;

import retrofit2.Retrofit;

public class RetrofitClient {
    private static Retrofit INSTANCE = null;

    public static synchronized Retrofit getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new Retrofit.Builder()
                    .baseUrl("http://47.112.240.160:8080")
                    .build();
        }
        return INSTANCE;
    }
}
