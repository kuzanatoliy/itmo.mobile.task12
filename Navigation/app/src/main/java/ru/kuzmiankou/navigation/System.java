package ru.kuzmiankou.navigation;

/**
 * Created by Anatoliy on 11.11.2017.
 */

public class System {
    private String name;
    private int imageResourceId;

    public static final System[] systems = {
            new System("Android", R.drawable.android),
            new System("IPhone", R.drawable.iphone),
            new System("Windows Phonw", R.drawable.windows),
            new System("BlackBerry", R.drawable.black)
    };

    private System(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
