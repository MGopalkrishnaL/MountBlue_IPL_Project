import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String line ="";
        String splitby = ",";
        BufferedReader IPL = null;
        try {
            IPL = new BufferedReader(new FileReader("/home/gopal2001/Desktop/MountBlue/java-koans/IPL_Assignment_1-MountBlue/src/deliveries.csv"));
                IPL.readLine();
            while((line=IPL.readLine())!=null){
                String [] del = line.split(splitby);
                ConvertingStringToObject.listOfDeliveries(del);
            }
        }catch (IOException file){
           System.out.println("Check the file Path");
           file.printStackTrace();
        }
        try{
            IPL = new BufferedReader(new FileReader("/home/gopal2001/Desktop/MountBlue/java-koans/IPL_Assignment_1-MountBlue/src/matches.csv"));
            IPL.readLine();
            while((line= IPL.readLine())!=null){
                String [] mat = line.split(splitby);
                ConvertingStringToObject.listOfMatches(mat);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
//        Scenario6.solution(ConvertingStringToObject.deliveryList);
        Scenario_1.getTotalMatchesPlayedInIPL(ConvertingStringToObject.matchesList);
    }

}