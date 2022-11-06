package org.yanchuk.spring_anotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    private ClassicalMusic classicalMusic;

//    private Music music;

//    @Autowired
//    public MusicPlayer(ClassicalMusic music) {
//        this.classicalMusic = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//    }

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


 /*
        public MusicPlayer(Music music) {
            this.music = music;
        }

        @Autowired
        public  void setMusic(Music music){
            this.music = music;
        } */

    private  ClassicalMusic classicalMusic;
    private  RockMusic rockMusic;


    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}
