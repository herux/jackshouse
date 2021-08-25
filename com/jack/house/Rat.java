package com.jack.house;

public class Rat extends Animal {
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "rat";
    }

    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("ate");
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
