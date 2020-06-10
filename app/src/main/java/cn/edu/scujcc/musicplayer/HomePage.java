package cn.edu.scujcc.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomePage extends AppCompatActivity implements SongRvAdapter.SongClickListener {
    private RecyclerView songlike;
    private RecyclerView songpre;
    private RecyclerView songrandom;
    private SongRvAdapter rvAdapter;
    private SongLab lab = SongLab.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home_page);

            this.songrandom = findViewById(R.id.song_random);
            this.songpre = findViewById(R.id.song_pre);
            this.songlike = findViewById(R.id.song_like);
        }

    @Override
    public void onSongClick(int position) {

    }
}
