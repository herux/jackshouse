package com.jack.house;

public class Cat extends Animal {
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "cat";
    }

    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("killed");
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
