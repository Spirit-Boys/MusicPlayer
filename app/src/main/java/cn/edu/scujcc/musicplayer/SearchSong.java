package cn.edu.scujcc.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SearchView;

public class SearchSong extends AppCompatActivity {
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_song);

        this.searchView = findViewById(R.id.search_frame_sure);
    }
}
