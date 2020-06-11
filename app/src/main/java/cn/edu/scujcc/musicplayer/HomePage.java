package cn.edu.scujcc.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.util.List;

public class HomePage extends AppCompatActivity implements SongRvAdapter.SongClickListener {
    private RecyclerView songlike;
    private RecyclerView songpre;
    private RecyclerView songrandom;
    private SongRvAdapter likeAdapter;
    private SongRvAdapter preAdapter;
    private SongRvAdapter randomAdapter;
    private SongLab lab = SongLab.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home_page);

            this.songrandom = findViewById(R.id.song_random);
            this.songpre = findViewById(R.id.song_pre);
            this.songlike = findViewById(R.id.song_like);
            likeAdapter = new SongRvAdapter(HomePage.this, p -> {
                Intent intent = new Intent(HomePage.this, PortraitPlay.class);
                Song c = lab.getSong(p);
                intent.putExtra("Song", c);
                startActivity(intent);
            });
            preAdapter = new SongRvAdapter(HomePage.this, p -> {
                Intent intent = new Intent(HomePage.this, PortraitPlay.class);
                Song c = lab.getSong(p);
                intent.putExtra("Song", c);
                startActivity(intent);
            });
            randomAdapter = new SongRvAdapter(HomePage.this, p -> {
                Intent intent = new Intent(HomePage.this, PortraitPlay.class);
                Song c = lab.getSong(p);
                intent.putExtra("Song", c);
                startActivity(intent);
            });
            this.songlike.setAdapter(likeAdapter);
            this.songlike.setLayoutManager(new LinearLayoutManager(this));
            this.songpre.setAdapter(preAdapter);
            this.songpre.setLayoutManager(new LinearLayoutManager(this));
            this.songrandom.setAdapter(randomAdapter);
            this.songrandom.setLayoutManager(new LinearLayoutManager(this));
            initData();
        }

    @Override
    public void onSongClick(int position) {
        Song c = lab.getSong(position);
        Intent intent = new Intent(HomePage.this,PortraitPlay.class);
        //传递用户选中的歌曲到下一个界面
        intent.putExtra("song",c);
        startActivity(intent);
    }

    private void initData() {
        //得到网络上的数据后，去更新界面
        Handler handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                List<Song> songs = (List<Song>) msg.obj;
                lab.setData(songs);
                likeAdapter.notifyDataSetChanged();
//                preAdapter.notifyDataSetChanged();
//                randomAdapter.notifyDataSetChanged();
            }
        };
        lab.getData(handler);
    }
}
