import java.util.Vector;

public class Vaccine extends Data{
    private String Manufacturer,vacSite;
    private String Certifying;
    private int Dose;
    private Vector<String> nameVac = new Vector<>();
    private Vector<String> dateVac = new Vector<>();

    public Vaccine(String name, String lastname, String sID,String dateOfB,String adds,String sex, String vacSite, String certifying, int dose){
        super(name, lastname, sID,dateOfB,adds,sex);
        this.vacSite = vacSite;
        Certifying = certifying;
        Dose = dose;
    }

    public void setNameVac(String nameDose1,String lot1){
        if (this.Dose != 1) {return;}

        nameVac.add(nameDose1);
        dateVac.add(lot1);
    }

    public void setNameVac(String nameDose1,String nameDose2,String lot1,String lot2){
        if (this.Dose != 2) {return;}

        nameVac.addElement(nameDose1);
        nameVac.addElement(nameDose2);
        dateVac.addElement(lot1);
        dateVac.addElement(lot2);
    }

    public void setNameVac(String nameDose1,String nameDose2,String nameDose3,String lot1,String lot2,String lot3){
        if (this.Dose != 3) {return;}

        nameVac.add(nameDose1);
        nameVac.add(nameDose2);
        nameVac.add(nameDose3);
        dateVac.add(lot1);
        dateVac.add(lot2);
        dateVac.add(lot3);
    }

    @Override
    public String toString() {
        

        if (Dose ==1) {
            return super.toString()+"Dose 1 : "+nameVac.get(0)+" Date of Vacc : "+ dateVac.get(0) +" Vaccination Site : "+vacSite+"\n"+"Signature of the Certifying Officer : "+ Certifying;
        } else if (Dose ==2) {
            return super.toString()+"Dose 1 : "+nameVac.get(0)+" Date of Vacc : "+ dateVac.get(0) +" Vaccination Site : "+vacSite+"\n"
            +"Dose 2 : "+nameVac.get(1)+" Date of Vacc : "+ dateVac.get(1) +" Vaccination Site : "+vacSite+"\n"+"Signature of the Certifying Officer : "+ Certifying;
            

        }else {
            return super.toString()+"Dose 1 : "+nameVac.get(0)+" Date of Vacc : "+ dateVac.get(0) +" Vaccination Site : "+vacSite+"\n"
            +"Dose 2 : "+nameVac.get(1)+" Date of Vacc : "+ dateVac.get(1) +" Vaccination Site : "+vacSite+"\n"+
            "Dose 3 : "+nameVac.get(2)+" Date of Vacc : "+ dateVac.get(2) +" Vaccination Site : "+vacSite+"\n"+"Signature of the Certifying Officer : "+ Certifying;
        }

        
    }
    
    
    

}
