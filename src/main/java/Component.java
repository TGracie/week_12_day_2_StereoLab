public abstract class Component {

    protected String make;
    protected String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }

    public abstract void addMedia();

    public abstract void ejectMedia();

    public String play(){
        return "Doo doo doo playing a song!";
    }
}
