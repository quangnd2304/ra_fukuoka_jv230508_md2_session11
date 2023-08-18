import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * try{
         *   blockStatements;
         * }catch(Exception ex){
         *   blockStatements; xử lý lỗi ngoại lệ
         * }finally{
         *   blockStatements;
         * }
         * */
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào số thứ nhất:");
            int number1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số thứ hai:");
            int number2 = Integer.parseInt(scanner.nextLine());
            int divide = number1 / number2;
            System.out.println("Thương 2 số là: " + divide);
        } catch (NumberFormatException ex1) {
            System.out.println("Message:"+ex1.getMessage());
            System.out.println("Lỗi không đúng định dạng");
        } catch (ArithmeticException ex2) {
            ex2.printStackTrace();
            System.out.println("Lỗi chia cho 0");
        } finally {
            System.out.println("Kết thúc chương trình");
        }

    }
}