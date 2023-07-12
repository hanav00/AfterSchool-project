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
public class Address {
    // 주소 정보
    private String city; // 도시
    private String district; // 구

    @Column(name = "address_detail")
    private String detail; // 상세 주소
    private String zipCode; // 우편번호
}