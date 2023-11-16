package lianxi;

public class hello8 {
    public static void main(String args[]){
        String buf = "HEKLLO JAVA WORLD!!";
        hello8_component myInstance = new hello8_component(buf);
        myInstance.display();

        myInstance.setMessage("this is java world!!");
        myInstance.display();
    }
}
