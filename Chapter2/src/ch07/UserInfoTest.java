package ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userLee = new UserInfo();
        userLee.userId = "a1234";
        userLee.userPassword = "123425";
        userLee.userName = "lee";
        userLee.phoneNumber = "01012345678";
        userLee.userAddress = "seoul";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b1234","01231","kim");
        System.out.println(userKim.showUserInfo());
    }
}
