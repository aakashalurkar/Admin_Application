package android.example.com.hungryadmin;

/**
 * Created by Aakash on 11-09-2017.
 */

public class UserStructure {

    public String name;
    public String mobile;

    public UserStructure(){

    }

    public UserStructure(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}