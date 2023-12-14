package ijse;

public class Boy {
    public void chatWithGirl(){
        Agreement agreement = new Girl();
        agreement.chat();
    }

    public void test(){
        Agreement agreement = new Girl();
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
