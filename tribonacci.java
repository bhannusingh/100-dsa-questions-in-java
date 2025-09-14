
public class tribonacci{
    public static void main(String[] args) {
        int n =5;

        if(n==0){
            System.out.println("0");
        }else if(n==1 || n==2){
            System.out.println("1");
        }

        int FirtTerm=0;
        int SecTerm=1;
        int thirdTerm=1;

        for(int i = 1;i<=n;i++){
            int forthTerm= FirtTerm+SecTerm+thirdTerm;

           FirtTerm=SecTerm;
           SecTerm=thirdTerm;
           thirdTerm=forthTerm;

        }
        System.out.println(FirtTerm);
    }
}