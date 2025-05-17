package Quiz_Console_App;

public class QuestionService {
    Question question[] = new Question[5];
    public QuestionService(){
        question[0] = new Question(1, "Which of the following is not a Java keyword?",
                "class", "interface", "delete", "extends", "delete");

        question[1] = new Question(2, "What is the size of an int variable in Java?",
                "4 bytes", "2 bytes", "8 bytes", "Depends on system", "4 bytes");

        question[2] = new Question(3, "Which method is the entry point of a Java program?",
                "start()", "main()", "run()", "init()", "main()");

        question[3] = new Question(4, "Which data structure uses FIFO order?",
                "Stack", "Queue", "Tree", "Graph", "Queue");

        question[4] = new Question(5, "Which of these is not a primitive data type in Java?",
                "int", "float", "boolean", "String", "String");
    }
    public void displayQuestions(){
        for (Question q : question ){
            System.out.println(q.toString());
        }
    }
}
