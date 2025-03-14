package kioskproject;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 속성
    private String category;
    private List<MenuItem> menuItems = new ArrayList<>();

    // 생성자
    public Menu(String category) {
        this.category = category;

        switch (category) {
            // 람다 : break 문 없이 자동으로 종료됨
            case "Burger" -> {
                menuItems.add(new MenuItem("리아 버거      | ", 4900, " |  두툼한 쇠고기패티와 한국적인 맛의 소스가 잘 조화된 롯데리아 대표 버거"));
                menuItems.add(new MenuItem("더블치즈 버거   | ", 7000, " |  두 장의 패티가 이루는 조화로운 맛에 든든함까지 추가된 더블 클래식치즈버거"));
                menuItems.add(new MenuItem("사각새우 버거   | ", 5900, " |  미니 새우 패티 2장의 새우 매니아를 위한 버거"));
                menuItems.add(new MenuItem("모짜렐라 버거   | ", 7600, " |  자연산 모짜렐라 치즈와 고소한 베이컨이 만나 풍부한 맛의 버거"));
            }
            case "Drink" -> {
                menuItems.add(new MenuItem("코카콜라    | ", 1500, " |  시원한 청량감이 가득한 탄산 음료"));
                menuItems.add(new MenuItem("제로콜라    | ", 1500, " |  제로로 부담없이 즐기는 탄산 음료"));
                menuItems.add(new MenuItem("아이스티    | ", 2000, " |  달콤한 복숭아 맛 아이스티"));
                menuItems.add(new MenuItem("생수       | ", 700, " |  시원한 생수"));
            }
            case "Side" -> {
                menuItems.add(new MenuItem("감자튀김     | ", 2000, " |  짭짤한 감자튀김"));
                menuItems.add(new MenuItem("어니언링     | ", 2300, " |  국내산 양파로 만든 어니언링"));
                menuItems.add(new MenuItem("치킨너겟     | ", 2700, " |  바삭한 치킨 너겟"));
                menuItems.add(new MenuItem("소프트아이스  | ", 1500, " |  달콤한 소프트 아이스크림"));
            }
            default -> throw new IllegalStateException("Unexpected value: " + category);
        }
    }
     // 기능(메뉴 출력)
    public void showCategory(){
        int i = 1;
        for(MenuItem menuItem : menuItems){
            System.out.println(i + ". " + menuItem.getName() + menuItem.getPrice() + menuItem.getExplain());
            i++;
        }
    }

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
