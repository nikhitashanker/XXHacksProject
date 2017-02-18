package nikhi.xxhacks;

/**
 * Created by nikhi on 2/17/17.
 */

import java.io.Serializable;

/**
 * Created by csimon on 5/03/14.
 */
public class User implements Serializable{
    public long userId;
    public String username;
    public String password;
    public int womenpref;
    public int civilpref;
    public int abortionpref;
    public int lgbtpref;
    public int edupref;
    public int rightpref;
    public int minoritypref;
    public int immigrantpref;
    public int veteranpref;



    public User(long userId, String username, String password){
        this.userId=userId;
        this.username=username;
        this.password=password;
        this.womenpref = 1;
        this.civilpref = 1;
        this.abortionpref = 1;
        this.lgbtpref = 1;
        this.edupref = 1;
        this.rightpref = 1;
        this.minoritypref = 1;
        this.immigrantpref = 1;
        this.veteranpref = 1;
    }

    public void setPreference(String issue, int importanceRating)
    {
        if (issue.equals("women"))
            this.womenpref = importanceRating;
        if (issue.equals("civil"))
            this.civilpref = importanceRating;
        if (issue.equals("LGBT"))
            this.lgbtpref = importanceRating;
        if (issue.equals("Imm"))
            this.immigrantpref = importanceRating;
        if (issue.equals("Mino"))
            this.minoritypref = importanceRating;
        if (issue.equals("Edu"))
            this.edupref = importanceRating;




    }

    public int getWomen(){
        return womenpref;
    }
    public int getCivil(){
        return civilpref;
    }
    public int getLGBT(){
        return lgbtpref;
    }
    public int getEducation(){
        return edupref;
    }
    public int getMino(){
        return minoritypref;
    }
    public int getImm(){
        return immigrantpref;
    }


}
