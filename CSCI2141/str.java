import java.util.StringTokenizer;//导入StringTokenizer 类，后面要用到此类来创建对象和此类的方法。
public class str{

    public str(){}
    public static String convertStrToArray(String str,int pattern,String value){
        String[] strArray = null;
        strArray = str.split(","); //拆分字符为"," ,然后把结果交给数组strArray
          int l = strArray.length;
        String result="";


          if(pattern==1)
{
  for(int i =0;i<l;i++)
  {
     StringBuilder test = new StringBuilder();
     test.append(strArray[i]);
    if(i>0)test.insert(0," , ");

result+=test.toString();
  }
  System.out.print(result);

  return result;
}else {
  for(int i =0;i<l;i++)
  {
     StringBuilder test = new StringBuilder();
     test.append(strArray[i]);

    if(i>0){test.insert(0," AND ");}
    test.append(" = ");
    test.append(value);
    test.append(" ");
result+=test.toString();
  }
  System.out.print(result);

        return result;
    }

}
}
