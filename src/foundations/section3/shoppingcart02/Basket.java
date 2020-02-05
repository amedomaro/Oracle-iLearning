package foundations.section3.shoppingcart02;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Goods> goods = new ArrayList<>();

    protected void addGood(Goods good){
        goods.add(good);
    }

    protected void removeGood(Goods good){
        goods.remove(good);
    }

    public void printBasket(){
        double sum = 0;

        System.out.printf("%s wants to purchase: \n", Customer.getName());
        System.out.println("| Goods  | Color  | Count | Price |");
        System.out.println("-----------------------------------");
        for(Goods g : goods){
            System.out.printf("| %-6s | %-6s |   %-3d |  %-4.2f |\n",
                    g.getName(), g.getColor(),g.getCount(), (g.getCount() * g.getPrice()));
            sum += g.getCount() * g.getPrice();
        }
        System.out.println("-----------------------------------");
        System.out.printf("| Total cost with tax is: %-8.2f|\n", sum);

    }

}
