package com.jack.house;

public class Horse extends Animal {
    
    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("belonged to");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "the horse and " + new Hound().getName() + " and " + new Horn().getName();
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
