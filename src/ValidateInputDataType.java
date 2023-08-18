import java.util.Scanner;

public class ValidateInputDataType {
    public static void main(String[] args) {
        //Nhập vào tuổi sinh viên phải là số nguyên lớn hơn 18
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tuổi sinh viên:");
        boolean isExit = true;
        int age=0;
        do {
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age>=18){
                    isExit = false;
                }else{
                    System.err.println("Tuổi sinh viên phải lớn hơn 18, vui lòng nhập lại");
                }
            }catch (NumberFormatException ex){
                System.err.println("Tuổi sinh viên phải là số nguyên, vui lòng nhập lại");
            }
        }while (isExit);
        System.out.println("Tuổi sinh viên: "+age);
    }
}
