package com.afterschool.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//insert, update 시 null값은 제외
@DynamicInsert
@DynamicUpdate

@Entity(name="chat")
@Table(name="tbl_chat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(
	    name = "chat_seq_generator",
	    sequenceName = "tbl_chat_seq",
		initialValue=1, 
	    allocationSize = 1)

public class ChatEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="chat_seq_generator")
	private Long chatSeqno;

	@Column(name="class_code", length=50)
    private String classCode;
	
    @Column(name="from_id", length=50, nullable=true)
    private String fromID;
    
    @Column(name="to_id", length=50, nullable=true)
    private String toID;
    
    @Column(name="chat_content", length=100, nullable=true)
    private String chatContent;
    
    @Column(name="chat_time", nullable=true)
    private LocalDateTime chatTime;

}