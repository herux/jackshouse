package com.jack.house;

public class Cow extends Animal {
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "cow";
    }

    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("tossed");
    }

    @Override
    public boolean hasHorn() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void sound() {
        // TODO Auto-generated method stub
        
    }

}
