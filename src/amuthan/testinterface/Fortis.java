package amuthan.testinterface;

public class Fortis extends HsptlMgmt implements USMedical,IndiaMedical {

    @Override
    public void isCancer() {
        System.out.println();
    }

    public void chkBill()
    {
        super.chkBill();
        System.out.println("fortis chkbill");
    }
@Override
    public void chkMRI() {
          USMedical.super.chkMRI();

    }
    public  void chkVaccine(){

    }

    //method hiding
    //@Override
    public static void covidTest(){

    }
}
