package Spackage;

import java.util.Random;

public class Food
{
    private Scene GameUI;
    private Coordinate foodIndex; // 食物座標

    public Food(Scene GameUI)
    {
        this.GameUI = GameUI;   // 獲取母視窗
        this.ProduceFood();     
    }

    // 抽選座標上隨機位置
    public Coordinate randomCoor()
    {
        int rows = GameUI.Height; int cols = GameUI.Width;
        Random random = new Random();
        Coordinate reg;

        int x = random.nextInt(cols - 1);   // 0 - 19
        int y = random.nextInt(rows - 1);

        reg = new Coordinate(x, y);
        return reg;
    }

    private Coordinate ProduceFood()
    {
        return randomCoor();
    }

    public Coordinate GetFoodCoor()
    {
        return foodIndex;
    }


}
