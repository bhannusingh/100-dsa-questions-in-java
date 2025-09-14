public class fibon {
public static void main(String[] args) {
    int n =6;
if(n==0){
    System.err.println("0");
}else if(n==1){
    System.out.println("1");
}
    int FirtTerm=0;
    int SecTerm =1;

    for(int i =1;i<=n;i++){
        int thirdTerm = FirtTerm+SecTerm;

        FirtTerm= SecTerm;
        SecTerm=thirdTerm;
    }
    System.out.println(FirtTerm);
    }   
}
