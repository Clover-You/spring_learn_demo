package top.ctong.custom.view;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.View;
import top.ctong.custom.dao.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Map;
import java.util.function.Consumer;

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
 * 自定义视图
 * </p>
 * @author Clover
 * @version V1.0
 * @class MyCustomView
 * @create 2021-08-04 19:35
 */
public class MyCustomView implements Serializable, View {

    private static final long serialVersionUID = 8278828333781661446L;

    /* 视图名称 */
    private final String VIEW_NAME;

    private transient HttpServletRequest request;

    private transient HttpServletResponse response;

    public MyCustomView(String viewName) {
        this.VIEW_NAME = viewName;
    }

    /**
     * 获取 Content-Type
     */
    @Override
    public String getContentType() {
        String contentType = request.getContentType();
        System.out.println(contentType);
        return contentType == null ? MediaType.APPLICATION_JSON_VALUE : contentType;
    }

    /**
     * 渲染视图
     * @param map BindingAwareModelMap对象「域对象」
     * @param request request 信息
     * @param response response 信息
     */
    @Override
    public void render(Map<String, ?> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
        this.request = request;
        this.response = response;
        try (PrintWriter writer = this.response.getWriter()) {
            this.response.setContentType(getContentType());
            writer.println(User.init());
        } catch (IOException e) {
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

}
