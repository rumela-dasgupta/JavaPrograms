import java.io.*;

class RemovePythonComments {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("script.py");      
        FileWriter fw = new FileWriter("new.py");     

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;

        while ((line = br.readLine()) != null) {

           // line = line.trim();   // remove leading spaces for checking

            // 
            // full-line comments
            if (line.startsWith("#") || line.equals("")) {
                continue;
            }

            // Remove inline comments
            int index = line.indexOf("#");
            if (index != -1) {
                line = line.substring(0, index).trim();
            }

            // Write only if something remains
            if (!line.equals("")) {
                bw.write(line);
                bw.newLine();
            }
        }

        br.close();
        bw.close();

        System.out.println("Comments removed! Check new.py");
    }
}
