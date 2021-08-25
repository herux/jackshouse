package com.jack.house;

public class Malt extends Item {
    
    @Override
    String getName() {
        // TODO Auto-generated method stub
        return "the malt";
    }

    @Override
    Action getAction() {
        return new Action("lay in");
    }    

}
