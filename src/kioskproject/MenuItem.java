package kioskproject;

public class MenuItem {
    // 속성
    private final String name;
    private final long price;
    private final String explain;

    // 생성자
    public MenuItem(String name, long price, String explan){
        this.name = name;
        this.price = price;
        this.explain = explan;
    }

    // 기능
    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }
}
