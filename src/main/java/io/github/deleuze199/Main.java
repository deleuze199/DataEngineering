package io.github.deleuze199;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, CsvValidationException {
        CsvParser csvP = new CsvParser("src/Data/SEOExample-1.csv");
        csvP.printCsv();
    }
}
