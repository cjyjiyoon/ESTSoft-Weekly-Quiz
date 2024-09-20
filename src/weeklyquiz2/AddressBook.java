package weeklyquiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        int choice = 0;
        String name;
        String phoneNumber;
        String type;
        Scanner scanner = new Scanner(System.in);

        // 메뉴 선택
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");


        while (choice != 5) {
            System.out.println("메뉴를 선택해주세요.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    BusinessContact businessContact = new BusinessContact();
                    System.out.print("이름을 입력하세요: ");
                    name = scanner.next();
                    System.out.print("전화번호를 입력하세요.");
                    phoneNumber = scanner.next();
                    System.out.print("회사명을 입력하세요: ");
                    type = scanner.next();

                    businessContact.setName(name);
                    businessContact.setPhoneNumber(phoneNumber);
                    businessContact.setCompany(type);

                    contacts.add(businessContact);

                    break;
                case 2:
                    PersonalContact personalContact = new PersonalContact();
                    System.out.print("이름을 입력하세요: ");
                    name = scanner.next();
                    System.out.print("전화번호를 입력하세요.");
                    phoneNumber = scanner.next();
                    System.out.print("관계를 입력하세요: ");
                    type = scanner.next();

                    personalContact.setName(name);
                    personalContact.setPhoneNumber(phoneNumber);
                    personalContact.setRelationship(type);

                    contacts.add(personalContact);

                    break;
                case 3:
                    if (!contacts.isEmpty()) {
                        for (int i = 0; i < contacts.size(); i++) {
                            if (contacts.get(i) instanceof BusinessContact) {
                                System.out.println("이름: " + contacts.get(i).getName() + ", 전화번호: " + contacts.get(i).getPhoneNumber() + ", 회사명: " + ((BusinessContact) contacts.get(i)).getCompany());
                            } else {
                                System.out.println("이름: " + contacts.get(i).getName() + ", 전화번호: " + contacts.get(i).getPhoneNumber() + ", 관계: " + ((PersonalContact) contacts.get(i)).getRelationship());
                            }
                        }
                    } else {
                        System.out.println("연락처가 비어있습니다.");
                    }

                    break;
                case 4:
                    int count = 0;
                    System.out.print("검색할 이름을 입력하세요: ");
                    name = scanner.next();
                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).getName().equals(name)) {
                            if (contacts.get(i) instanceof BusinessContact) {
                                count++;
                                System.out.println("이름: " + contacts.get(i).getName() + ", 전화번호: " + contacts.get(i).getPhoneNumber() + ", 회사명: " + ((BusinessContact) contacts.get(i)).getCompany());
                            } else {
                                count++;
                                System.out.println("이름: " + contacts.get(i).getName() + ", 전화번호: " + contacts.get(i).getPhoneNumber() + ", 관계: " + ((PersonalContact) contacts.get(i)).getRelationship());
                            }

                        }
                    }
                    if (count == 0) {
                        System.out.println("연락처를 찾을 수 없습니다.");
                    }


                    break;
            }
        }


    }

    public void displayContacts() {

    }

    public String searchContact(String name) {
        return null;
    }
}
