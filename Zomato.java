class Zomato
{
 static void selectpizza()
  {
   placeorder("Veg Burst");
  }
 static void placeorder(String pizza)
  {
   System.out.println("ordered pizza is " + pizza);
   pizzahut(pizza);  
  }
 static void pizzahut(String pizzatype)
  {
   coockPizzaAndDeliver(pizzatype);
  }
 static String coockPizzaAndDeliver(String coockpizza)
  {
    System.out.println("Pizza is coocked and delivered");
    return "coockpizza";
  }
   public static void main(String[] args)
   {
     selectpizza();
   }
}






















