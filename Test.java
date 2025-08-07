
// factorial of a number 
public class Test {

    public static int factorial(int n){
       if(n <=1){
        return 1;
       }
       else{
        return n*factorial(n-1);
       }   
    }


    public static void isPrime(int n){
        boolean ans=true;
        if(n<=1){
            System.out.println("Not prime number");
        }
        else if(n==2 || n==3){
            System.out.println("It is a prime number");
        }
        else{
            for(int i=2; i<=n/2; i++){
                if(n%i == 0){
                    
                    ans=false;
                    break;
                }
            }
            if(ans == true){

                System.out.println("It is prime number");
            }
            else{
                System.out.println("not prime number");
            }
        }
        
    }
    
    public static void isPalidrome(String str){
           int length = str.length();
           int i=0;
           int j=length-1;
           boolean flag = true;

           while(i<=j){
              if(str.charAt(i) != str.charAt(j)){
                flag=false;
                break;
              }
              i++;
              j--;
           }
           if(flag){
            System.out.println("\nThe given string is palindrome");
           }else{
            System.out.println("\nThe given string is not Palidrome");
           }
    }
    public static void main(String[] args) {
        int n=15;
        int fb1=0;
        int fb2=1;
        String str="iih";
        System.out.println(factorial(n));
        isPrime(n);
        
        
        System.out.println("Top "+n+" fibonacci number are - ");
        System.out.print(fb1 + " "+fb2+" ");
        for(int i=1; i<=n-2; i++){
            System.out.print( fb1+fb2+" ");
            int temp=fb1;
            fb1=fb2;
            fb2=temp+fb2;
        }

        //Palindrome check
        isPalidrome(str);

        int a =n;
        int count=0;
        int sum =0;
        while(a>0){
            count++;
            int temp=a%10; 
            sum=sum+temp;
           a /=10;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}


