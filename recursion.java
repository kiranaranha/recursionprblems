public int triangle(int rows) {
    if (rows == 0) {
        return 0;
    } else {
        return rows + triangle(rows - 1);
    }
}

public int fibonacci(int n){
    if(n==0||n==1){
        return n;
    }else{
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


public int countHi(String str) {
    if (str.length() < 2){
        return 0;
    }
    if (str.substring(0,2).equals("hi")){
        return 1 + countHi(str.substring(1));
    }else{
        return countHi(str.substring(1));
    }
}

public int sumDigits(int n){
    if(n == 0){
        return 0;
    }
    return n % 10 + sumDigits(n/10);
}


public int countAbc(String str) {
    if (str.length() < 3){
        return 0;
    }
    if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){
        return 1 + countAbc(str.substring(1));
    }else{
        return countAbc(str.substring(1));
    }
}

public int countPairs(String str) {
    if (str.equals("") || str.length() < 3){
        return 0;
    }
    if (str.charAt(0) == str.charAt(2)){
        return 1 + countPairs(str.substring(1));
    }else{
        return countPairs(str.substring(1));
    }
}

public int count7(int n) {
    if (n < 7){
        return 0;
    }else if ( 7 == n % 10){
        return 1 + count7(n / 10);
    } else {
        return 0 + count7(n / 10);
    }
}

public int bunnyEars2(int bunnies) {
    if (bunnies == 0){
        return 0;
    }
    if (bunnies % 2 == 0){
        return 3 + bunnyEars2(bunnies-1);
    } else {
        return 2 + bunnyEars2(bunnies-1);
    }
}