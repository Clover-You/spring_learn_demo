package top.ctong.converter.converter;

import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
 *
 * </p>
 * @author Clover
 * @version V1.0
 * @class MyConversionServiceFactoryBean
 * @create 2021-08-05 20:44
 */
@Component("conversionService")
public class MyConversionServiceFactoryBean extends ConversionServiceFactoryBean implements Serializable {

    private static final long serialVersionUID = -3756123428588389655L;

    private final Set<Object> converterInstance = new HashSet<>();

    public MyConversionServiceFactoryBean() {
        this.setConverterInstance(new StringToUserConverter());
        super.setConverters(this.converterInstance);
    }

    /**
     * 添加converter
     * @param converter 需要添加的converter
     */
    private void setConverterInstance(Converter<?, ?> converter) {
        converterInstance.add(converter);
    }

}
