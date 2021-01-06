/*
1)what is enum
2)using enum with switch
3)creating variables and methods inside enum
4)giving values to constants
 */
enum Mobile{
    APPLE(50),SAMSUNG;
    //We can create variables and methods inside enum as well
    int price;
    //Default constructor
    Mobile(){
        price = 80;
    }
    //Parameterised constructr
    Mobile(int p){
        price = p;
    }
    public int getPrice()
    {
        return price;
    }
}
/* // creating an enum or a class with static final is a same thing
class Mobile
{
    static final Mobile APPLE = new Mobile();
    static final Mobile SAMSUNG = new Mobile();
    static final Mobile HTC = new Mobile();

}

 */
public class enumExample {
    public static void main(String[] args) {
        System.out.println(Mobile.APPLE.getPrice());
        Mobile m = Mobile.APPLE;
        switch(m)
        {
            case APPLE:
                System.out.println("Apple");
                break;
            case SAMSUNG:
                System.out.println("samsung");
                break;
        }
    }
}
