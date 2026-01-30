class Solution {
    private int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        return(sum);
    }

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = sum(x);
        if(x % sum == 0){
            return(sum);
        }

        return(-1);
    }
}
