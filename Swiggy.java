class Swiggy
{
 static void selectPizza()
 {
   placeOrder("VegBurst");
 }
 static void placeOrder(String pizza)
 {
   System.out.println("Order place successfully" + pizza);
   pizzaHut(pizza);
 }
 static void pizzaHut(String pizzatype)
 {
   coockpizzaAndDispatch(pizzatype);
 }
 static String coockpizzaAndDispatch(String pizzatocoock )
 {
   System.out.println("Pizza coocked and delivered successfully");
   return "pizzatocoock";
 }
 public static void main(String[] args)
 {
   selectPizza();
 
 }
}