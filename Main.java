import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static int[] answers = new int[11];
    static HashMap<String, Integer> scores = new HashMap<String, Integer>();
    static Scanner in = new Scanner(System.in);


    public static void asking(String[] questions){

        while(Main.answers[8]==0){
            for(int i = 0; i<9; i++){
                while(Main.answers[i]==0){
                    try{
                        System.out.println(questions[i]);
                        Main.answers[i] = in.nextInt();
                    }
                    catch(Exception e){
                        System.out.println("Please enter a valid input!");
                        in.next();
                    }
                }
            }
        }
    }
    
    public static void recommendation(){
        Data database = new Data();
        HashMap<String, ArrayList<Integer>> data = database.getData();
        for(String key: data.keySet()){
            ArrayList<Integer> list = data.get(key);
            for(int i=0;i<9;i++){
                if(i==0){ // if question = 1
                    if((list.get(0)==1) || (list.get(0)==2 && answers[0]>=13 && answers[0]<= 19) || (list.get(0)==3 && answers[0]>=18)){
                        scores.put(key, 15); // add score +15 for age
                    }
                    else{
                        scores.put(key, 0);
                    }
                } else if(i==1){ // if question = 2
                    if(list.get(1)==1 && answers[1]<=1){ // short and 0-1hr >
                        scores.put(key, scores.get(key)+5);
                    } else if(list.get(1)==2 && answers[1]<=3 && answers[1]>=1){ // medium and 1-3hr
                        scores.put(key, scores.get(key)+5);
                    } else if(list.get(1)==3 && answers[1]>=2){ // long and 2+
                        scores.put(key, scores.get(key)+5);
                    }
                } else if(i==2){ // if question = 3
                    if((list.get(2)==1) || (list.get(2)==2 && answers[2]==1) || (list.get(2)==3 && answers[2]==2) || (list.get(2)==4 && answers[2]!=3)){
                        scores.put(key, scores.get(key)+20); // add score +20 for platform
                    }
                } else if(i==3){ // if question = 4
                    if(list.get(3)==answers[3]){
                        scores.put(key, scores.get(key)+10); // add score +10 for genre
                    }
                } else if(i==4){ // if question = 5
                    if(list.get(4)!=answers[4]){
                        scores.put(key, scores.get(key)+10); // add score +10 for money
                    }
                } else if(i==5){ // if question = 6
                    if((list.get(5)==3) || (list.get(5)==1 && 2==answers[5]) || (list.get(5)==2 && 1==answers[5])){
                        scores.put(key, scores.get(key)+10); // add score +10 for multi/single
                    }
                } else if(i==6){ // if question = 7
                    if(list.get(6)!=answers[6]){
                        scores.put(key, scores.get(key)+10); // add score +10 for graphics
                    }
                } else if(i==7){ // if question = 8
                    if(list.get(7)==answers[7]){
                        scores.put(key, scores.get(key)+5); // add score +5 for esports
                    }
                } else if(i==8){ // if question = 9
                    if(list.get(8)==answers[8]){
                        scores.put(key, scores.get(key)+5); // add score +5 for competitive
                    }
                }

            } // end of if loop

        } // end of each game score calc

    }

    public static void topThree(){
        String greatest = "";
        for(int i=0; i<3;i++){

        
            for(String key: scores.keySet()){
                if(greatest.equals("")){
                    greatest = key;
                }
                if (scores.get(key)>scores.get(greatest)){
                    greatest = key;
                }
            }
            System.out.println(i+1 + ": " + greatest + " (" + (int)((scores.get(greatest)/90.0)*100) + "%)");
            scores.remove(greatest);
            greatest = "";
            
        }
        
    }

    public static void main(String[] args){
         Questions questions = new Questions();
         Main.asking(questions.getQuestions());
        Main.recommendation();
        Main.topThree();
    } 

}