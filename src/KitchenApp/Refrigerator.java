package KitchenApp;

public class Refrigerator extends Appliance{

    private boolean hasIce;

    public boolean isHasIce() {

        return hasIce;
    }

    public void setHasIce(boolean hasIce) {

        this.hasIce = hasIce;
    }

    public void setType(String type){

        this.type = type;
    }

    public void setBrandName (String brandName){
        this.brandName = brandName;
    }

    public Refrigerator(String type, String brandName, boolean hasIce){
        super(type, brandName);
        this.hasIce = hasIce;
    }
}

