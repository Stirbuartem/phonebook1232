import java.util.ArrayList;

public class PhonesStore {
    private ArrayList<Phone> phones;
    public  PhonesStore(){
        phones = new ArrayList<>();
    }
    public void addPhone(Phone phone){
        phones.add(phone);
    }
    public  Phone getPhoneByNumber(int number) throws Exception { // добавить запись
        int index = number - 1;
        if ( number < 0 ||  index > phones.size() - 1){
            throw new Exception("Ошибка. Тeлефон с таким номером не существует");
        }
        return phones.get(index);
    }
    public   void deletePhoneByNumber(int number) throws Exception { // удалить записи Я
        int index = number - 1;
        if ( number < 0 ||  index > phones.size() - 1){
            throw new Exception("Ошибка. Тeлефон с таким номером не существует");
        }
        phones.remove(index);
    }

    public String getPhonesInTableView(){
        String output = "";

        output = String.format("%3s%20s%20s%15s%20s\n", "N", "Модель", "Цвет", "Цена(руб)" , "Кол-во на складе");

        for (int i = 0; i < phones.size(); i++) {
            Phone currentPhone = phones.get(i);
            output += String.format("%3s%20s%20s%15s%20s\n", i + 1, currentPhone.getModel(), currentPhone.getColor(), currentPhone.getPrice(), currentPhone.getBalance());

        }
            return output;

    }

}
