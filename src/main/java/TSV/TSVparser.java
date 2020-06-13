package TSV;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

//Парсинг Tsv файла с помощью библиотеки univocity
public class TSVparser {
    public static List<String[]> parseTsv(String fileName)  {

        try (Reader inputReader = new InputStreamReader(new FileInputStream(
                new File(fileName)), StandardCharsets.UTF_16)) {
            TsvParserSettings settings = new TsvParserSettings();
            settings.getFormat().setLineSeparator("\n");

            TsvParser parser = new TsvParser(settings);
            List<String[]> parsedRows = parser.parseAll(inputReader);
            return parsedRows;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
