package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //시작 위치 지정(시작 위치 지정하지 않고 설정 정보 클래스 위치를 프로젝트 최상단에 두는 것 권장)
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
