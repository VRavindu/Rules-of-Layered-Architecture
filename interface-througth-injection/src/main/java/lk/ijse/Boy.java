package lk.ijse;

public class Boy implements Sample {

    Agreement agreement = new Girl();

    public void chatWithGirl(){
        agreement.chat();
    }

    public void test(){
        agreement.chat();
    }

    @Override
    public void inject(Agreement a) {
        agreement = a;
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
        boy.inject(new Girl());
    }

}
