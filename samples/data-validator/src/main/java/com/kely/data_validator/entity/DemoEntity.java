package com.kely.data_validator.entity;

import com.kely.data_validator.anntation.FlagValidator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import java.io.Serializable;

public class DemoEntity implements Serializable {
    @NotBlank
    @Length(min = 2, max = 10, message = "姓名字数长度必须在2和10之间")
    private String name;

    @Min(value = 1, message = "年龄最小1")
    private int age;

    @NotBlank(message = "邮箱地址不能为空")
    @Email(message = "请输入合法邮箱地址")
    private String mail;

    @FlagValidator(values = "1,2,3")
    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}