package com.jack.house;

public class Priest extends Human {
    
    @Override
    Action getAction() {
        // TODO Auto-generated method stub
        return new Action("married");
    }

    @Override
    String getName() {
        // TODO Auto-generated method stub
        return "the priest all shaven and shorn";
    }

}
