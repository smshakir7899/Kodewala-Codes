interface Multiply {
void Sum (int x, int y);
}

public class Multiplication{
public static void main(String[] args){

Multiply obj =(int x, int y) ->
{
System.out.println(x*y);
};
obj.Sum(20,23);
}
}