//第3回課題
//String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
// Listに入れる内容は何でもOKだが、複数入れること。
//任意のプログラムで例外を起こしてみる。
// 課題のソースコードをGitHubにpushしてレビューを依頼する。


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class JavaKadai3 {
    public static void main(String[] args) {
        List<String> nameList1 = new ArrayList<>();
        nameList1.add("オズ");
        nameList1.add("トト");
        nameList1.add("ドロシー");
        nameList1.add("ライオン");
        nameList1.add("ブリキ");
        nameList1.add("カカシ");
        System.out.println(nameList1.size());
        System.out.println(nameList1.get(0));
        System.out.println(nameList1.get(1));
        System.out.println(nameList1.get(2));
        System.out.println(nameList1.get(3));
        System.out.println(nameList1.get(4));
        System.out.println(nameList1.get(5));

        String[] nameList2 = {"オズ", "トト", "ブリキ"};
//        int index = 4;
//        try {
//            if (index < 0 || 4 < index) {
//                throw new ArrayIndexOutOfBoundsException();
//            }
//            System.out.println(nameList2[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("配列の範囲外です");
//        }

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(nameList2[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        }

        System.out.println("終了しました");

        Map<String, String> userMap = new HashMap<>();
        userMap.put("マイク", "アメリカニューヨーク");
        userMap.put("キャシー", "アメリカワシントン");
        userMap.put("ジョン", "アメリカハワイ");
        System.out.println(userMap.get("マイク"));
        System.out.println(userMap.get("キャシー"));
        System.out.println(userMap.get("ジョン"));
    }
}