package com.ywy.code_generator.test;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserEntry
 * @author ve
 * @date 2019/7/23 22:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntry {

    private String id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "备注")
    private String remark;

}
