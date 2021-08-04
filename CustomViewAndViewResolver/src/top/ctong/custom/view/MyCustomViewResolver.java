package top.ctong.custom.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import top.ctong.custom.controller.TestCustomViewAndViewResolverController;

import java.io.Serializable;
import java.util.Locale;

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
 * 自定义视图解析器
 * </p>
 *
 * @author Clover
 * @version V1.0
 * @class MyCustomViewResolver
 * @create 2021-08-04 19:36
 */
@Component
public class MyCustomViewResolver implements Serializable, ViewResolver {

    private static final long serialVersionUID = 4789365246636616938L;

    /* 视图名称前缀 */
    public static final String VIEW_NAME_PREFIX = "clover:";

    /* 空字符 */
    private static final String EMPTY_STRING = "";

    /* 日志记录 */
    private final transient Logger log = LoggerFactory.getLogger(MyCustomViewResolver.class);

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        log.info("resolveViewName执行了...");
        if (viewName.startsWith(VIEW_NAME_PREFIX)) {
            String uri = viewName.replaceFirst(VIEW_NAME_PREFIX, EMPTY_STRING);
            return new MyCustomView(uri);
        }
        return null;
    }

}
