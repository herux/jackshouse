package com.jack.house;

public class House extends Item {

    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("Jack built");
    }

    @Override
    String getName() {
        // TODO Auto-generated method stub
        return "the house";
    }

}
