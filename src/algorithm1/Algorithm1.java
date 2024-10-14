package algorithm1;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {

        Student st1 = new Student("손오공", "1682");
        Student st2 = new Student("저팔계", "1772");
        Student st3 = new Student("사오정", "1813");

        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        for(Student s : list){
            System.out.println(s.getName() + " " +s.getNo());
        }

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.print("계속 검색을 하고싶으시면 y, 종료하고싶으시면 n: ");
            String input = scan.next();

            if(input.equals("y")){
                System.out.print("학생의 이름을 입력해주세요: ");
                String targetName = scan.next();
                boolean flag = false;

                for(Student s : list){
                    if(s.getName().equals(targetName)){
                        System.out.print(s.getName() + "님의 학번: " + s.getNo());
                        System.out.println();
                        flag = true;
                    }
                }

                if(!flag){
                    System.out.println("검색하신 학색의 이름은 존재하지 않습니다.");
                }

                for(Student s : list){}

            } else if(input.equals("n")){
                break;
            } else {
                System.out.println("올바른 값을 입력해주세요!");
            }
        }

        System.out.println("프로그림이 종료되었습니다.");
    }
}
