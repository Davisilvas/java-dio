import Phone.MobilePhone;

public class Main {
    public static void main(String[] args) throws Exception {
        MobilePhone daviPhone = new MobilePhone("Iphone 15", "Apple", "Davi Santos");

        System.out.println();
        daviPhone.play();
        System.out.println();
        daviPhone.pause();
        System.out.println();
        daviPhone.selectSong();
        System.out.println();

        daviPhone.showPage();
        System.out.println();
        daviPhone.addNewTab();
        System.out.println();
        daviPhone.reloadTab();
        System.out.println();

        daviPhone.call();
        System.out.println();
        daviPhone.answer();
        System.out.println();
        daviPhone.initVoiceMail();
    }
}
