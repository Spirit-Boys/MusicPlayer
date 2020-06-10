package cn.edu.scujcc.musicplayer;

public class Song {
    private String id;
    private String title; //歌曲名
    private String url; //播放地址
    private String lyric; //歌词
    private String singer; //歌手
    private String cover; // 写真播放界面图片

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

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", lyric='" + lyric + '\'' +
                ", singer='" + singer + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }
}
