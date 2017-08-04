package Dao;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by gundojim on 8/2/2017.
 */
public class A {
    static int i=0;
    Date date;
public void say(){
    System.out.println("dai");
}
public ArrayList<B> objects(){
    ArrayList<B> list=new ArrayList();
    for(int i=0;i<5;i++){
        list.add( new B(i,i*3,"ab"+i));

    }
    return list;
}
public boolean  date(Date date){
    System.out.println(date);
    return true;
}
}
