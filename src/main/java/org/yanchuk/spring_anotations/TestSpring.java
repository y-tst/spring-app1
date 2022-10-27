package org.yanchuk.spring_anotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCont.xml");

        org.yanchuk.spring_anotations.Music music = context.getBean("classicalMusic", Music.class);
        org.yanchuk.spring_anotations.Music music2 = context.getBean("rockMusic", Music.class);

        org.yanchuk.spring_anotations.MusicPlayer musicPlayer = new MusicPlayer(music);
        org.yanchuk.spring_anotations.MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
