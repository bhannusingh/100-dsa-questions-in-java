public class powerOfTwo {
    public static void main(String[] args) {
        int n = 128;//target

        //code

        if( n<1){
            System.out.println("its is not possible");
        }else if (n==1){
            System.out.println("it is power of two");
        }else{
            while( n%2==0){
                n=n/2;
            }
            if(n==1){
                System.out.println("it is 2's square");

            }else{
                System.out.println("its not square of 2");
            }
        }
    }
    
}
