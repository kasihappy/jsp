package lianxi;

public class hello7 {
    public static void main(String args[]){
        String buf = "HEKLLO JAVA WORLD!!";
        hello7_component myInstance = new hello7_component(buf);
        myInstance.display();

        String buf1 = "this is java world!!";
        hello7_component yourInstance = new hello7_component(buf1);
        yourInstance.display();
    }
}
