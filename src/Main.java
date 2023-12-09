

import files.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static java.lang.System.getProperty;

public class Main {
    public static void main(String[] args) {
        String pathToCSV = getProperty("user.dir") + "\\src\\foreign_names.csv";
        ArrayList<Person> cont = new ArrayList<>();
        try {
            CSV_Parser reader = new CSV_Parser(pathToCSV, ';', cont);
            reader.print();
            cont = new ArrayList<>(reader.getPersons());
        }
        catch (FileNotFoundException except){
            System.out.println("Таблица не найдена");
        }
    }
}