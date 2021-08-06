package top.ctong.converter.dao;

import lombok.Data;
import org.springframework.stereotype.Controller;

import java.io.Serializable;
import java.util.Date;

/**
 * █████▒█      ██  ▄████▄   ██ ▄█▀     ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒      ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░      ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄      ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄     ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒     ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 * Copyright 2021 Clover.
 * <p>
 * 用户
 * </p>
 * @author Clover
 * @version V1.0
 * @class User
 * @create 2021-08-05 19:58
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 674000787555974044L;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 年龄
     */
    private Short age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private Character sex = '男';

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userName\":\"").append(userName).append('\"');
        sb.append(",\"age\":").append(age);
        sb.append(",\"birthday\":\"").append(birthday).append('\"');
        sb.append(",\"sex\":").append(sex);
        sb.append('}');
        return sb.toString();
    }

}
