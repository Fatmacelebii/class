//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        car car1 =new car();

        car1.yıl= 2004;
        car1.model= "eclass";
        car1.marka= "mercedes";

        System.out.println("Arabanın markası:");
        System.out.println(car1.marka + " " + car1.model + " " + car1.yıl);

    }
}