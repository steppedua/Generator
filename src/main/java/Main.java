import Parsing.TXTGenerator;
import TSV.TSVparser;
import TSV.XMLparser;

//Запуск генерации парсинга и выведения txt файла
public class Main {
    public static void main(String[] args) {
        TSVparser.parseTsv("src/main/resources/source-data.tsv");
        XMLparser.parse("src/main/resources/settings.xml");

        TXTGenerator.generate();

    }
}

