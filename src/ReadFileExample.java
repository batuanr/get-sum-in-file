import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args)  {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(url);
    }
    public static void readFileText(String url)  {
        File file;
        try {
            file = new File(url);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (IOException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
