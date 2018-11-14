package vn.codegym.QuyenLeSy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleClassName {
    private static final String NAME_REGEX ="^[ACP]\\d{4}[GHIKLM]$";

    public ExampleClassName(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
