package lianxi;

public class hello7_component {
    private String message;
    public hello7_component(String msg){
        this.message = msg;
    }
    public void display(){
        System.out.println("\n--hello world!!! display--\n");
        System.out.println(message);
        System.out.println("\n----------end-------------\n");
    }
}
