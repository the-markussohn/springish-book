package lt.markussohn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author markussohn
 * 2018-09-24.
 */
@Configuration
@ComponentScan(basePackages = "lt.markussohn.springish")
public class RootConfig {
}
