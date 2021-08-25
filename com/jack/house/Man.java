package com.jack.house;

public class Man extends Human {
    
    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("kissed");
    }

    @Override
    String getName() {
        // TODO Auto-generated method stub
        return "the man all tattered and torn";
    }

}
