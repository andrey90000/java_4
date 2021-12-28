import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * Class CsvToBeanReader reads data from csv file and writes it into java bean class .
 *
 * @author Усов Андрей
 */
public class CsvToBeanReader {
    /**
     * Method CsvToClass reads data from csv file, parses it and writes it into java bean class
     * @return list of persons
     * @throws FileNotFoundException
     */
    public List<Person> CsvToClass() throws FileNotFoundException {
        FileReader reader = new FileReader("C:\\Users\\Andreyy\\IdeaProjects\\CSV_4_LAB\\src\\main\\resources\\foreign_names.csv");
        CsvToBean<Person> csvBean = new CsvToBeanBuilder<Person>(reader).withType(Person.class).withSeparator(';').build();
        return csvBean.parse();
    }
}
