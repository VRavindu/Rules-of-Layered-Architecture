package lk.ijse;

public class Boy {

    Agreement agreement = new Girl();

    public void chatWithGirl(){
        agreement.chat();
    }

    public void setter(Agreement a){
        this.agreement = a;
    }

    public void test(){
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setter(new Girl());
        boy.chatWithGirl();
    }
}
