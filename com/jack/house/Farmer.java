package com.jack.house;

public class Farmer extends Human {
    
    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("kept");
    }

    @Override
    String getName() {
        // TODO Auto-generated method stub
        return "the farmer sowing his corn";
    }

}
