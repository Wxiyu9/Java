package MoiveDemo;

public class test {
    public static void main(String[] args)
    {
        moive[] mv = new moive[3];
        mv[0] = new moive(1,"aa","99",2022,"wang");
        mv[1] = new moive(2,"bb","99",2022,"wang");
        mv[2] = new moive(3,"cc","99",2022,"wang");
        MoiveOperate operate = new MoiveOperate();
        operate.PrintAllMoive(mv);
        operate.SearchById(4);
    }
}
