class Swiggyy
{
 static void selectpizza()
 {
   placeorder("Veg Burst");
   System.out.println("ordered pizza is " + pizza);
 
 }
 static void placeorder(String pizza)
 {
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
public static String main(String[] args)
{
  selectpizza();

}























}