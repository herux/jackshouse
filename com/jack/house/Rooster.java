package com.jack.house;

public class Rooster extends Animal{
    

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "rooster";
    }

    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("woke");
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
