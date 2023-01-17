import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Holidays {

    private Map<String, String> holiday = new HashMap<>(); 

    public Holidays() {
        buildMainHolidays();
    }

    private void buildMainHolidays() {
        holiday.put("01/01/2023", "Confraternização mundial");
        holiday.put("21/02/2023", "Carnaval");
        holiday.put("17/04/2023", "Páscoa");
        holiday.put("21/04/2023", "Tiradentes");
        holiday.put("01/05/2023", "Dia do trabalho");
        holiday.put("08/06/2023", "Corpus Christi");
        holiday.put("07/09/2023", "Independência do Brasil");
        holiday.put("12/10/2023", "Nossa Senhora Aparecida");
        holiday.put("02/11/2023", "Finados");
        holiday.put("15/11/2023", "Proclamação da República");
        holiday.put("25/12/2023", "Natal");
    }

    public String getHoliday(String date) {
        return holiday.get(date);
    }

    public Collection<String> getAllHolidays() {
        return holiday.keySet();
    }
}
