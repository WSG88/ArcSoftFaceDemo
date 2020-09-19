package com.itboyst.facedemo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("toImageDemo").setViewName("imageDemo");
    }
}

/*

//上面到的写法等价于：

@Controller
public class EmpContrller {

    @RequestMapping("toImageDemo")
    public String toImageDemo() {

        return "imageDemo";
    }
}*/
