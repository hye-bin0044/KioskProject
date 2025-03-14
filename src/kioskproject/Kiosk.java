package kioskproject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menus = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    public void start() {
        menus.add(new Menu("Burger"));
        menus.add(new Menu("Drink"));
        menus.add(new Menu("Side"));

        // 반복문 사용 : 종료를 원할때까지 반복
        while (flag) {
            System.out.println("[ HAMBURGER STORE MENU ]");

            // 메뉴 클래스에서 메뉴출력 기능 가져오기
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. Exit");
            System.out.println("===================");
            System.out.println("메뉴 번호를 입력해주세요.");

            try {
                Integer numbers = sc.nextInt();
                switch (numbers) {
                    case 0 -> {
                        System.out.println("프로그램을 종료합니다");
                        flag = false;
                        break;
                    }
                    case 1, 2, 3 -> {
                        while (true) {
                            System.out.println("[ " + menus.get(numbers -1).getCategory() + " MENU ]");
                            menus.get(numbers-1).showCategory();
                            System.out.println("0. 뒤로가기");
                            System.out.println("===================");

                            System.out.println("메뉴 번호를 입력해주세요.");
                            Integer menuNumber = sc.nextInt();
                            if (menuNumber == 0) {
                                break;
                            }else if (menuNumber < 1 || menuNumber > menus.get(numbers - 1).getMenuItems().size()) {
                                System.out.println("오류: 올바른 메뉴 번호를 입력해주세요.");
                                continue;
                            }
                        }
                    }
                    default -> {
                        System.out.println("오류: 올바른 메뉴 번호를 입력해주세요.");
                        continue;
                    }
                }
            } catch (Exception e) {
                System.out.println("오류 : 숫자로 입력해주세요.");
                sc.nextLine();
                continue;
            }
            while (true) {

                System.out.println("주문을 진행하시겠습니까? (yes/no)");
                String exit = sc.next();

                if (exit.equalsIgnoreCase("yes")) {
                    System.out.println("접수가 완료되었습니다.");
                    flag = false;
                    break;
                } else if (exit.equalsIgnoreCase("no")) {
                    System.out.println("처음으로 돌아갑니다.");
                    break;
                } else {
                    throw new IllegalArgumentException("오류 : yes 혹은 no로 입력해주세요.");
                }
            }
        }
    }
}
