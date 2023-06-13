import java.text.Normalizer;

public class Main {
    public static String removeAccents(String input) {
        //Hàm Normalizer.normalize() dùng để chuẩn hóa unicode, phân tách các kí tự có dấu thành kí tự đơn và kí tự dấu riêng biệt.
        //Normalizer.Form.NFD để đưa về kết hợp giữa kí tự đơn và kí tự dấu riêng biệt.

        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    public static void main(String[] args) {

        String input = "Xin chào mọi người. Mình là Kai ";

        String output = removeAccents(input);

        System.out.println(output);

    }
}

