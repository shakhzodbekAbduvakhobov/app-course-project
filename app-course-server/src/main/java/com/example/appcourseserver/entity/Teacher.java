package com.example.appcourseserver.entity;

import com.example.appcourseserver.entity.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Teacher extends AbsEntity {
}
