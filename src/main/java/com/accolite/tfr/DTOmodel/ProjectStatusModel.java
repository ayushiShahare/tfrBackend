package com.accolite.tfr.DTOmodel;

import com.accolite.tfr.model.Project;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProjectStatusModel {

    private int id;

    private  String status_type;

    private String status;

    private Date date_of_add;

    private int added_by;

    private Project Project;
}
