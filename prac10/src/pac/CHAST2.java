package pac;

public class CHAST2 {
    //  1-1:true
    //2:false
    //3:true
    //  2-1:true
    //2:false
    //3:"list равно [Новосибирск, Астрахань]"
    //4:"list1 равно [Новосибирск, Астрахань]"
    //5:"list2.get(0) равно Новосибирск"
    //6:"list2.size() равно 1"
    //  3-Метод clone() не может быть вызван напрямую на объекте x,
    //так как класс GeometricObject
    //должен реализовывать интерфейс Cloneable и переопределять метод clone().
    //Без этого компилятор выдаст ошибку.Нужно добавить implements Cloneable к классу GeometricObject
    //и переопределить метод clone().
    //  4-public class Test {
    //  public static void main(String[] args) {
    //    House house1 = new House(1, 1750, 50);
    //    House house2 = (House)house1.clone();
    //    System.out.println(house1.equals(house2));<-- скобка нужна была
    //  }
    //}
    //  5-Утверждения 1 2 3 и 5 правильные.
    //4  неверно. Интерфейс не может наследоваться от абстрактного класса.
}
