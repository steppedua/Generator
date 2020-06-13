package Parsing;

import XML.XMLparserColumn;
import XML.XMLparserSettings;

import java.util.ArrayList;
import java.util.List;

public class ParseGenerator {
    private static final String TILDA = "~";
    private static final String SPACE = " ";
    private static final String SEPARATOR = "|";
    private static final String TRAIT = "--------------------------------";

    private XMLparserSettings settings;

    private List<String> stringList = new ArrayList<>();

    public StringBuilder generate(){
        List<String> strings = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        builder.append(SEPARATOR);
        for (int i = 0; i < settings.getColumns().size(); i++) {
            builder.append(generateColumn(strings.get(i)));
        }
        return builder;
    }

    private StringBuilder generateColumn(String column) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SPACE);
        stringBuilder.append(column);

        stringBuilder.append(SPACE).append(SEPARATOR);
        return stringBuilder;
    }
}