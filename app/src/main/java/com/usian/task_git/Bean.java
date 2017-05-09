package com.usian.task_git;

/**
 * Created by 丰 on 2017/5/9.
 */

public class Bean {
    private String name;
    private String sex;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void running(){
        name = "";
    }

    public void qingge(){

        Log.e("TAG","你好啊");

    }

}
