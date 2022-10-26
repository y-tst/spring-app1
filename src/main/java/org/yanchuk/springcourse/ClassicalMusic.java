package org.yanchuk.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void myInitMethod() {
        System.out.println("Starting Init method");
    }

    public void muDestroyMethod() {
        System.out.println("Starting Destroy Method");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
