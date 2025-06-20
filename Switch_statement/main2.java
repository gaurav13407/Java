public class main2 {
    public static void main(String[] args){
        int score=85;
        String grade;
        int result=score/10;

        switch(result){
            case 10:
            grade="A";
            break;
            case 9:
            grade="A";
            break;
            case 8:
            grade="B";
            break;
            case 7:
            grade ="B";
            break;
            case 6:
            grade="C";
            break;
            case 5:
            grade="D";
            break;

            default:
            grade="F";
            break;
        }
        System.out.println("Grade is:"+grade);
    }    
}
