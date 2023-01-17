import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateTester implements DateValidator{

    private String dataFormat;

    public DateTester(String dateFormat) {
        this.dataFormat = dateFormat;
    }
    
    @Override //Serve para reescrever o método herdado
    public boolean isValid(String dataString) {
        DateFormat date = new SimpleDateFormat(this.dataFormat);
        date.setLenient(false);

        try {
            date.parse(dataString);
        } catch (ParseException e) {
            return false;      
        }
        return true;
    }

    
}