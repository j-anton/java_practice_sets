class MethodOverridingExample{
   
    public class Bank{

        private float interest;

        public float getRateOfInterest(float interest){
            System.out.println("Class: Bank");
            return interest;
        }

    }

    public class SBI extends Bank{
        
        private float interest = (float) 0.07;

        public float getRateOfInterest(float interest){
            System.out.println("Class: SBI");
            return interest;
        }

    }

    class ICI extends Bank{
        
        private float interest = (float) 0.08;

        public float getRateOfInterest(float interest){
            System.out.println("Class: ICI");
            return interest;
        }
    }

    class AXIS extends Bank{

        private float interest = (float) 0.09;
        
        public float getRateOfInterest(float interest){
            System.out.println("Class: AXIS");
            return interest;
        }
    }

    public static void main(String[] args){

        MethodOverridingExample example = new MethodOverridingExample();
        example.run();

    }

    public void run(){
        SBI sbi = new SBI();
        ICI ici = new ICI();
        AXIS axis = new AXIS();

        System.out.println(sbi.getRateOfInterest(sbi.interest));
        System.out.println(ici.getRateOfInterest(ici.interest));
        System.out.println(axis.getRateOfInterest(axis.interest));
    }

}
