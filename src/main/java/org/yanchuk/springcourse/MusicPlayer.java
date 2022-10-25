package org.yanchuk.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {


    private  String name;
    private  int volume;

    private List<Music> musicList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }

    }
}
