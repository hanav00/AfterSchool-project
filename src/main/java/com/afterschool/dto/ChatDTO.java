package com.afterschool.dto;

import java.time.LocalDateTime;

import com.afterschool.entity.ChatEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatDTO {
	
    private Long chatSeqno;    
    private String classCode;
    private String fromID;
    private String toID;
    private String chatContent;
    private LocalDateTime chatTime;
	
	public ChatDTO(ChatEntity chatEntity) {
		
	    this.chatSeqno = chatEntity.getChatSeqno();
	    this.classCode = chatEntity.getClassCode();
	    this.fromID = chatEntity.getFromID();
	    this.toID = chatEntity.getToID();
	    this.chatContent = chatEntity.getChatContent();
	    this.chatTime = chatEntity.getChatTime();
		
	}
	
	public ChatEntity dtoToEntity(ChatDTO dto) {
		
		ChatEntity chatEntity = ChatEntity.builder()
					    	.chatSeqno(dto.getChatSeqno())
						    .classCode(dto.getClassCode())
						    .fromID(dto.getFromID())
						    .toID(dto.getToID())
						    .chatContent(dto.getChatContent())
						    .chatTime(dto.getChatTime())
							.build();
		return chatEntity;
	}
	
}
