public class DebuggableListDemo {
    public static void main(String[] args) {
        // DebuggableListのインスタンスを作成
        DebuggableList<String> debugList = new DebuggableList<>();

        // リストに要素を追加
        debugList.add("Element 1");
        debugList.add("Element 2");
        debugList.add("Element 3");

        // リストのサイズを出力
        System.out.println("リストの現在のサイズ: " + debugList.size());

        // リストの内容を出力（オプション）
        for (int i = 0; i < debugList.size(); i++) {
            System.out.println("リストの要素 " + i + ": " + debugList.get(i));
        }
    }
}
