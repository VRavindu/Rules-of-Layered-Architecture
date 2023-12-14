package lk.ijse;

public class Boy {

    Agreement agreement = new Girl();

    public Boy(Agreement a) {
        this.agreement = a;
    }

    public void chatWithGirl(){
        agreement.chat();
    }

    public void test(){
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
        boy.chatWithGirl();
    }
}
