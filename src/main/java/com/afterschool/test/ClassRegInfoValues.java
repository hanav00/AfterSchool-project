package com.afterschool.test;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRegInfoValues {
    // 강사 정보
	
	@Column(name = "username", length=20, nullable=true)
    private String userid;

//    @Column(name = "address_detail")
//    private String detail; // 상세 주소
//    private String zipCode; // 우편번호
}