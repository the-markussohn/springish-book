package lt.markussohn.springish.domain;

import lombok.Data;

/**
 * @author markussohn
 * 2018-09-19.
 */
@Data
public class User {

    private Long id = 1L;
    private String name = "Dummy";
    private Integer age = 100;
    private Double weight = 88.8;
    private Double height = 190.0;

}
