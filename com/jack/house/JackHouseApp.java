package com.jack.house;

public class JackHouseApp {

    public static void main(String[] args) {
        JackHouseLyric jhc = new JackHouseLyric();
        String recite1 = jhc.recite(1);
        System.out.println("--> RECITE 1 : " + recite1);

        String recite2 = jhc.recite(2);
        System.out.println("--> RECITE 2 : " +recite2);

        String recite12 = jhc.recite(12);
        System.out.println("--> RECITE 12: " +recite12);

        jhc = new JackHouseLyric(true);
        recite2 = jhc.recite(2);
        System.out.println("--> RECITE 2 Subj Only: " +recite2);

        jhc = new JackHouseLyric(ReciterType.RANDOM_RECITER);
        recite2 = jhc.recite(2);
        System.out.println("--> RECITE 2 Random: " +recite2);

        jhc = new JackHouseLyric(true, ReciterType.RANDOM_RECITER);
        recite2 = jhc.recite(2);
        System.out.println("--> RECITE 2 Random: " +recite2);
    }



}