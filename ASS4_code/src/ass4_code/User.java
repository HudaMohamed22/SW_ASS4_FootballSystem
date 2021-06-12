package ass4_code;

/**
 * @author Huda,Samah,Aya
 * @Version 1.0
 * @since 12 june 2021
 */
import java.util.Scanner;

public class User {
    protected String name;
    protected static int ID;
    protected String password;
    protected String email;
    protected String phone;
    protected String defaultlocation;
    //protected Ewallet ewallet;
    /
     * default constructor
     */
    public User(){


    }

    /**
     *
     * @param _name name of user
     * @param _password password of user
     * @param _email email of user
     * @param _phone phone of user
     * @param _deflocation default of location of play ground
     */
    public User(String _name, String _password, String _email, String _phone, String _deflocation ) {
        name=_name;
        password=_password;
        email=_email;
        phone=_phone;
        defaultlocation=_deflocation;

    }

    public void  increamentId(){
        ID++;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param phone
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param defaultlocation
     */

    public void setDefaultlocation(String defaultlocation) {
        this.defaultlocation = defaultlocation;
    }

    /**
     *
     * @return default of location
     */
    public String getDefaultlocation() {
        return defaultlocation;
    }

}
