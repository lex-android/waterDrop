package com.netease.nim.uikit.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dengxiaolei on 2017/6/12.
 */

public class UserInfoEntity implements Serializable{
    /**
     * identifies : [{"identifyName":"塘主","level":5,"type":1,"uid":14967432761081},{"identifyName":"贴主","level":3,"type":2,"uid":14967432761081}]
     * userLikes : [{"categoryId":1,"categoryName":"数码"}]
     * birthday : 1993-10-22
     * idCode : 9553347
     * location : 中国
     * loginType : 1
     * mobile : 18658828735
     * nationCode : 86
     * neteaseAccid : sjk_14967432761081
     * neteaseToken : b4caa9f1810ad5f6b552245f02620fed
     * nickName : 青岩
     * photo : http://authenticPhoto65FM1.jpg
     * registerStatus : 1
     * role : 0
     * sex : 2
     * status : 1
     * beans : 1
     * footprintNum : 100
     * uid : 14967432761081
     * userDesc :
     * userToken : 4756158972134745395b39651983b8e7
     * userType : 1
     */

    private String birthday;
    private int idCode;
    private String location;
    private int loginType;
    private String mobile;
    private String nationCode;
    private String neteaseAccid;
    private String neteaseToken;
    private String nickName;
    private String photo;
    private int registerStatus;
    private int role;
    private int sex;
    private int status;
    private String beans;
    private int footprintNum;
    private long uid;
    private String userDesc;
    private String userToken;
    private int userType;
    private List<IdentifiesBean> identifies;
    private List<UserLikesBean> userLikes;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNeteaseAccid() {
        return neteaseAccid;
    }

    public void setNeteaseAccid(String neteaseAccid) {
        this.neteaseAccid = neteaseAccid;
    }

    public String getNeteaseToken() {
        return neteaseToken;
    }

    public void setNeteaseToken(String neteaseToken) {
        this.neteaseToken = neteaseToken;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(int registerStatus) {
        this.registerStatus = registerStatus;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public int getFootprintNum() {
        return footprintNum;
    }

    public void setFootprintNum(int footprintNum) {
        this.footprintNum = footprintNum;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public List<IdentifiesBean> getIdentifies() {
        return identifies;
    }

    public void setIdentifies(List<IdentifiesBean> identifies) {
        this.identifies = identifies;
    }

    public List<UserLikesBean> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(List<UserLikesBean> userLikes) {
        this.userLikes = userLikes;
    }

    public static class IdentifiesBean  implements Serializable{
        /**
         * identifyName : 塘主
         * level : 5
         * type : 1
         * uid : 14967432761081
         */

        private String identifyName;
        private int level;
        private int type;
        private long uid;

        public String getIdentifyName() {
            return identifyName;
        }

        public void setIdentifyName(String identifyName) {
            this.identifyName = identifyName;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getUid() {
            return uid;
        }

        public void setUid(long uid) {
            this.uid = uid;
        }
    }

    public static class UserLikesBean implements Serializable{
        /**
         * categoryId : 1
         * categoryName : 数码
         */

        private int categoryId;
        private String categoryName;

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }
    }



   /* *//**
     * identifies : [{"identifyName":"塘主","level":5,"type":1,"uid":14967432761081},{"identifyName":"贴主","level":3,"type":2,"uid":14967432761081}]
     * birthday : 1993-10-22
     * idCode : 9553347
     * location : 中国
     * loginType : 1
     * mobile : 18658828735
     * nationCode : 86
     * neteaseAccid : sjk_14967432761081
     * neteaseToken : b4caa9f1810ad5f6b552245f02620fed
     * nickName : 青岩
     * photo : http://authenticPhoto65FM1.jpg
     * registerStatus : 1
     * role : 0
     * sex : 2
     * status : 1
     * beans : 1
     * uid : 14967432761081
     * userDesc :
     * userToken : 4756158972134745395b39651983b8e7
     * userType : 1
     *//*

    private String birthday;
    private int idCode;
    private String location;
    private int loginType;
    private String mobile;
    private String nationCode;
    private String neteaseAccid;
    private String neteaseToken;
    private String nickName;
    private String photo;
    private int registerStatus;
    private int role;
    private int sex;
    private int status;
    private long uid;
    private String userDesc;
    private String userToken;
    private int userType;
    private int beans;
    private List<IdentifiesBean> identifies;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNeteaseAccid() {
        return neteaseAccid;
    }

    public void setNeteaseAccid(String neteaseAccid) {
        this.neteaseAccid = neteaseAccid;
    }

    public String getNeteaseToken() {
        return neteaseToken;
    }

    public void setNeteaseToken(String neteaseToken) {
        this.neteaseToken = neteaseToken;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(int registerStatus) {
        this.registerStatus = registerStatus;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public List<IdentifiesBean> getIdentifies() {
        return identifies;
    }

    public void setIdentifies(List<IdentifiesBean> identifies) {
        this.identifies = identifies;
    }

    public static class IdentifiesBean {
        *//**
         * identifyName : 塘主
         * level : 5
         * type : 1
         * uid : 14967432761081
         *//*

        private String identifyName;
        private int level;
        private int type;
        private long uid;

        public String getIdentifyName() {
            return identifyName;
        }

        public void setIdentifyName(String identifyName) {
            this.identifyName = identifyName;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getUid() {
            return uid;
        }

        public void setUid(long uid) {
            this.uid = uid;
        }
    }*/
}
