import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DecompressorService {

    public void decompressFile(String inputPath, String outputPath) {

        try {
            FileInputStream inputFile = new FileInputStream(inputPath);
            FileOutputStream outputFile = new FileOutputStream(outputPath);


            InflaterInputStream decompressor = new InflaterInputStream(inputFile);

            System.out.println("Decompressing file. This may take a few moments.");
            byte b[] = new byte[1];
            while(decompressor.read(b, 0, 1) != -1) {
                outputFile.write(b);
                outputFile.flush();
            }
            inputFile.close();
            outputFile.close();
            decompressor.close();
        } catch (IOException e) {

        }

    }
}
