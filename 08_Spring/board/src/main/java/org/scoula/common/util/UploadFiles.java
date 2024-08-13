package org.scoula.common.util;

import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

public class UploadFiles {
    public static String upload(String baseDir, MultipartFile part) throws IOException {

        // 기본 디렉토리가 있는지 확인, 없으면 새로 생성
        File base = new File(baseDir);
        // exists 메소드로 해당 경로가 존재하는지 체크
        if(!base.exists()) {
            base.mkdirs(); // mkdirs : 중간에 존재하지 않는 디렉토리까지 모두 생성
        }
        String fileName = part.getOriginalFilename(); // 원본파일명 저장
//        base Directory 내에 고유한 이름을 가지는 파일 생성
        File dest = new File(baseDir, UploadFileName.getUniqueName(fileName));
        part.transferTo(dest); // 지정한 경로로 업로드 파일 이동
        return dest.getPath(); // 저장된 파일 경로 리턴
    }


    // 파일 크기를 사람이 읽기 쉬운 형식으로 변환
    // 1,225,957 바이트 -> "1.2 MB"
        public static String getFormatSize(Long size) {
            if (size <= 0)
                return "0";
            // 파일의 크기를 나타낼 단위를 정의(Bytes, KB, MB, GB, TB)
            final String[] units = new String[] { "Bytes", "KB", "MB", "GB", "TB" };
            // 파일 크기가 어느 단위에 속하는지 계싼 (예 : KB, MB 등)
            int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
            // 파일 크기를 계산된 단위로 반환하고 포맷팅하여 문자열로 반환
            return new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
        }
}
