package jojo;

public class gg {
    public String name;
    public String psw;
    public gg(String name,String psw){
        this.name = name;
        this.psw = psw;
    }
    public boolean check() {

        if (name != null && psw != null && name.equals("admin") && psw.equals("123")) {
            return true;
        }
        return false;
    }
}