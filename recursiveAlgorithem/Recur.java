package recursiveAlgorithem;

import java.util.Scanner;
import stack.IntStack;

public class Recur {

    //재귀함수를 스택을 이용해 표현
    static void recur(int n){
        IntStack s = new IntStack(n);

        while(true){
            if(n>0){
                s.push(n);
                n = n-1;
                continue;
            }
            if(s.isEmpty()!=true){
                n=s.pop();
                System.out.println(n);
                n= n-2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        recur(x);
    }
}
