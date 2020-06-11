package cn.edu.scujcc.musicplayer;

import android.os.Handler;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SongLab {
    private final static String TAG = "Song";
    private static SongLab INSTANCE = null;

    private List<Song> data = new ArrayList<>();

    private SongLab(){
    }

    public static SongLab getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SongLab();
        }
        return INSTANCE;
    }

    public void getData(Handler handler){
        Retrofit retrofit = RetrofitClient.getInstance();
        SongApi api = retrofit.create(SongApi.class);
        Call<Result<List<Song>>> call = api.getLikeSongs();
        call.enqueue(new Callback<Result<List<Song>>>() {
            @Override
            public void onResponse(Call<Result<List<Song>>> call,
                                   Response<Result<List<Song>>> response) {
                Result<List<Song>> result = response.body();
            }
            @Override
            public void onFailure(Call<Result<List<Song>>> call, Throwable t) {
                Log.d(TAG,"访问网络出错了",t);
            }
        });
    }

    public void setData(List<Song> newData){
        this.data = newData;
    }

    public int getSize(){
        return data.size();
    }

    public Song getSong(int position){
        return data.get(position);
    }
}
