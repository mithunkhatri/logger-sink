package com.mithunkhatri.data.loggersink.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentManager {

    private int empNo;
    private int deptNo;
    private Date fromDate;
    private Date toDate;
}
