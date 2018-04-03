package com.frode.school.repository.impl.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TeacherPO {
    private Integer tecId;
    private String tecName;
    private String tecPassword;
    private String tecProject;
    private String tecPaper;
    private String tecPatent;
    private String tecPrize;
    private String tecPosition;
    private LocalDateTime tecCreateTime;
    private LocalDateTime tecLastModifyTime;

}
