package io.openmessaging.demo;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/**
 * Created by tuzhenyu on 17-5-20.
 * @author tuzhenyu
 */
public class Main {
    public static void main(String[] args) {
//        try {
//            FileInputStream in = new FileInputStream("/home/tuzhenyu/tmp/race2/QUEUE10.txt");
////            FileInputStream in = new FileInputStream("/home/tuzhenyu/tmp/test/QUEUE_10.txt");
//            FileChannel fc = in.getChannel();
//            MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
//
//            while (buffer.position()<buffer.capacity()){
//                byte[] headerProperties = new byte[buffer.getInt()];
//                buffer.get(headerProperties);
//                System.out.println(new String(headerProperties));
//                byte[] body = new byte[buffer.getInt()];
//                buffer.get(body);
//                System.out.println(new String(body));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        String headerProperties = "HEADER_KEY h2c2bd3ib4 91y evq5vue vmy 8nrevr6 q6z e6512ic zxx e7a9zag Topic TOPIC_48 ,hbk rop8gj9 PRO_OFFSET PRODUCER0_0 4lq 9saulza rxe pnhmtui ";
        String[] str = headerProperties.split(",");
        String[] header = str[0].split(" ");
        System.out.println(Arrays.toString(header));
        for (int j = 0; j < header.length; j = j + 2) {
            System.out.println(header[j].split(" ")[0] + "-" + header[j + 1].split(" ")[0]);
        }
        if (str.length > 1) {
            String[] properties = str[1].split(" ");
            System.out.println(Arrays.toString(properties));
            for (int j = 0; j < properties.length; j = j + 2) {
                System.out.println(properties[j].split(" ")[0] + "-" + properties[j + 1].split(" ")[0]);
            }
        }
    }
}
