package cn.edu.scujcc.musicplayer;

import java.io.Serializable;

public class Song implements Serializable {
    private String id;
    private String title; //歌曲名
    private String url; //播放地址
    private String lyric; //歌词
    private String singer; //歌手
    private String cover; // 写真播放界面图片
    private int play = 0;
    private int search = 0;

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", lyric='" + lyric + '\'' +
                ", singer='" + singer + '\'' +
                ", cover='" + cover + '\'' +
                ", play=" + play +
                ", search=" + search +
                '}';
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

}
