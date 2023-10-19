package lianxi;

public class hello8_component {
    private String message;

    public hello8_component(String msg) {
        this.message = msg;
    }

    public void setMessage(String a) {
        this.message = a;
    }

    public void display() {
        System.out.println("\n--hello world!!! display--\n");
        System.out.println(message);
        System.out.println("\n----------end-------------\n");
    }
}
