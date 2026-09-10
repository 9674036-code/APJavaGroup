public class Debater{
    private int speakerP=0;
    private int wins=0;
    private int mainArg=0;
    private int value=0;
    private int crossX=0;
    private int mod=0;
    
    public void reset(){
        speakerP=0;
        wins=0;
    }
    public void setMod(int m){
        this.mod=m;
    }
    public void setCrossX(int c) {
        this.crossX = c;
    }
    public void setMainArg(int m) {
        this.mainArg = m;
    }
    public void setSpeakerP(int s) {
        speakerP = s+speakerP;
    }
    public void setValue(int v) {
        this.value = v;
    }
    public void setWins(int w) {
        wins = w+wins;
    }
    public int getCrossX() {
        return crossX;
    }
    public int getMod(){
        return mod;
    }
    public int getMainArg() {
        return mainArg;
    }
    public int getSpeakerP() {
        return speakerP;
    }
    public int getValue() {
        return value;
    }
    public int getWins() {
        return wins;
    }
    public void addPerks(){
        
    }
}