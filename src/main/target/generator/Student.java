package generator;

import java.io.Serializable;
import lombok.Data;

/**
 * student
 * @author 
 */
@Data
public class Student implements Serializable {
    private Integer id;

    private String name;

    private Integer tid;

    private static final long serialVersionUID = 1L;
}