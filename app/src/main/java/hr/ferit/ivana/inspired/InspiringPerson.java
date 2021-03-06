package hr.ferit.ivana.inspired;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by ivana on 3/17/2018.
 */

public class InspiringPerson {
    private String name;
    private String birth=null;
    private String death=null;
    private String about;
    private int photo;

    public void setName(String n){
        name=n;
    }
    public void setBirth(String d){
        birth=d;
    }
    public void setDeath(String d){
        death=d;
    }
    public void setAbout(String a){
        about=a;
    }
    public void setPhoto(int p){
        photo=p;
    }
    public String getName(){
        return name;
    }
    public String getBirthDisplay(){
        if(death == null)
        return birth + " - ...";
        else
            return birth+" - "+death;
    }
    public String getAbout(){
        return about;
    }
    public int getPhoto(){
        return photo;
    }


}
