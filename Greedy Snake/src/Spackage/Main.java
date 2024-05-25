package Spackage;

public class Main {
    private Scene scene;

    public static void main(String[] args)
    {
        System.out.println("加載資源檔...");
        Scene scene = new Scene();
        scene.InitUI();
        scene.Run();
        System.out.println("遊戲開始...");
    }
}
