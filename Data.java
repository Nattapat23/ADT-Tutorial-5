

public class Data {
    private String name ,lastname,Sex;
    private String SID , dateOfBirth, Address;
 
    public Data(String name, String lastname, String sID,String dateOfB,String adds,String sex) {
        this.name = name;
        this.lastname = lastname;
        SID = sID;
        dateOfBirth = dateOfB;
        Address = adds;
        Sex=sex;
    }

 

    @Override
    public String toString() {
        return "First Name - Last Name : "+name+" "+lastname+ " sex : "+Sex+ " Date of Birth : "+dateOfBirth+"\n"+
        "ID card : "+SID+" Address : "+Address+"\n";
        
    }

    
   
}
