package KiemTraGiuaKy;
import java.util.Vector;
class Switcher implements Switchable{
    private Vector devices[];
    private boolean state;
    public Switcher(){
        
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean x){
        state=x;
    }
    public void addDevice(){
        
    }
    public void turnOn(){
        
    }
    public void turnOff(){
        
    }

    void addDevice(Cooker noiCom) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void addDevice(Fan mayQuat) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void showDevice() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
