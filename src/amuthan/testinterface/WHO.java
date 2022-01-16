package amuthan.testinterface;


public interface WHO {
    String rule= "Vaccinate";

    static void covidTest(){
        System.out.println("CovidTest");
    }

    default  void chkVaccine(){
        System.out.println("Check Vaccine");
    }

    void isCancer();

}
