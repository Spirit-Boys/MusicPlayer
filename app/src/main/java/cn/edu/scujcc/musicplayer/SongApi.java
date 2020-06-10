package cn.edu.scujcc.musicplayer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface SongApi {
    @GET("/songs")
    Call<Result<List<Song>>> getLikeSongs();

    @GET("/songs/preference")
    Call<Result<List<Song>>> getPreSongs();

    @GET("/songs/history")
    Call<Result<List<Song>>> getHistorySongs();

    @GET("/songs/random")
    Call<Result<List<Song>>> getRandomSongs();

    @GET("/search/{title}")
    Call<Result<List<Song>>> searchSongByTitle(@Path("title")String title);

    @GET("/search/{singer}")
    Call<Result<List<Song>>> searchSongBySinger(@Path("singer")String singer);

    @GET("/search/hot")
    Call<Result<List<Song>>> getSearchMoreSong();
}
