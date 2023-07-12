package com.afterschool.test;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//insert, update 시 null값은 제외
@DynamicInsert
@DynamicUpdate

@Entity(name="class_test")
@Table(name="tbl_class_test")
@Getter
@Setter

@AllArgsConstructor
@Builder
public class ClassEntityforTest {
	
	@Id
	@Column(name="class_code", length=50)
	private String classCode;

	@Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "username", column = @Column(name = "writer"))
    })
    private ClassRegInfoValues classRegInfoValues;
    
    @Column(name="category", length=20, nullable=true)
    private String category;

    @Column(name="class_name", length=50, nullable=true)
    private String className;
    
    @Column(name="class_upload_date", nullable=true)
    private LocalDateTime classUploadDate;
        
    @Column(name="registered_student_cnt", nullable=false)
    @ColumnDefault("0")
    private int registeredStudentCnt;

    @Column(name="finished_student_cnt", nullable=false)
    @ColumnDefault("0")
    private int finishedStudentCnt;
    
    @Column(name="finished_rate", nullable=true, columnDefinition = "Number(3,2) default 0")
    private float finishedRate;
    
    @Column(name="avg_rate", nullable=true, columnDefinition = "Number(3,2) default 0")
    private float avgRate;
    
}