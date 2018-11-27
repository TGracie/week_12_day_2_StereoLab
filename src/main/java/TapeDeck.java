public class TapeDeck extends Component{

    private boolean loaded;

    public TapeDeck(String make, String model){
        super(make, model);
        this.loaded = false;
    }

    public boolean hasSpace(){
        return !this.loaded;
    }

    public void addMedia(){
        if(hasSpace() == true){
            switchMedia();
        }
    }

    public void ejectMedia(){
        if(hasSpace() == false){
            switchMedia();
        }
    }

    public void switchMedia(){
        this.loaded = !this.loaded;
    }

    public String play(){
        if(hasSpace() == false){
            return super.play();
        } else {
            return "Load a tape please!";
        }
    }

}
