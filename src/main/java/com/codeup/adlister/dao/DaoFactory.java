package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Users UsersDao;
    private static Config config = new Config();


    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (UsersDao == null) {
            UsersDao = new MySQLUsersDao(config);
        }
        return UsersDao;
    }


}