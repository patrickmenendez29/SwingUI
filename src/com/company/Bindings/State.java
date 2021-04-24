package com.company.Bindings;

public class State<Type> {
    private Type value;


    public void didSet(Type value){
        this.value = value;
    }

    public void didGet(){
        // something I guess
    }
}
