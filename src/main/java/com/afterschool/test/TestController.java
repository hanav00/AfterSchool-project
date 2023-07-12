package com.afterschool.test;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.afterschool.dto.ClassDTO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TestController {

//	private final FFmpegWrapper fFmpegWrapper;

	
	//영상 업로드
	@ResponseBody
	@PostMapping("/test/videoUpload")
	public static double postFileUpload(ClassDTO classDTO, @RequestParam("videoFiles") List<MultipartFile> multipartFile) throws Exception{
		
		System.out.println("요청 옴");
		
		if(!multipartFile.isEmpty()) {//파일 등록 및 수정 시 파일 업로드
//			File targetFile = null; 
			
			for(MultipartFile mpr:multipartFile) {
				
				System.out.println(mpr.getOriginalFilename());
				
//				String org_filename = mpr.getOriginalFilename();	
//				String org_fileExtension = org_filename.substring(org_filename.lastIndexOf("."));	
//				String stored_filename = UUID.randomUUID().toString().replaceAll("-", "") + org_fileExtension;	
//				long filesize = mpr.getSize() ;
//
//				targetFile = new File(path + stored_filename);
//				mpr.transferTo(targetFile);
//				
//				FileDTO fileDTO = FileDTO.builder()
//								.seqno(seqno)
//								.email(board.getEmail().getEmail())
//								.org_filename(org_filename)
//								.stored_filename(stored_filename)
//								.filesize(filesize)
//								.checkfile("Y")
//								.build();
//				
//				service.fileInfoRegistry(fileDTO);
	
			}
		}	
		
		
//	 try {
//            FrameGrab frameGrab = FrameGrab.createFrameGrab(NIOUtils.readableChannel((File) multipartFile));
//            double durationInSeconds = frameGrab.getVideoTrack().getMeta().getTotalDuration();
//            System.out.printf("Video length: {} seconds", durationInSeconds);
//            return durationInSeconds;
//        } catch (Exception e) {
//        	System.out.printf("Duration extract failed", e);
//        }

        return 0;
	}	
	
	//강좌 등록 화면 보기 (완)
	@GetMapping("/test/classCode")
	public void getClassCode(){}
	
	//클래스 코드 생성 테스트
	@ResponseBody
	@PostMapping("/test/classCode")
	public void postClassCode(){
		
		
		
	}
	
}
