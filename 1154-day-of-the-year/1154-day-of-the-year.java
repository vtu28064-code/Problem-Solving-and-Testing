import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.getDayOfYear();
    }
}
