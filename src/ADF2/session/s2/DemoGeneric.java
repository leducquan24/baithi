package ADF2.session.s2;

public class DemoGeneric<K,V> {
    K name;
    V age;
    //khai bao dang generic
    public <E> void sendMessage(E msg){
        System.out.println(msg);
    }
}
