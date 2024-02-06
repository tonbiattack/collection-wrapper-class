class DebuggableList:
    def __init__(self):
        self.internal_list = []

    def append(self, item):
        print(f"Adding an item: {item}")  # 要素が追加される時に情報を出力
        # ここでブレークポイントを設定するか、さらに詳細なデバッグ情報を出力可能
        self.internal_list.append(item)

    def __getitem__(self, index):
        return self.internal_list[index]

    def __len__(self):
        return len(self.internal_list)

    # 必要に応じて他のリストメソッドをオーバーライド

# 使用例
if __name__ == "__main__":
    debug_list = DebuggableList()
    debug_list.append("Test 1")
    debug_list.append("Test 2")
    debug_list.append("Test 3")

    print(f"List size: {len(debug_list)}")
    for i in range(len(debug_list)):
        print(f"Item {i}: {debug_list[i]}")
