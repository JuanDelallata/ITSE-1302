/**
 * Created by juang on 3/21/2017.
 */
public class Person {

    private String strFirstName = "";
    private String strLastName = "";
    private String strMiddleName = "";
    private int intBirthYear = 1970;
    private int intBirthMonth = 1;
    private int intBirthDay = 1;
    private int intHeightIN = 72;
    private int intWeightLBS = 165;
    private char chrGender = '';

    public void setFirstName(String pstrFirstName) {
        this.strFirstName = pstrFirstName;
    }

    public String getFirstName() {
        return this.strFirstName;
    }

    public void setLastName(String pstrLastName) {
        this.strLastName = pstrLastName;
    }

    public String getLastName() {
        return this.strLastName;
    }

    public void setMiddleName(String pstrMiddleName) {
        this.strMiddleName = pstrMiddleName;
    }

    public String getMiddleName() {
        return this.strMiddleName;
    }

    public String getName() {
        return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
    }

    public void setName(String pstrFirstName,String pstrMiddleName,String pstrLastName) {
        this.setFirstName(pstrFirstName);
        this.setMiddleName(pstrMiddleName);
        this.setLastName(pstrLastName);
    }
}
