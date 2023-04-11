public class StrIn {
    void display(double a){
        System.out.println("Double!");
    }

    void display(String b){
        System.out.println("String!");
    }

    public static void main(String[] args) {
        StrIn sIn = new StrIn();
        sIn.display("dinali");
        sIn.display(45.23);

    }


}
