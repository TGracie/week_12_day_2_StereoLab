public class Stereo {
    private Radio radio;
    private CDPlayer cd;
    private TapeDeck TapeDeck;
//    private Amplifier amp;

    public Stereo(){
        this.radio = new Radio();
        this.cd = null;
        this.TapeDeck = null;

    }

    public boolean hasCDPlayer(){
        if(this.cd == null){
            return false;
        }
        return true;
    }

    public boolean hasTapeDeck(){
        if(this.TapeDeck == null){
            return false;
        }
        return true;
    }

    public void setCDPlayer(CDPlayer cd){
        this.cd = cd;
    }

    public void setTapeDeck(TapeDeck tape){
        this.TapeDeck = tape;
    }

    public TapeDeck getTapeDeck() {
        return this.TapeDeck;
    }
}
