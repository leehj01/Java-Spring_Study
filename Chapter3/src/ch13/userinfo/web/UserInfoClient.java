package ch13.userinfo.web;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties"); // 파일을 읽는 방법

        Properties prop = new Properties(); // 파일을 읽어드리는 객체
        prop.load(fis);  // inputstream으로 읽어드림

        String dbType = prop.getProperty("DBTYPE");  // db.properties 에 DBTYPE 이 저장되어있음

        UserInfo userInfo = new UserInfo();  // 원래는 홈페이지에서 입력하지만, 지금은 없으므로 여기서 만들어줌
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%^");
        userInfo.setUserName("이순신");

        UserInfoDao userInfoDao = null; // 처음에는 userInforDao 가  없으므로 null

        if (dbType.equals("ORACLE")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else if (dbType.equals("MYSQL")){
            userInfoDao = new UserInfoOracleDao();
        }
        else{
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUSerInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
