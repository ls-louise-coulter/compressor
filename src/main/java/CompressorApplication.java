public class CompressorApplication {

    public static void main(String[] args) {

        CompressorService compressorService = new CompressorService();
        DecompressorService decompressorService = new DecompressorService();

        if(args.length < 3) {
            System.out.println("Invalid input");
        }

        String inputFile = args[1];
        String outputFile = args[2];

        if(args[0].equals("c")) {
            compressorService.compressFile(inputFile, outputFile);
        }
        else if(args[0].equals("d")) {
            decompressorService.decompressFile(inputFile, outputFile);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
