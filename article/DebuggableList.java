package article;

import java.util.ArrayList;
import java.util.List;

public class DebuggableList<E> {
    private List<E> internalList = new ArrayList<>();

    // ラッパーメソッドを提供し、デバッグ情報を出力
    public boolean add(E element) {
        boolean result = internalList.add(element);
        System.out.println("要素が追加されました: " + element);
        // ここでブレークポイントを設定するか、さらに詳細なデバッグ情報を出力
        return result;
    }

    // 内部リストの状態を取得するためのヘルパーメソッド
    public E get(int index) {
        return internalList.get(index);
    }

    public int size() {
        return internalList.size();
    }

    // 必要に応じて、Listインタフェースの他のメソッドをオーバーライド
}

public class DebugExample {
    public static void main(String[] args) {
        DebuggableList<String> myList = new DebuggableList<>();

        myList.add("テスト1");
        myList.add("テスト2");

        System.out.println("リストのサイズ: " + myList.size());
    }
}
