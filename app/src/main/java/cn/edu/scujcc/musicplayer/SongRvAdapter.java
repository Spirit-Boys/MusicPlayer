package cn.edu.scujcc.musicplayer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class SongRvAdapter extends RecyclerView.Adapter<SongRvAdapter.SongRowHolder> {
    private SongLab lab = SongLab.getInstance();//声明一个实例变量
    private SongClickListener listener;
    private Context context;

    public SongRvAdapter(Context context,SongClickListener lis){
        this.context = context;
        this.listener = lis;
    }

    @NonNull
    @Override
    public SongRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowPlay = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_row,parent,false);
        SongRowHolder holder = new SongRowHolder(rowPlay);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongRowHolder holder, int position) {
        Song c = lab.getSong(position);
        holder.bind(c);
    }

    @Override
    public int getItemCount() {
        return lab.getSize();
    }

    public class SongRowHolder extends RecyclerView.ViewHolder {
        private TextView title; //歌曲名字
        private TextView singer; //歌手
        private ImageView cover;//歌曲封面

        public SongRowHolder(@NonNull View row) {
            super(row);
            this.title = row.findViewById(R.id.song_title);
            this.singer = row.findViewById(R.id.song_singer);
            this.cover = row.findViewById(R.id.song_cover);
            row.setOnClickListener((v) -> {
                int position = getLayoutPosition();
                Log.d("Song",position+"行被点击了");
                listener.onSongClick(position);
            });
        }

        public void bind(Song c) {
            this.title.setText(c.getTitle());
            this.singer.setText(c.getSinger());
            //图片圆角处理
            RoundedCorners rc = new RoundedCorners(6);
            RequestOptions ro = RequestOptions.bitmapTransform(rc)
                    .override(300,300);
            Glide.with(context)
                    .load(c.getCover())
                    .placeholder(R.drawable.maps)
                    .into(this.cover);

        }
    }
        public interface SongClickListener {
            public void onSongClick(int position);
    }
}