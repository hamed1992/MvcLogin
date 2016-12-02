package com.example.hp.mvchomework;

/**
 * Created by hp on 2/12/2016.
 */

public class UserController {
    public boolean Login(User myuser){
        if(!myuser.username.equals("") && !myuser.password.equals("")){
            if(myuser.user.equals("teacher") ){
                if( myuser.username.equals("teacher") && myuser.password.equals("teacher")){
                    return  true;
                }
                return false;
            }else if(myuser.user.equals("student") ){
                if( myuser.username.equals("student") && myuser.password.equals("student")){
                    return  true;
                }
            }
        }
        return false;
    }

}
