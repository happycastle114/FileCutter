import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class Cutter {
    public void cutter(String orignal, int amount) {
        try {
            Vector<String> liner = new Vector<String>();
            File file = new File(orignal);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufReader.readLine()) != null) {
                liner.add(line);
            }
            int counter = 0;
            WriteToFile writeToFile = new WriteToFile();
            int amountinone = (liner.size() / amount);
            for (int i = 0; i < (amount - 1); i++) {
                for (int k = 0; k < amountinone; k++) {
                    writeToFile.write(liner.get(counter), "outis/part" + i);
                    counter++;
                }
            }
            int left = liner.size() - counter;
            for (int k = counter; k < liner.size(); k++) {
                writeToFile.write(liner.get(k), "outis/part" + (amount - 1));
            }
            System.out.println("Okay. Finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
