import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class CompressorService {

    public void compressFile(String inputPath, String outputPath) {

        try {
            FileInputStream inputFile = new FileInputStream(inputPath);
            FileOutputStream outputFile = new FileOutputStream(outputPath);

            DeflaterOutputStream compressor = new DeflaterOutputStream(outputFile);

            System.out.println("Compressing file. This may take a few moments.");
            int fileContents;
            while((fileContents=inputFile.read())!=-1) {
                compressor.write(fileContents);
            }

            inputFile.close();
            outputFile.close();
            compressor.close();

        } catch (IOException e) {

        }


    }
}
