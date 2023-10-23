public class SmartphoneAdapter implements PowerOutlet{
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger){
        this.smartphoneCharger = smartphoneCharger;
    }

    public String plugin(){
        return this.smartphoneCharger.charge();
    }
}
