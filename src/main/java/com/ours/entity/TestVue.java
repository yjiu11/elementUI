package com.ours.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjiu123
 * @since 2019-10-16
 */
@TableName("test_vue")
public class TestVue implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("username")
    private String username;
    @TableField("address")
    private String address;
    @TableField("type")
    private String type;
    @TableField("age")
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestVue{" +
        ", id=" + id +
        ", username=" + username +
        ", address=" + address +
        ", type=" + type +
        ", age=" + age +
        "}";
    }
}
