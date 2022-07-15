package link.shier.springframework.test.bean;


/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 15:40
 **/
public class UserService{
    private String uId;
    private String company;
    private String location;
    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId)+", 公司："+company+", 地点"+location;
    }

    public UserService() {}

    public UserService(String uId, IUserDao userDao) {
        this.uId = uId;
        this.userDao = userDao;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
