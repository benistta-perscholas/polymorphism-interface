//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainRunner {
    public static void main(String[] args) {

        KidUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");
        kidUser.registerAccount(18);
        kidUser.requestBook("Fiction");

        AdultUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");
        adultUser.registerAccount(23);
        adultUser.requestBook("Fiction");
    }
}