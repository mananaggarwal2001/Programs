import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream locfile=new FileOutputStream("data.dat");
             FileChannel binchannel= locfile.getChannel()){
              byte[] outputbytes= "Hello World".getBytes(StandardCharsets.UTF_8);
              ByteBuffer buffer=ByteBuffer.allocate(100);
              buffer.put(outputbytes);
              long int1pos=outputbytes.length;
              buffer.putInt(245);
              long int2pos=int1pos+Integer.BYTES;
              buffer.putInt(-98765);
              byte[] outputbyte2= "Nice to meet you".getBytes(StandardCharsets.UTF_8);
              buffer.put(outputbyte2);
              long int3pos=int2pos + Integer.BYTES + outputbyte2.length;
              buffer.putInt(1000);
              buffer.flip();
              binchannel.write(buffer);
              RandomAccessFile randomAccessFile=new RandomAccessFile("data.dat","rwd");
              FileChannel channel = randomAccessFile.getChannel();

              ByteBuffer readBuffer=ByteBuffer.allocate(100);
              channel.position(int3pos);
              channel.read(readBuffer);
              readBuffer.flip();
              System.out.println("The String is " + readBuffer.getInt());

              readBuffer.flip(); // to clear the buffer
              channel.position(int2pos);
              channel.read(readBuffer);
              readBuffer.flip();
               System.out.println("The Integer is  " + readBuffer.getInt());

               readBuffer.flip();  // to clear the buffer
              channel.position(int1pos);
              channel.read(readBuffer);
              readBuffer.flip();
              System.out.println("The third integer is : " + readBuffer.getInt());

              readBuffer.flip();
              channel.position(0);
              channel.read(readBuffer);
              readBuffer.flip();

              RandomAccessFile randomAccessFile1=new RandomAccessFile("DataCopy.dat","rw");
              FileChannel copychannel=randomAccessFile1.getChannel();
              channel.position(0);
              long numbytescopied=copychannel.transferFrom(channel,0,channel.size());
              System.out.println("NumBytes Copied: " + numbytescopied);











//              ByteBuffer readBuffer=ByteBuffer.allocate(100);
//              channel.read(readBuffer);
//              readBuffer.flip();
//              byte[] inputString= new byte[outputbytes.length];
//              readBuffer.get(inputString);
//              System.out.println("Input String is " + new String(inputString));
//              System.out.println("int 1 "+ readBuffer.getInt());
//              System.out.println("Int 2 " + readBuffer.getInt());
//              byte [] inputString2 = new byte[outputbyte2.length];
//              readBuffer.get(inputString2);
//               System.out.println("String 2 : " + new String(inputString2));
//                System.out.println("Int3: " + readBuffer.getInt());




































//            byte[] hellobyte="Hello World".getBytes(StandardCharsets.UTF_8);
//           ByteBuffer buffer = ByteBuffer.wrap(hellobyte);  // backup storage  it will use the array as the backup size
//                                                            // changes to the buffer will be reflect back to the array.
//            int numbytes=channel.write(buffer);
//            hellobyte[0] ='a';
//            hellobyte[1] = 'b';
//            buffer.flip();
//            System.out.println("OutPut Byte is " + new String(hellobyte));
//            if(buffer.hasArray()){
//                System.out.println("Byte Buffer " + new String(buffer.array()));
//            }
//


            //            Path filepath = FileSystems.getDefault().getPath("Data.txt");
//            Files.write(filepath, "\nLine 5".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
//            List<String> list=Files.readAllLines(filepath);
//            for(String line: list){
//                System.out.println(line);
//
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
        } catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
