package firm.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/resources/");

        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
        registry.addResourceHandler("/public/css/**").addResourceLocations("/resources/public/css/");
        //registry.addResourceHandler("/image/**").addResourceLocations("/resources/public/image/");

//        registry
//                .addResourceHandler("/webjars/**")
//                .addResourceLocations("/webjars/");
    }
}