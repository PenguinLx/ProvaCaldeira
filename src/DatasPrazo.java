import java.time.LocalDate;

public class DatasPrazo {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo  = hoje.plusDays(10);
        System.out.println(prazo);
    }
}
//output: 2025-06-19