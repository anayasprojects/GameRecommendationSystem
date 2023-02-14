public class Questions {

    String[] questions;

    public Questions () {
        questions =  new String[11];
        questions[0] = "What is your age?";
        questions[1] = "How many hours a day do you game, on average?";
        questions[2] = "Which of the following platforms do you prefer? \n" +
        "1: Console, 2: PC, 3: Mobile";
        questions[3] = "What genre do you prefer? \n" +
        "1: First Person Shooter, 2: Sandbox, 3: Survival, 4: Fighting, or 5: Role Playing Games";
        questions[4] = "Would you like to spend money? \n" +
        "1: Yes, 2: No";
        questions[5] = "Do you prefer multiplayer or singleplayer? \n" +
        "1: Multiplayer, 2: Singleplayer";
        questions[6] = "Do you value good graphics? \n" +
        "1: Yes, 2: No";
        questions[7] = "Do you partake in E-Sports? \n" +
        "1: Yes, 2: No";
        questions[8] = "Do you prefer competitive games? \n"+
        "1: Yes, 2: No";
    }

    public String[] getQuestions(){
        return questions;
    }

}
