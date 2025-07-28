package array;

public class CardConvRev {
    static int cardConvR(int x, int r, char[] d){
        int digits=0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWYZ";

        do{
            d[digits++]=dchar.charAt(x%r);
            x/=r;
        }while(x!=0);
        return digits;
    }

    //정수 x를 기수 r진수로 변환한 값을 배열 d에 저장해놓고
    //그 자릿수(배열을 넣어둔 문자 수)를 반환


}
