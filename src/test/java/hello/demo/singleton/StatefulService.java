package hello.demo.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 빌드

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
