package hr.ferit.ivana.inspired;

import java.util.Date;

/**
 * Created by ivana on 3/17/2018.
 */

public class InspiringPerson {
    public String name;
    public Date birth;
    public Date death;
    public String about;

    public void setName(String n){
        name=n;
    }
    public void setBirth(Date d){
        birth=d;
    }
    public void setDeath(Date d){
        death=d;
    }
    public void setAbout(String a){
        about=a;
    }
    public void updateName(String n){
        name=n;
    }
    public void updateBirth(Date b){
        birth=b;
    }
    public void updateDeath(Date d){
        death=d;
    }
    public void updateAbout(String a){
        about=a;
    }
}
