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
    int count = 0;
    for (int i = 0; i < str.length()-1; i++){}
        if (str.substring(i, i+2).equals("hi"))
        count += 1;
        return count;
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

