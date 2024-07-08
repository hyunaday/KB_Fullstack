package ch18.sec10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        // FileOutputStream에 ObjectOutputStream 보조 스트림 연결
        FileOutputStream fos=  new FileOutputStream("C:Temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체 생성
        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = {1,2,3};

        // 객체를 역질렬화해서 파일에 저장
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush(); oos.close(); fos.close();

        FileInputStream fis=  new FileInputStream("C:Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 파일을 읽고 역직렬화해서 객체로 복원
        // 역직렬화(Deserialize) : byte로 변환된 데이터를 원래대로 자바 시스템이 Object 또는 Data로 변환하는 기술
        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();
    }
}
