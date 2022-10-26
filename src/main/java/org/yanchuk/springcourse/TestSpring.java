package org.yanchuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("musicBeanForProto", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBeanForProto", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        System.out.println();

        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic1.getSong());
        System.out.println();

        System.out.println(classicalMusic2.getSong());
        System.out.println(classicalMusic2.getSong());
        System.out.println(classicalMusic2.getSong());


//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println("First player is the same as Second - " + comparison);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println("First MusicPlayer Volume: " + firstMusicPlayer.getVolume());
//        System.out.println("Second MusicPlayer Volume: " + secondMusicPlayer.getVolume());


//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
