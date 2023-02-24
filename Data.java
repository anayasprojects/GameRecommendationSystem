import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    HashMap<String, ArrayList<Integer>> data = new HashMap<String, ArrayList<Integer>>();
    
    public Data() {

        initializeData();

    }

    public void initializeData(){

        ArrayList<Integer> GTA5 = new ArrayList<>(Arrays.asList(2,2,4,1,2,3,2,1,1));
        data.put("GTA5", GTA5);
        ArrayList<Integer> Minecraft = new ArrayList<>(Arrays.asList(1,1,1,2,1,3,1,2,2));
        data.put("Minecraft", Minecraft);
        ArrayList<Integer> Fortnite = new ArrayList<>(Arrays.asList(2,2,1,1,1,3,2,1,1));
        data.put("Fortnite", Fortnite);
        ArrayList<Integer> League = new ArrayList<>(Arrays.asList(2,2,3,1,1,2,2,1,1));
        data.put("League", League);
        ArrayList<Integer> Rocket = new ArrayList<>(Arrays.asList(2,2,4,1,1,2,2,1,1));
        data.put("Rocket", Rocket); // last one
        ArrayList<Integer> CSGO = new ArrayList<>(Arrays.asList(2,2,3,1,1,2,2,1,1));
        data.put("CSGO", CSGO);
        ArrayList<Integer> Apex = new ArrayList<>(Arrays.asList(2,2,2,1,1,2,2,1,1));
        data.put("Apex", Apex);
        ArrayList<Integer> Smash = new ArrayList<>(Arrays.asList(1,1,2,4,2,2,2,2,1));
        data.put("Smash", Smash);
        ArrayList<Integer> COD = new ArrayList<>(Arrays.asList(2,2,1,1,1,3,2,1,1));
        data.put("COD", COD);
        ArrayList<Integer> AmongUs = new ArrayList<>(Arrays.asList(1,1,1,3,1,2,1,2,1));
        data.put("AmongUs", AmongUs);
        ArrayList<Integer> Zelda = new ArrayList<>(Arrays.asList(1,1,2,5,2,1,2,2,2));
        data.put("Zelda", Zelda);
        ArrayList<Integer> Rainbow = new ArrayList<>(Arrays.asList(2,2,2,1,1,3,2,1,1));
        data.put("Rainbow", Rainbow);
        ArrayList<Integer> FallGuys = new ArrayList<>(Arrays.asList(1,1,1,3,1,2,2,2,1));
        data.put("FallGuys", FallGuys);
        ArrayList<Integer> AnimalCrossing = new ArrayList<>(Arrays.asList(1,3,2,2,1,1,1,2,2));
        data.put("AnimalCrossing", AnimalCrossing);
        ArrayList<Integer> GenshinImpact = new ArrayList<>(Arrays.asList(1,2,1,5,1,1,2,2,2));
        data.put("GenshinImpact", GenshinImpact);
        ArrayList<Integer> MarioKart = new ArrayList<>(Arrays.asList(1,1,2,4,1,1,2,1,2,1));
        data.put("MarioKart", MarioKart);
        ArrayList<Integer> Pokemon = new ArrayList<>(Arrays.asList(1,1,2,5,1,1,1,2,2));
        data.put("Pokemon", Pokemon);
        ArrayList<Integer> ResidentEvil = new ArrayList<>(Arrays.asList(3,3,3,5,2,1,2,2,2));
        data.put("ResidentEvil", ResidentEvil);
        ArrayList<Integer> Horizon = new ArrayList<>(Arrays.asList(1,3,2,5,2,1,2,2,2));
        data.put("Horizon", Horizon);
        

        

    }

    public HashMap<String, ArrayList<Integer>> getData(){
        return data;
    }
}


/* 

Navigate to folder where git is initialized
Git status
Git add .
Git status
Git commit -m “your message her”
Git push
If alternative message shows up, use that


cd to enter folder
ls to list
cd . (to go back one folder)
cd .. (to return to home)
*/