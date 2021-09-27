package KitchenApp;

public class Microwave extends Appliance{


    public Microwave(String type, String brandName) {
        super(type, brandName);
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
