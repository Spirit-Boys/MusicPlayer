package cn.edu.scujcc.musicplayer;

public class Frequency {
    /**
     * 播放次数
     */
    private int play = 0;
    /**
     * 搜索次数
     */
    private int search = 0;

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

    @Override
    public String toString() {
        return "Frequency{" +
                "play=" + play +
                ", search=" + search +
                '}';
    }
}
