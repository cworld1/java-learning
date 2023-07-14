package g_oop3.d_block.exer;

/**
 * ClassName: User1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:26
 * @Version 1.0
 */
public class User1 {
    static private int userDefaultID = 1001;// 用户id
    private String userName;
    private String password;
    private long registrationTime;// 注册时间

    // 代码块的使用
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();// 获取系统当前时间 （距离1970-1-1 00:00:00的毫秒数）
    }

    public User1() {
        userName = "user_" + userDefaultID++;
        password = "123456";
    }

    public User1(String userName, String password) {
        // System.out.println("新用户注册");
        // registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo() {
        return "用户名：" + userName + ", 密码：" + password + "，注册时间：" + registrationTime;
    }
}
