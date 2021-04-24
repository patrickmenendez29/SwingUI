package com.company;

import com.company.Components.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



         new Body(
                 new HStack(
                         new TextField(),
                         new Button("Button 1"),
                         new Button("Button 2"),
                         new Text("Hello World")
                 )
         );
    }
}


