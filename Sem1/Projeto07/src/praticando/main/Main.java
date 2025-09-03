package praticando.main;

import praticando.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.setVolume(55);
        tv.setCanal(13);
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.printf("Canal: %d \nVolume: %d", tv.getCanal(), tv.getVolume());
    }
}
