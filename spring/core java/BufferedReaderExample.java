import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name");
        String name= br.readLine();
        int num=Integer.parseInt(br.readLine());
        System.out.println(name);
        System.out.print(num);
    }
}

