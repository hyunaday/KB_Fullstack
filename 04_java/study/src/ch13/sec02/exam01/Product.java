package ch13.sec02.exam01;

// 제네릭 타입
// 타입 파라미터로 K와 M 정의
public class Product<K,M> {
    // 타입 파라미터를 필드 타입으로 사용
    private K kind;
    private M model;

    // 타입 파라미터를 리턴 타입과 매개 변수 타입으로 사용
    // alt + insert 눌러서 'Getter and Setter' 클릭
    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
