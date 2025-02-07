import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Linklist User = new Linklist();
        Vector<Vaccine> info = new Vector<>();
        

        info.addElement(new Vaccine("กิตติพงษ์", "สุขสม", "1234567890123", "12/03/1990", "กรุงเทพฯ", "ชาย", "โรงพยาบาลศิริราช", "พญ. สุวรรณา รัตนาวดี", 2));
        info.addElement(new Vaccine("วรรณภา", "ชื่นใจ", "2345678901234", "25/07/1985", "เชียงใหม่", "หญิง", "โรงพยาบาลมหาราชนครเชียงใหม่", "นพ. วิชัย มงคลเกียรติ", 3));
        info.addElement(new Vaccine("ธนพล", "มีสุข", "3456789012345", "08/09/1993", "นนทบุรี", "ชาย", "โรงพยาบาลพระนั่งเกล้า", "พญ. ปรียานุช วัฒนานุกูล", 1));
        info.addElement(new Vaccine("ศศิธร", "ดำรงค์ชัย", "4567890123456", "14/02/1997", "ขอนแก่น", "หญิง", "โรงพยาบาลขอนแก่น", "นพ. กฤษฎา อินทรสุข", 2));
        info.addElement(new Vaccine("พิชิต", "วงศ์ประเสริฐ", "5678901234567", "22/11/1980", "ภูเก็ต", "ชาย", "โรงพยาบาลวชิระภูเก็ต", "พญ. อัญชลี แก้วพงษ์", 3));
        info.addElement(new Vaccine("จารุวรรณ", "อ่อนหวาน", "6789012345678", "30/06/1995", "นครราชสีมา", "หญิง", "โรงพยาบาลมหาราชนครราชสีมา", "นพ. ชัยวัฒน์ ศรีบุญเรือง", 1));
        info.addElement(new Vaccine("ภาณุวัฒน์", "เกิดผล", "7890123456789", "05/05/1988", "สมุทรปราการ", "ชาย", "โรงพยาบาลสมุทรปราการ", "พญ. ศิริพร วัฒนสกุล", 2));
        info.addElement(new Vaccine("รัตนา", "ใจดี", "8901234567890", "18/12/1992", "สุราษฎร์ธานี", "หญิง", "โรงพยาบาลสุราษฎร์ธานี", "นพ. ธนากร บุญรักษา", 3));
        info.addElement(new Vaccine("อมรเทพ", "ศรีสวัสดิ์", "9012345678901", "27/08/1983", "อุบลราชธานี", "ชาย", "โรงพยาบาลสรรพสิทธิประสงค์", "พญ. กุลธิดา ภูมิชัย", 2));
        info.addElement(new Vaccine("ศักดิ์ชัย", "วรรณรัตน์", "0123456789012", "15/01/1999", "ระยอง", "ชาย", "โรงพยาบาลระยอง", "นพ. เอกชัย พิทักษ์วงศ์", 1));

        info.elementAt(0).setNameVac("Sinovac"," AstraZeneca","12/05/2021","10/11/2021");
        info.elementAt(1).setNameVac("Pfizer", "05/06/2021", "Moderna", "12/12/2021", "Pfizer", "30/07/2022");
        info.elementAt(2).setNameVac("Sinopharm", "20/08/2021");
        info.elementAt(3).setNameVac("AstraZeneca", "03/07/2021", "Pfizer", "20/01/2022");
        info.elementAt(4).setNameVac("Sinovac", "10/03/2021", "AstraZeneca", "15/09/2021", "Moderna", "02/04/2022");
        info.elementAt(5).setNameVac("Pfizer", "18/10/2021");
        info.elementAt(6).setNameVac("Sinopharm", "07/08/2021", "Moderna", "22/02/2022");
        info.elementAt(7).setNameVac("AstraZeneca", "21/04/2021", "Moderna", "05/10/2021", "Pfizer", "18/05/2022");
        info.elementAt(8).setNameVac("Sinovac", "30/06/2021", "AstraZeneca", "20/12/2021");
        info.elementAt(9).setNameVac("Moderna", "05/09/2021");

        User.Insert(info.elementAt(0));
        User.Insert(info.elementAt(1));
        User.Insert(info.elementAt(2));
        User.Insert(info.elementAt(3));
        User.Insert(info.elementAt(4));
        User.Insert(info.elementAt(5));
        User.Insert(info.elementAt(6));
        User.Insert(info.elementAt(7));
        User.Insert(info.elementAt(8));
        User.Insert(info.elementAt(9));
       
        for(int i = 1;i<=2;i++){
            int randomDe = (int)(Math.random()*9);
            User.delete(info.elementAt(randomDe));
        }
        System.out.println();
        System.out.println();
        User.traversal();

        System.out.println();
        System.out.println();
        User.Deleteall();
        User.traversal();
        
        
        User.traversal();

    }
}
