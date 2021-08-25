package com.jack.house;

public class Dog extends Animal {
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "dog";
    }

    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("worried");
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
