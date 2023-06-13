import java.util.Scanner;

public class B2_2 {
    public static void main(String[] args) {
        String[] teamList;
        String[] memberName;;
        int numberCount,teamSize;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng thành viên cần chia nhóm: ");
            numberCount = sc.nextInt();
        }while(numberCount<=0);
        memberName = new String[numberCount];
        for(int i = 0; i < numberCount; i++) {
            System.out.print("Tên thành viên "+(i+1)+": ");
            memberName[i] = sc.next();
        }
        do {
            System.out.println("Số thành viên tối đa mỗi nhóm: ");
            teamSize = sc.nextInt();
        }while(teamSize>numberCount);
        int teamCount = (int)Math.ceil((double) numberCount/(double) teamSize);// dùm hàm ceil để tính số lượng nhóm từ số thành viên và số thành viên tối đa cho môt nhóm
        teamList = new String[teamCount];
        for (int i = 0; i < teamCount; i++) {
            teamList[i] = "Nhóm " + (i+1) + ":";// gán số thứ tự nhóm vào mảng
        }
            for(int i = 0; i < numberCount; i++) {
                int j = (int) (Math.random() * (numberCount- i)) + i; // random một số ngẫu nhiên
                // hoán vị tên các thành viên
                String temp = memberName[i];
                memberName[i] = memberName[j];
                memberName[j] = temp;
                int teamNumber = i/teamSize;
                teamList[teamNumber] += memberName[i]+ " ";// gán tên thành viên vào mảng
            }
            for (int i = 0; i < teamCount; i++) {
                System.out.println(teamList[i]);
        }

    }
}

