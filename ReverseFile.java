import java.io.*;

class ReverseFile {
    public static void main(String[] args) throws IOException {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Read file
        FileReader fr=new FileReader(inputfile);

        BufferedReader br = new BufferedReader(fr);
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }
        br.close();

        // Reverse
        content.reverse();

        //  output file
        FileWriter fw=new FileWriter(outputFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content.toString());
        bw.close();

        System.out.println("Reversed file created as " + outputFile);
    }
}
