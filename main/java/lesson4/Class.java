package lesson4;

public class Class {
    public int myMethod(int a, int b, int c) throws MyException {
        if(a<0 || b<0 || c<0) throw new MyException("Текст моей ошибки");
        int result = a+b+c;
        return result;
    }
}
