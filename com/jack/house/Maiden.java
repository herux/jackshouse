package com.jack.house;

public class Maiden extends Cow {
    
    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("milked");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "the maiden all forlorn";
    }

}
