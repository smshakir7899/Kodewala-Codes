interface Square{
void Sum (int x);
}

public class SquareNumber {
public static void main(String[] args){
Square obj =(int x) ->
{
System.out.println(x*x);
};

obj.Sum(20);
}
} 