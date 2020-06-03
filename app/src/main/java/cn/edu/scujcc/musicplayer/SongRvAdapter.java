package cn.edu.scujcc.musicplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongRvAdapter extends RecyclerView.Adapter<SongRvAdapter.SongRowHolder> {
    private SongLab lab;

    @NonNull
    @Override
    public SongRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowplay = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lyric_play,parent,false);
        SongRowHolder holder = new SongRowHolder(rowplay);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongRowHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lab.getSize();
    }

    public class SongRowHolder extends RecyclerView.ViewHolder {

            });
        }
    }
}