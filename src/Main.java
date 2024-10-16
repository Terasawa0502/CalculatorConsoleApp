import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scannerオブジェクトの準備
        Scanner scanner = new Scanner(System.in);
        // 計算機アプリのタイトルと操作の選択肢を表示
        System.out.println("計算機アプリへようこそ");
        System.out.println("メニュー画面より番号を選択してください");
        System.out.println("1:　加算(+)");
        System.out.println("2:　減算(-)");
        System.out.println("3:　乗算(×)");
        System.out.println("4:　除算(÷)");

        // ユーザが選択した操作を取得
        int choice = scanner.nextInt();

        // ユーザに1つ目の数字をい入力させる
        System.out.println("1つ目の数字を入力してください:");
        double num1 = scanner.nextDouble();
        // ユーザに2つ目の数字をい入力させる
        System.out.println("2つ目の数字を入力してください:");
        double num2 = scanner.nextDouble();

        // 計算結果を格納する変数の準備
        double result = 0;

        // ユーザの操作による条件分岐
        switch (choice) {
            case 1: // 加算
                result = num1 + num2;
                System.out.println("計算結果:　" + result);
                break;
            case 2: // 減算
                result = num1 - num2;
                System.out.println("計算結果:　" + result);
                break;
            case 3: // 乗算
                result = num1 * num2;
                System.out.println("計算結果:　" + result);
                break;
            case 4: // 除算
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("計算結果:　" + result);
                } else {
                    System.out.println("エラー:　0で割ることはできません");
                }
                break;
            default: // 無効な選択肢
                System.out.println("無効な選択肢でしたので、計算できませんでした");
                break;
        }

        // Scannerを閉じてリソース解放
        scanner.close();

    }
}