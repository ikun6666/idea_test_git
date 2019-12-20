package top.llk.pojo;

/**
 * @Version 1.0
 * @Author: Lin Liangkun
 * @Date: 2019/12/20
 * @Content:
 */
public class User {
    private String name;
    private int num;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User(String name, int num, String gender) {

        this.name = name;
        this.num = num;
        this.gender = gender;
    }

    public User() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public User(String name, int num) {

        this.name = name;
        this.num = num;
    }
}
