package com.jack.house;

import java.util.ArrayList;
import java.util.Random;

public class JackHouseLyric {

    private ReciterType reciterType;
    private boolean subjectOnlyReciter = false;
    private ArrayList<Item> jackHouseItems;

    public JackHouseLyric() {
        this.reciterType = ReciterType.NORMAL_RECITER;
        initItems();
    }

    public JackHouseLyric(ReciterType rt) {
        this.reciterType = rt;
        initItems();
    }

    public JackHouseLyric(boolean subjectOnlyReciter) {
        this.reciterType = ReciterType.NORMAL_RECITER;
        this.subjectOnlyReciter = subjectOnlyReciter;
        initItems();
    }

    public JackHouseLyric(boolean subjectOnlyReciter, ReciterType rt) {
        this.reciterType = rt;
        this.subjectOnlyReciter = subjectOnlyReciter;
        initItems();
    }

    private void initItems() {
        jackHouseItems = new ArrayList<Item>();
        jackHouseItems.add(new Horse());
        jackHouseItems.add(new Farmer());
        jackHouseItems.add(new Rooster());
        jackHouseItems.add(new Priest());
        jackHouseItems.add(new Man());
        jackHouseItems.add(new Maiden());
        jackHouseItems.add(new Cow());
        jackHouseItems.add(new Dog());
        jackHouseItems.add(new Cat());
        jackHouseItems.add(new Rat());
        jackHouseItems.add(new Malt());
        jackHouseItems.add(new House());
    }
    
    public String recite(int n) {
        int t = 0;
        String result = "";
        switch (this.reciterType) {
            case NORMAL_RECITER:
                t = jackHouseItems.size() - n;
                break;
            case RANDOM_RECITER: 
                Random rand = new Random();
                int rn = rand.nextInt(jackHouseItems.size());
                t = jackHouseItems.size() - rn;
                break;
            default:
                break;
        }

        for (int i = t; i < jackHouseItems.size(); i++) {
            String subj = "";
            if (this.subjectOnlyReciter) {
                subj = jackHouseItems.get(i).getName();
            }else {
                subj = jackHouseItems.get(i).getName() + " that " + jackHouseItems.get(i).getAction().getName();
            }
            result = result + " " + subj;
        }

        return "this is " + result;
    }

}
