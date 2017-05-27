package com.example.wangweikuan.myapplication;

public class stage{

    public stage( ){}
public int test(String pass){
  int result = 0;
  if(!pass.equals("password"))
    result++;
  if(pass.length()>=8)
   result ++;

        return result;

}
}
