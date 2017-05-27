package com.example.wangweikuan.myapplication;

public class stage{

    public stage( ){}
public int test(String pass){
  int result = 0;
  if(!pass.equals("password"))
    result++;
  if(pass.length()>=8)
   result ++;
    if(pass.contains("1")||pass.contains("2")||pass.contains("3")||pass.contains("4")||pass.contains("5")||pass.contains("6")||pass.contains("7")||pass.contains("8")||pass.contains("9")||pass.contains("0"))
        result ++;
    if(!pass.contains(" "))
        result ++;
    if(!pass.contains("qwerty"))
        result ++;
        return result;

}
}
