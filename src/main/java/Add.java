import AddC.AddFunc;
import DivC.DivFunc;
import MulC.MulFunc;
import SubC.SubFunc;
import java.io.IOException;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) throws IOException {
        int a = 1; // 필드
        int b = 11; // 필드
        int d = 12; // 필드

        AddFunc eunsu = new AddC.AddFunc();


        SubFunc fun = new SubFunc();

        MulFunc fun2 = new MulFunc();
        DivFunc fun3 = new DivFunc();
        // main 시점 : a,b 만들고(필드) -> 객체변수(은수) 소환 ->
        // c에다가 add(메소드) < 필드 몇개 던져줄게
        // 더하기 메소드 부를게

        // 12돌아오는게 add 메소드 -> 메인메소드로 돌아오는 "상호작용"

//        System.out.println("걍 함수를 넣어서 출력하면 안됨? : " + eunsu.add(a, b));
//
//        System.out.println("계산기 결과 : " + c);
//
//        System.out.println("이번엔 뺄거임 : " + e);
//
//        System.out.println("걍 함수를 넣어서 뺀 결고를 출력 하면 안됨? : " + fun.sub(d, b));


        // 입력
        // Sacnner , BufferedReader

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 메뉴선택 =====");

            System.out.println("1. + 계산");
            System.out.println("2. - 계산");
            System.out.println("3. * 계산");
            System.out.println("4. / 계산");
            System.out.println("0. 종료");

            System.out.print("번호를 입력하세요 : "); // 1,2,3,4,0

            int test = sc.nextInt(); // 1,2,3,4,0 ,other
            // 키보드 입력을 정수형태(int)로 받아서 test에다가 저장
            System.out.println("입력받은 값 : " + test);

            if (test == 1) {
                int ab = sc.nextInt();
                int bc = sc.nextInt();
                System.out.println("덧셈 결과 : " + eunsu.add(ab, bc));
            } else if (test == 2) {
                int ab = sc.nextInt();
                int bc = sc.nextInt();
                System.out.println("뺄셈 결과 : " + fun.sub(ab, bc));
            } else if (test == 3) {
                int ab = sc.nextInt();
                int bc = sc.nextInt();
                System.out.println("곱셈 결과 : " + fun2.mul(ab, bc));
            } else if (test == 4) {
                int ab = sc.nextInt();
                int bc = sc.nextInt();
                System.out.println("나누기 결과 : " + fun3.div(ab, bc));
            } else if (test == 0) {
//                System.exit(0);
                break;
            } else {
                System.out.println("올바른 숫자를 입력하세요.");
            }
        }
    }
}