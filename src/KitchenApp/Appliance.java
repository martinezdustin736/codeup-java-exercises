package KitchenApp;

public abstract class Appliance {
    protected String type;
    protected String brandName;

    public Appliance(String type, String brandName){
          this.type = type;
          this.brandName = brandName;
    }

    //Abstract methods are defined using the "abstract keyword
    public abstract void setType(String type);

    public abstract void setBrandName(String brandName);

    public void sayHello(){
        System.out.println("Hello!");
    }
}
