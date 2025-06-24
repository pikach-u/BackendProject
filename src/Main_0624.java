//250624 File-IO

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main_0624 {
    public static void writeFile(String filename, String content){
        Path filePath = Paths.get(filename);

        try(FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE,StandardOpenOption.WRITE)){
            //파일 경로, 파일이 없다면 생성, 쓰기 모드
            ByteBuffer buffer = ByteBuffer.allocate(1024);  //1kb 한번 옮기는 바구니
            buffer.put(content.getBytes()); //그냥 String으로 넣으면 X
            //System.out.println("Byte Content: " + Arrays.toString(content.getBytes()));
            buffer.flip();
            writeChannel.write(buffer);
            System.out.println("파일을 성공적으로 작성했습니다.");

        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(filePath);
    }
    public static void main(String[] args) {
        writeFile("dinner-menu.txt", "오늘의 저녁 메뉴는 뭘까요?");
    }
}
