package top.ctong.converter.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;
import top.ctong.converter.dao.User;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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
 * 字符串转user
 * </p>
 * 不需要加入容器，因为需要手动注册到ConventionsService
 * @author Clover
 * @version V1.0
 * @class StringToUserConverter
 * @create 2021-08-05 20:29
 */
public class StringToUserConverter implements Serializable, Converter<String, User> {

    private static final long serialVersionUID = -8698435562620881390L;


    /**
     * 自定义类型转换器，String =====>> User。数据格式：clover-19-男-2021/08/05
     * @param source 参数
     */
    @Override
    public User convert(String source) {
        try {
            if (!StringUtils.hasText(source)) return null;
            if (!source.contains("-")) return null;
            // 通过"-"分割
            String[] split = source.split("-");
            User user = new User();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Short age = Short.parseShort(split[1]);
            Character sex = split[2].toCharArray()[0];
            Date da = sdf.parse(split[3]);

            user.setUserName(split[0]);
            user.setAge(age);
            user.setBirthday(da);
            user.setSex(sex);
            return user;
        } catch (Exception e) {
            return null;
        }
    }

}
