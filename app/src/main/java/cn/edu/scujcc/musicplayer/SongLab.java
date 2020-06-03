package cn.edu.scujcc.musicplayer;

import java.util.ArrayList;
import java.util.List;

public class SongLab {
    private final static String TAG = "DianDian";
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

    public void setData(List<Song> newData){
        this.data = newData;
    }

    /**
     * 获取当前数据源总共有多少个频道
     * @return
     */
    public int getSize(){
        return data.size();
    }

    public Song getSong(int position){
        return data.get(position);
    }
}
