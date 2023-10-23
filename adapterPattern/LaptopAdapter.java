public class LaptopAdapter implements PowerOutlet{
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop){
        this.laptop = laptop;
    }

    public String plugin(){
        return this.laptop.charge();
    }
}
