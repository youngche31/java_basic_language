import java.util.Scanner;

// java 입출력에 대한 Scanner 코드입니다.
public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("아무 문자열이나 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("입력한 문자열은 아래에 있습니다.");
        System.out.println(input);
    }
}
