package homework.pro.ex;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Start {

	static String dirName = "D:\\javastudy\\files1";
	static String filename = dirName + "\\phonemanage.txt";

	private static void printList(List<Phone> list) {
		System.out.println("<1.리스트>");
		for (int i = 0; i < list.size(); i++) {
			Phone p = list.get(i);
			String name = p.getName();
			String hp = p.getHp();
			String tel = p.getTel();
			System.out.println(i + 1 + "." + name + "\t" + hp + "\t" + tel);
		}
	}
	public static void main(String[] args) {
		// TODO: 파일로부터 데이터 불러오기
		// 한줄씩 불러오면서 -> 잘라서(,)로 -> Phone의 필드로 세팅
		// List<Phone>
		File file = new File(filename);

//		System.out.println(file.exists());
		List<Phone> list = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(file);
			Phone name;
			Phone hp;
			Phone tel;

			while (scanner.hasNextLine()) {

//				name = scanner.next();
//				hp = scanner.next();
//				tel = scanner.next();
//
//				System.out.printf("%s,%s,%s%n", name, hp, tel);
//				scanner.nextLine();

				String line = scanner.nextLine();
				String[] tokens = line.split(",");

				Phone p = new Phone(tokens[0], tokens[1], tokens[2]);
				System.out.println(p);

				list.add(p);
			}
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.println(" ************************************************* ");
		System.out.println(" *               전화번호 관리 프로그램                             * ");
		System.out.println(" ************************************************* ");

		while (true) {
			System.out.println("1. 리스트   2.등록   3.삭제   4.검색   5.종료");
			System.out.println(" --------------------------------------------- ");
			System.out.print(">메뉴번호: ");

			int menuNo = sc.nextInt();

			switch (menuNo) {

			case 1:
//				System.out.println("<1.리스트>");
//				for (int i = 0; i < list.size(); i++) {
//					Phone p = list.get(i);
//					String name = p.getName();
//					String hp = p.getHp();
//					String tel = p.getTel();
//					System.out.println(i + 1 + "." + name + "\t" + hp + "\t" + tel);
//				}
				printList(list);

				break;
			case 2:
				System.out.println("<2.등록>");

				System.out.print(">이름: ");
				String t = sc.next();
				System.out.print(">휴대전화: ");
				String u = sc.next();
				System.out.print(">집전화: ");
				String v = sc.next();
				System.out.println();
				Phone s = new Phone(t, u, v);
				list.add(s);
				System.out.println("[등록되었습니다]");
				break;
			case 3:
				System.out.println("<3.삭제>");

				System.out.print(">번호: ");
				int w = sc.nextInt();
				list.remove(w-1);
				System.out.println("size of list: " + list.size());

				System.out.println();
				System.out.println("[삭제 되었습니다]");
				break;
			case 4:
				System.out.println("<4.검색>");

				System.out.print(">이름: ");
				String x = sc.next();
				for(int i = 0; i < list.size(); i++) {
					Phone y = list.get(i);
					String name = y.getName();
					
					String hp = y.getHp();
					String tel = y.getTel();
					if(name.contains(x)) {
						System.out.println(i + 1 + "." + name + "\t" + hp + "\t" + tel);
					}
				}

				System.out.println();
				break;
			case 5:
				System.out.println();
				System.out.println("****************************************");
				System.out.println("*                감사합니다                          *");
				System.out.println("****************************************");
				break;
			default:
				System.out.println("[다시 입력해주세요]");
				break;

			}// switch

		} // while

	}// main

}// class
