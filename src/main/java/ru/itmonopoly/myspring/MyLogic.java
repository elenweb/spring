package ru.itmonopoly.myspring;

import javax.annotation.Resource;

public class MyLogic {
    @Resource
   private MyConnection myConnection;

//    public MyConnection getMyConnection() {
//        return myConnection;
//    }
//
//    public void setMyConnection(MyConnection myConnection) {
//        this.myConnection = myConnection;
//    }
    public void selectUsers(){
        System.out.println(myConnection);
    }
}
