package KiemTraGiuaKy;
class ElectricalDevice implements Switchable{
    protected String manufacture;
    protected int price;
    protected String id;
    protected boolean switcher;
    public ElectricalDevice(String a,int b,String c,boolean d){
        manufacture=a;
        price=b;
        id=c;
        switcher=d;
    }
    public String getManufacture(){
        return manufacture;
    }
    public int getPrice(){
        return price;
    }
    public String getId(){
        return id;
    }
    public boolean getSwitcher(){
        return switcher;
    }
    public void setManufacture(String x){
        manufacture=x;
    }
    public void setPrice(int x){
        price=x;
    }
    public void setId(String x){
        id=x;
    }
    public void setSwitcher(boolean x){
        switcher=x;
    }
    public String toString(){
        return "NhÃ  sáº£n xuáº¥t: "+manufacture+
               "\nGiÃ¡: "+price+"\nMÃ£ id: "+id+
               "\nCÃ´ng táº¯c: "+switcher;
    }
    public void turnOn(){
        switcher=true;
    }
    public void turnOff(){
        switcher=false;
    }
}
