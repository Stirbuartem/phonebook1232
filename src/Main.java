public class Main {
    public static void main(String[] args) {
        PhonesStore phonesStore = new PhonesStore();
        phonesStore.addPhone(new Phone("Iphone12", PhoneColorsStore.Red, 15000,23 ));
        System.out.println(phonesStore.getPhonesInTableView());
    }
}