package pokemon.game;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("1) 포켓몬 생성 2) 프로그램 종료 : ");
            char menu = '\0';
            menu = sc.next().charAt(0);
            sc.nextLine();
            if (menu == '2') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if(menu == '1'){
                char pokemon = '\0';
                String n = null;
                String s = null; // 스킬 배열 들어갈 장소 수정 필요
                System.out.print("1) 피카츄 2) 꼬부기 3) 파이리 : ");
                pokemon = sc.next().charAt(0);
                sc.nextLine();
                System.out.print(" 플레이어 이름 입력 : ");
                n = sc.nextLine();
                System.out.print(" 사용 가능한 기술 입력(/로 구분하여 입력) : ");
                s = sc.nextLine();      //스킬 배열 들어갈 장소 수정 필요

                if (pokemon == '1'){
                   Pikachu p = new Pikachu(n,s); // 스킬에는 배열이 들어가므로 현상태는 오류가 맞음
                }
                else if (pokemon == '2'){
                    Ggoboogi p = new Ggoboogi(n,s); // 스킬에는 배열이 들어가므로 현상태는 오류가 맞음
                }
                if (pokemon == '3'){
                    Pairi p = new Pairi(n,s); // 스킬에는 배열이 들어가므로 현상태는 오류가 맞음
                }
                else{
                    System.out.println("메뉴에서 골라주세요.");
                }
                p.info();


            }
        }//end of while
    }//end of main
}// end of class
