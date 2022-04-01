package mx.com.gapsi.exam.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
@ConfigurationProperties("my.app")
@Getter
@Setter
public class AppConfiguration implements Serializable {
    private String name;
    private String description;
    private String version;
}
