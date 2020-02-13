package io.github.deleuze199;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, CsvValidationException {
        CsvParser csvP = new CsvParser("src/Data/bookstore_report.csv");
        csvP.printCsv();

        //Load Gson
      Gson gson = new Gson();
      JsonReader jread = new JsonReader(new FileReader("src/Data/authors.json"));
      AuthorParser[] authors = gson.fromJson(jread, AuthorParser[].class);

      for (var element : authors) {
        System.out.println(element.getName());
      }

    }
}
