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
        for (int i = 0; i < str.length()-1; i++)
        if (str.substring(i, i+2).equals("hi"))
        count += 1;
        return count;
        }