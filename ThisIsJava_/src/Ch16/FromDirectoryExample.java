package Ch16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    // Files의 정적 메소드인 list()를 이용해서 디렉토리 내용을 스트림 통해 읽고 콘솔에 출력
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/JavaProgramming/source");
        Stream<Path> stream = Files.list(path);
        stream.forEach( p-> System.out.println(p.getFileName()));
    }
}
